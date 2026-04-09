package dsa.arrays;
/*
PROBLEM:
Find maximum element in array.

APPROACH:
Traverse array and track max.

TIME: O(n)
SPACE: O(1)
*/
public class MaxElement {
    public static int findMax(int[]arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[]arr={5,2,7,4,1};
        System.out.println("MAX:- "+findMax(arr));
    }
    
}
