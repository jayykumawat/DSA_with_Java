package dsa.arrays.SlideWindowproblems;

import java.util.*;

public class LongestRepeatChar {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        int maxlength= characterReplacement(s,k);
        System.out.println("The Longest Repeating character is: "+maxlength);
    }
    public static int characterReplacement(String s,int k){
        Map<Character,Integer>map=new HashMap<>();
        int left=0;
        int maxfrequency=0;
        int maxlength=0;

        for (int right = 0; right < s.length(); right++) {
            char current=s.charAt(right);
            map.put(current,map.getOrDefault(current, 0)+1);
            maxfrequency=Math.max(maxfrequency,map.get(current));

            while((right-left+1)-maxfrequency>k){
                char leftelement=s.charAt(left);
                map.put(leftelement,map.get(leftelement)-1);
                if(map.get(leftelement)==0){
                    map.remove(leftelement);
                }
                left++;
            }
            maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
}
