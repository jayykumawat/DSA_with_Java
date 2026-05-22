package dsa.strings;

import java.util.Scanner;

public class ValidPalindrome {
    static boolean ispalindrome(String str){
      int left=0;
      int right=str.length()-1;

      while (left<right) {
        if(str.charAt(left)!=str.charAt(right)){
            return false;
        }
        left++;
        right--;
      }
      return true;
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String to check is it palindrome or not");
       
        String str=sc.nextLine().toLowerCase();
        System.out.println("IS Palindrome: "+ispalindrome(str));

        sc.close();
    }
}
