package dsa.arrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int heights[]={1,2,3,4};
        int result=findContainer(heights);
        System.out.println("Maximum water store in the container are:- "+result);
    }
    public static int findContainer(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxarea=0;

        while (left<right) {
            int length=Math.min(height[left],height[right]);
            int width=right-left;
            int Area=length*width;
            maxarea=Math.max(maxarea,Area);

            if(height[left]<height[right])left++;
            else right--;
        }
    return maxarea;
    }
}
