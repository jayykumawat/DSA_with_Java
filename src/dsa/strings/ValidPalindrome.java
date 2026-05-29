package dsa.strings;

import java.util.Scanner;

public class ValidPalindrome {
    static boolean ispalindrome(String str){
      int left=0;
      int right=str.length()-1;

      while(left<right){
        while(left<right && !Character.isLetterOrDigit(str.charAt(left)))
        {
          left++;
        }
         while(left<right && !Character.isLetterOrDigit(str.charAt(right)))
        {
          right--;
        }
        if(Character.toLowerCase(str.charAt(left))!=Character.toLowerCase(str.charAt(right))){
          return false;
        }
        left++;
        right--;
      }
      return true;
      // while (left<right) {
      //   if(str.charAt(left)!=str.charAt(right)){
      //       return false;
      //   }
      //   left++;
      //   right--;
      // }
      // return true;
    }
    public static void main(String[] args) {
         
        String str= "A man, a plan, a canal: Panama";
        System.out.println("IS "+ str +" Palindrome: "+ispalindrome(str));

        
    }
}
