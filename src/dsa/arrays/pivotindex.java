package dsa.arrays;
import java.util.*;
public class pivotindex {
    public static void main(String[] args) {
        int[] nums={1,7,3,6,5,6};
        System.out.println(" the pivot index of nums "+Arrays.toString(nums)+" is "+pivotIndex(nums));
    }
    public static int pivotIndex(int[] nums){

        int totalsum=0;
        for(int num:nums){
            totalsum+=num;
        }

        int leftsum=0;

        for (int i = 0; i < nums.length; i++) {
            int right=totalsum-leftsum-nums[i];

            if(leftsum==right){
                return i;
            }
            leftsum+=nums[i];
        }
        return -1;
    }
}
