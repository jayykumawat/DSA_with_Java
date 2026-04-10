package dsa.arrays;
/*
PROBLEM:
Given array and target, return indices of two numbers
such that they add up to target.

APPROACH:
Use HashMap to store (value → index)

TIME: O(n)
SPACE: O(n)
*/
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[]calculate(int[]arr,int target){
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            int complement=target-arr[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
    static void main(String[] args) {
        int[]arr={2,7,11,15};
        int target=9;
        int[]result=calculate(arr,target);
        System.out.println("Result is: "+ Arrays.toString(result));
    }
}
