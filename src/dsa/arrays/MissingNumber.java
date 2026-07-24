package dsa.arrays;

/*
PROBLEM:
Find missing number from array containing numbers 0 to n.

APPROACH:
Use expected sum - actual sum.

TIME: O(n)
SPACE: O(1)
*/

public class MissingNumber {

    public static int findMissing(int[] arr) {

        int n = arr.length;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        int[] arr = {3, 0, 1};

        System.out.println("Missing Number: " + findMissing(arr));
    }
}