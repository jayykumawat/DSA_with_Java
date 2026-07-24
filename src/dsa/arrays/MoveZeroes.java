package dsa.arrays;

import java.util.Arrays;

/*
PROBLEM:
Move all zeroes to end while maintaining order.

APPROACH:
Use a write pointer (array compaction).

1. Traverse the array.
2. Copy every non-zero element to the next available position.
3. Fill the remaining positions with zeros.


TIME: O(n)
SPACE: O(1)
*/

public class MoveZeroes {

    public static void moveZeroes(int[] arr) {

        int index = 0;

        // Move non-zero elements forward
        for (int num : arr) {
            if (num != 0) {
                arr[index] = num;
                index++;
                
            }
        }

        // Fill remaining positions with zeroes
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12};

        moveZeroes(arr);

        System.out.println(Arrays.toString(arr));
    }
}