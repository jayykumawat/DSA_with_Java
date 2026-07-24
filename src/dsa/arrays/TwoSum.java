package dsa.arrays;
/*
PROBLEM:
Given array and target, return indices of two numbers
such that they add up to target.

APPROACH:
Use HashMap to store (value → index)

TIME: O(n)
SPACE: O(n)

PROBLEM:
Given a sorted array and a target, return the 1-based indices
of two numbers whose sum equals the target.

APPROACH:
Use Two Pointers.

TIME: O(n)
SPACE: O(1)

*/
import java.util.Arrays;


public class TwoSum {
    public static int[]calculate(int[]arr,int target){
       int left =0;
       int right=arr.length-1;
       int sum=0;
       while(left<right){
           sum=arr[left]+arr[right];
           
           if(sum==target){
               return new int[]{left+1,right+1};
           }
           else if(sum<target){
               left++;
           }
           else{
               right--;
           }
       }
        return new int[]{-1,-1};
    }
   
    // Works only because the array is sorted
    static void main(String[] args) {
        int[]arr={2,7,11,15};
        int target=9;
        int[]result=calculate(arr,target);
        System.out.println("Result is: "+ Arrays.toString(result));
    }
}
