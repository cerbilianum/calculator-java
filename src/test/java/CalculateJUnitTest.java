import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculateJUnitTest  {

    // 1️⃣ Test operații normale
    @Test
    void testSimpleExpression() {
        String result = Calculator.Run("5+2*3-4");
        assertEquals("7.0", result);
    }

    // 2️⃣ Test divizare normală
    @Test
    void testDivision() {
        String result = Calculator.Run("6/2");
        assertEquals("3.0", result);
    }

    // 3️⃣ Test numere negative
    @Test
    void testNegativeNumber() {
        String result = Calculator.Run("-5+3");
        assertEquals("-2.0", result);
    }

    // 4️⃣ Test divizare la zero
    @Test
    void testDivisionByZero() {
        String result = Calculator.Run("5/0");
        assertEquals("Infinity", result);
    }

    // 5️⃣ Test expresie invalidă (două operatori consecutivi)
    @Test
    void testInvalidExpression() {
        String result = Calculator.Run("5++2");
        assertEquals("ERROR", result);
    }

    // 6️⃣ Test combinație cu minus la început
    @Test
    void testStartingWithMinus() {
        String result = Calculator.Run("-2*3+4");
        assertEquals("-2.0", result);
    }

    // 7️⃣ Test combinație pozitiv și negativ
    @Test
    void testPositiveAndNegative() {
        String result = Calculator.Run("5-(-2)");
        assertEquals("7.0", result);
    }

    // 8️⃣ Test mai multe operații de împărțire și înmulțire
    @Test
    void testMultipleMultiplicationsDivisions() {
        String result = Calculator.Run("2*3/4*5");
        assertEquals("7.5", result);
    }

    // 9️⃣ Test cu zero în expresie
    @Test
    void testZeroInExpression() {
        String result = Calculator.Run("0*5+0/3");
        assertEquals("0.0", result);
    }

    // 🔟 Test invalid cu litere
    @Test
    void testLettersInExpression() {
        String result = Calculator.Run("5+abc");
        assertEquals("ERROR", result);
    }
}