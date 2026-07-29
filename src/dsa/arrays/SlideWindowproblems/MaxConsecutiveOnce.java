package dsa.arrays.SlideWindowproblems;
import java.util.*;
public class MaxConsecutiveOnce {
    public static void main(String[] args) {
       int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
       int k = 3;
       int maxlength=longestOnes(nums,k);
       System.out.println("The Maximum Number Of Consecutive 1s in "+Arrays.toString(nums)+" is:- "+maxlength);
    }
    public static int longestOnes(int[]nums,int k){
        int left=0;
        int zerocount=0;
        int maxlength=0;

        for (int right = 0; right < nums.length; right++) {
            if(nums[right]==0){
                zerocount++;
            }

            while(zerocount>k){
                if(nums[left]==0){
                    zerocount--;
                }
                left++;
            }
            maxlength=Math.max(maxlength, right-left+1);
        }
        return maxlength;
    }
}
