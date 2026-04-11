package dsa.arrays;
/*
PROBLEM:
Find maximum subarray sum.

APPROACH:
Keep current sum and reset if it becomes negative.

TIME: O(n)
SPACE: O(1)
*/
public class KadaneAlgorithm {
    public static void maxSubArray(int[]arr){
        int max=arr[0];
        int currentSum=0;
        int start=0;
        int end=0;
        int s=0;

        for(int num=0;num<arr.length;num++){
            currentSum+=arr[num];
            if(currentSum>max){
                max=currentSum;
                start=s;
                end=num;
            }
            if(currentSum<0){
                currentSum=0;
                s=num+1;
            }
        }
        System.out.println("Max Sum "+max);
        System.out.println("Start Index "+start);
        System.out.println("End Index "+end);

        System.out.println("Sub Array Elements: ");
        for (int i = start; i <=end; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        maxSubArray(arr);
        
    }
}



        

