package dsa.arrays.SlideWindowproblems;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int[]arr = {2,1,5,1,3,2};
        int k = 3;
        int maxsum=cal(arr,k);
        System.out.println("Maximum Sum of contigous subarray of size: "+k+" is: "+maxsum);
    }
    public static int cal(int[]arr,int k){
        int windowsize=0;
        int maxsum=0;

        for (int i = 0; i < arr.length; i++) {
            windowsize+=arr[i];

            if(i>=k-1){
                maxsum=Math.max(windowsize,maxsum);
                windowsize-=arr[i-k+1];
            }
        }
        return maxsum;
    }
}
