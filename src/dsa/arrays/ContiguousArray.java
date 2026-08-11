package dsa.arrays;
import java.util.*;
public class ContiguousArray {
    public static void main(String[] args) {
        int[] nums = {0,1};
        System.out.println("the maximum length of a contiguous subarray with an equal number of 0 and 1 is "+findMaxLength(nums));

    }
     public static int findMaxLength(int[] nums){
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);

        int currentelement=0;
        int maxlength=0;

        for (int i = 0; i < nums.length; i++) {
            int var=(nums[i]==0)?-1:1;
            currentelement+=var;

            if(map.containsKey(currentelement)){
                int length=i-map.get(currentelement);
                maxlength=Math.max(maxlength,length);
            }else{
                map.put(currentelement,i);
            }
        }
        return maxlength;
     }
}
