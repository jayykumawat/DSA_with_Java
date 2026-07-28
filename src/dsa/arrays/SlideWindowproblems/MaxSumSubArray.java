package dsa.arrays.SlideWindowproblems;
/*
Problem Statement:-
Given an integer array arr[] and an integer k, find the maximum sum of any contiguous subarray of size k.

Approach:- 

I maintain a running sum for a fixed-size window. Instead of recalculating each window, I update the sum by adding the incoming element and removing the outgoing element. This allows me to process each element only once, giving an O(n) time and O(1) space solution.

Pattern:-
Sliding Window
Fixed Window

Time Complexity:- O(n);
Space Complexity:- O(1);
*/
public class MaxSumSubArray {
    public static void main(String[] args) {
        int[]arr = {5};
        int k = 1;
        // int maxsum=cal(arr,k);
        // System.out.println("Maximum Sum of contigous subarray of size: "+k+" is: "+maxsum);
        double maxsum=findMaxAverage(arr, k);
        System.out.println(maxsum);
    }
    public static double findMaxAverage(int[] nums, int k) {
        double windowsum=0;
        double maxsum=Double.NEGATIVE_INFINITY;

        for(int i=0;i<nums.length;i++){
            windowsum+=nums[i];

            if(i>=k-1){
                maxsum=Math.max(maxsum,windowsum);
                windowsum-=nums[i-k+1];
            }
        }
        return(maxsum/k);
    }
    // public static int cal(int[]arr,int k){
    //     int windowsize=0;
    //     int maxsum=0;

    //     for (int i = 0; i < arr.length; i++) {
    //         windowsize+=arr[i];

    //         if(i>=k-1){
    //             maxsum=Math.max(windowsize,maxsum);
    //             windowsize-=arr[i-k+1];
    //         }
    //     }
    //     return maxsum;
    // }
}
/*int n = nums.length;
        
        // Step 1: Manual Unroll - Pehle k elements ka sum fast calculate karo
        int currentSum = 0;
        int i = 0;
        while (i < k) {
            currentSum += nums[i++];
        }
        
        int maxSum = currentSum;

        // Step 2: Pointer based sliding window (Boils down to pure assembly instructions)
        while (i < n) {
            currentSum += nums[i] - nums[i - k];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            i++;
        }

        // Step 3: Exact 1-time Typecast & Division
        return (double) maxSum / k; */
