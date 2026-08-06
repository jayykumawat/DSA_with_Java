package dsa.arrays;
import java.util.*;
public class subArraySumEqualToK {
    public static int subarraySum(int[] nums, int k) {
        int count=0;
        int currsum=0;

        Map<Integer,Integer>map=new HashMap<>();
        map.put(0, 1);

        for(int num:nums){
            currsum+=num;

            if(map.containsKey(currsum-k)){
                count+=map.get(currsum-k);
            }
            map.put(currsum,map.getOrDefault(currsum,0)+1);

        }
        return count;
    }
 public static void main(String[] args) {
    int[] nums = {1,2,3};
    int k=3;

    System.out.println(" the total number of subarrays whose sum equals to k: "+subarraySum(nums, k));
 }   
}
