package dsa.arrays.SlideWindowproblems;

import java.util.*;
public class withoutRepeatingcharacter {
    public static void main(String[] args) {
        String s="bbbbb";
        int maxlength=lengthOfLongestSubstring(s);
        System.out.println("The Longest Substring Without Repeating Character in "+s+" is "+maxlength);
    }
    public static int lengthOfLongestSubstring(String s){
        Map<Character,Integer>map=new HashMap<>();
        int left=0;
        int maxlength=0;

        for (int right = 0; right < s.length(); right++) {
            char currentchar=s.charAt(right);

            if(map.containsKey(currentchar)&&map.get(currentchar)>=left){
                left=map.get(currentchar)+1;
            }
            map.put(currentchar, right);
            maxlength=Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
}
