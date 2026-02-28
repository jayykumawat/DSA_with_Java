package exception_handling;

/*
Problem:
Demonstrate basic try-catch exception handling.

Concept:
- Exceptions are runtime errors.
- try block contains risky code.
- catch block handles the exception.

Example:
Divide by zero causes ArithmeticException.

Time Complexity: O(1)
Space Complexity: O(1)
*/

public class TryCatchDemo {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            int result = a / b;  // Risky code
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception Caught: Cannot divide by zero.");
            System.out.println("Error Message: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}
