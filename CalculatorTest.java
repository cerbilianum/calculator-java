public class CalculatorTest {

    public static void main(String[] args) {

        java.util.List<Float> numbers = new java.util.ArrayList<>();
        numbers.add(5f);
        numbers.add(2f);
        numbers.add(3f);
        numbers.add(4f);

        java.util.List<String> operations = new java.util.ArrayList<>();
        operations.add("+");
        operations.add("*");
        operations.add("-");

        float expectedResult = 7.0f; // 5 + 2*3 - 4 = 7

        float actualResult = Calculator.finalResult;

        if (expectedResult == actualResult) {
            System.out.println("Test succeeded.");
        } else {
            System.out.println("Test failed. Expected: "
                    + expectedResult + " but got: " + actualResult);
        }
    }
}