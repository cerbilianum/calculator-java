public class RunTest {

    public static void main(String[] args) {

        // Arrange
        String expression = "5+2*3-4";
        String expectedResult = "7.0";

        // Act
        String actualResult = Calculator.Run(expression);

        // Assert
        if (expectedResult.equals(actualResult)) {
            System.out.println("Test succeeded.");
        } else {
            System.out.println("Test failed. Expected: "
                    + expectedResult + " but got: " + actualResult);
        }
    }
}