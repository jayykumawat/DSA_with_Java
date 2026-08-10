package dsa.arrays;

import java.util.Arrays;

//LeetCode:-https://leetcode.com/problems/find-the-highest-altitude/description/

public class HighestAltitude {
    public static void main(String[] args) {
        int[]gain = {-5, 1, 5, 0, -7};
        System.out.println("the highest altitude of a point in:"+Arrays.toString(gain)+" is:- "+largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int currentAltitude = 0; 
        int maxAltitude = 0;    

        for (int g : gain) {
            currentAltitude += g; 
            
            if (currentAltitude > maxAltitude) {
                maxAltitude = currentAltitude;
            }
        }

        return maxAltitude;
    }
}
