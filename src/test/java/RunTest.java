public class RunTest {

    public static void main(String[] args) {

        String expression = "5+2*3-4";
        String expectedResult = "7.0";

        String actualResult = Calculator.Run(expression);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test succeeded.");
        } else {
            System.out.println("Test failed. Expected: "
                    + expectedResult + " but received: " + actualResult);
        }
    }
}