package dsa.sorting;

import java.util.Arrays;

public class BubbleSort {
    static void sort(int[]arr){
        boolean Swapped;
        for(int i=0;i<arr.length;i++){
            Swapped=false;
            for (int j = 0; j < arr.length-1-i; j++) {
                
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                Swapped=true;
            }
            if(!Swapped){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={7,4,6,2,3,1,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
