package dsa.arrays.SlideWindowproblems;

import java.util.*;
public class MinimumSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANAC";
        String t = "ABC";
        String minlength=minWindow(s, t);
        System.out.println(minlength);
    }
     public static String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        Map<Character,Integer>windowmap=new HashMap<>();
        Map<Character,Integer>needmap=new HashMap<>();
        
        for(char ch:t.toCharArray()){
            needmap.put(ch, needmap.getOrDefault(ch, 0)+1);
        }

        int left=0;
        int formed=0;
        int required=needmap.size();

        int minLen=Integer.MAX_VALUE;
        int start=0;

        for (int right = 0; right < s.length(); right++) {
           char current= s.charAt(right);
           windowmap.put(current,windowmap.getOrDefault(current,0)+1);

           if(needmap.containsKey(current)&&windowmap.get(current).equals(needmap.get(current))){
            formed++;
           }

           while(formed==required){
            if(right-left+1<minLen){
                minLen=right-left+1;
                start=left;
            }

            char leftchar=s.charAt(left);
            windowmap.put(leftchar,windowmap.get(leftchar)-1);

            if(needmap.containsKey(leftchar)&&windowmap.get(leftchar)<needmap.get(leftchar)){
                formed--;
            }
            left++;
           }
        }
        return minLen==Integer.MAX_VALUE?"":s.substring(start,start+minLen);
    }
}
