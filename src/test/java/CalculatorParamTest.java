import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorParamTest {

    @ParameterizedTest(name = "{index} => expression={0}, expected={1}")
    @CsvSource({
            // Operații combinate: adunare, înmulțire, scădere, impartire
            "5+2*3-4, 7.0",
            "5-4/2+3, 6.0",

            // Împărțire simplă
            "6/2, 3.0",

            // Numere negative
            "-5+3, -2.0",
            "-3-6, -9.0",

            // Împărțire la zero (pozitiv / zero)
            "5/0, Infinity",

            // Împărțire la zero (negativ / zero)
            "-5/0, -Infinity",

            // Divizare număr pozitiv la unul negativ
            "8/-2, -4.0",

            // Divizare cu paranteză, pozitiv la negativ
            "8/(-2), -4.0",

            // Expresie invalidă
            "5++2, ERROR",

            // Minus la început
            "-2*3+4, -2.0",

            // Dubla negatie
            "5-(-2), 7.0",

            // Operații multiple înmulțire / împărțire
            "2*3/4*5, 7.5",

            // Zero în expresie
            "0*5+0/3, 0.0",

            // Litere în expresie (input invalid)
            "5+abc, ERROR",
            "a+3, ERROR",
            "a+a, ERROR",
    })
    void testCalculatorExpressions(String expression, String expected) {
        String result = Calculator.Run(expression);
        assertEquals(expected, result, "Failed for expression: " + expression);
    }
}