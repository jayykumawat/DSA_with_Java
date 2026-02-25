package exception_handling;

/*
Problem:
Demonstrate multiple catch blocks and finally block.

Concept:
- Multiple catch blocks handle different exceptions.
- finally block always executes (whether exception occurs or not).

Time Complexity: O(1)
Space Complexity: O(1)
*/

public class MultipleCatchFinallyDemo {

    public static void main(String[] args) {

        int numbers[] = {10, 20, 30};

        try {

            int result = numbers[5] / 0;  // Two possible exceptions
            System.out.println("Result: " + result);

        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Division by zero.");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception: Invalid index.");
        } 
        catch (Exception e) {
            System.out.println("General Exception caught.");
        } 
        finally {
            System.out.println("Finally block executed (Always runs).");
        }

        System.out.println("Program continues...");
    }
}
