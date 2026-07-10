package dsa.sorting;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
    int[] arr={3,2,1,-2,-3,-1};
    selectionSort(arr);    
    System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[]arr){
        for(int i=0;i<arr.length;i++){
            int LastIndex =arr.length-1;
            int smallIndex=findIndex(arr,i,LastIndex);
            sort(arr,smallIndex,i);
        }
    }
    public static int findIndex(int[]arr,int start,int last){
        int small=start;
        for(int i=start;i<=last;i++){
            if(arr[i]<arr[small]){
                small=i;
            }
        }
        return small;
    }
    public static void sort(int[]arr,int SmallIndex,int i){
        int temp=arr[SmallIndex];
        arr[SmallIndex]=arr[i];
        arr[i]=temp;
    }
}
