package dsa.arrays;

import java.util.Arrays;

public class PrefixSumRangeQuery {
    public static int[]buildPrefix(int[]arr){
        int[]prefix=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        return prefix;
    }
    public static int rangeSum(int[]prefix,int R,int L){
        if(L==0)return prefix[R];
        return prefix[R]-prefix[L-1];
    }
    public static void main(String[] args) {
        int[]arr={2,4,6,8,10};
        System.out.println("Original Array "+Arrays.toString(arr));
        int[]prefix=buildPrefix(arr);
        System.out.println("Prefix Array: "+Arrays.toString(prefix));
        
        int l=0,r=3;
        System.out.println("Range from index "+l+" to "+r);
        System.out.println("Range Sum: "+rangeSum(prefix, r, l));
    }
}
