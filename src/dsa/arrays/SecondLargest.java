package dsa.arrays;
/*
PROBLEM:
Find second largest element.

APPROACH:
Track largest and second largest.

TIME: O(n)
SPACE: O(1)
*/
public class SecondLargest {
    public static int findSecondLargest(int[]arr){
        int largest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>largest){
                second=largest;
                largest=num;
            }
            else if(num>second&&num!=largest){
                second=num;
            }
        }
        return second;
    }
    public static void main(String[] args) {
        int arr[]={10,20,5,15,30};
        System.out.println("Second largest number in array is: "+findSecondLargest(arr));
    }
}
