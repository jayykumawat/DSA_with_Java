package basic_syntax;

/*
Problem:
Create a function that returns the maximum of two integers.

Approach:
- Create a static method max(a, b)
- Return the bigger value using ternary operator

Time Complexity: O(1)
Space Complexity: O(1)
*/
public class FunctionsBasics {

    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 25;

        System.out.println("Max = " + max(a, b));
    }
}
