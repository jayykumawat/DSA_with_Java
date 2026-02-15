package basic_syntax;

/*
Problem:
Given an integer number, print whether it is Positive, Negative, or Zero.

Approach:
- Use if-else ladder:
  if num > 0 -> Positive
  else if num < 0 -> Negative
  else -> Zero

Time Complexity: O(1)
Space Complexity: O(1)
*/
public class IfElseDemo {
    public static void main(String[] args) {
        int num = -7;

        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
