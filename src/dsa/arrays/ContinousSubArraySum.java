package dsa.arrays;

import java.util.HashMap;
import java.util.Map;

public class ContinousSubArraySum {
    public static void main(String[] args) {
       int[] nums = {23,2,4,6,7};
       int k = 6;
       System.out.println("Is there any continuous subarray of size 2 whose elements sum up to "+k+":- "+checkSubarraySum(nums,k));
    }
    public static boolean checkSubarraySum(int[] nums, int k){

        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);

        int runningsum=0;
        for (int i = 0; i < nums.length; i++) {
            runningsum+=nums[i];

            int remainder=runningsum%k;

            if(map.containsKey(remainder)){
                if(i-map.get(remainder)>=2){
                    return true;
                }
            }else{
                map.put(runningsum,i);
            }
         }
        return false;
    }
}
