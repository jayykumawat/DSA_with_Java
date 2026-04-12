package dsa.arrays;

/*
PROBLEM:
Find element that appears more than n/2 times.

APPROACH:
Boyer-Moore Voting Algorithm

TIME: O(n)
SPACE: O(1)
*/

public class MajorityElement {

    public static int findMajority(int[] arr) {

        int candidate = 0;
        int count = 0;

        for (int num : arr) {

            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 2, 2, 2};

        System.out.println("Majority Element: " + findMajority(arr));
    }
}