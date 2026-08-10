package dsa.arrays;

import java.util.Arrays;

public class LrSumDifference {
    public static void main(String[] args) {
        int[]nums = {10,4,8,3};
        int[] result= leftRightDifference(nums);
        System.out.println(Arrays.toString(result));
    }
    public static int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        int[] answer = new int[n];
        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            int rightSum = totalSum - leftSum - nums[i];

            answer[i] = Math.abs(leftSum - rightSum);

            leftSum += nums[i];
        }

        return answer;
    }
}
