package basic_syntax;

/*
Problem:
Find the sum of first N natural numbers using a loop.

Example:
N = 5
Sum = 1 + 2 + 3 + 4 + 5 = 15

Approach:
- Use a for loop from 1 to N
- Add each number to sum

Time Complexity: O(N)
Space Complexity: O(1)
*/
public class LoopsPractice {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}
