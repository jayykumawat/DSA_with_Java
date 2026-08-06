package dsa.arrays;

import java.util.Arrays;

public class PrefixSumRangeQuery {
    private  static int[]prefix;
    public static void numArray(int[]arr){
       int n=arr.length;
       prefix=new int[n+1];
       
       for (int i = 0; i <n; i++) {
        prefix[i+1]=prefix[i]+arr[i];
       }
        }
       public static int sumRange(int left,int right){
        return prefix[right+1]-prefix[left];
    }
      public static void main(String[] args) {
        int[]nums={-2, 0, 3, -5, 2, -1};
        numArray(nums);
        System.out.println(" the sum of the elements of arr between indices left and right is: "+sumRange(2, 5));
    }
}
