package dsa.strings;

import java.util.HashMap;

/*
PROBLEM:
Find first non-repeating character index.

APPROACH:
Store frequency using HashMap.

TIME: O(n)
SPACE: O(n)
*/

public class FirstUniqueCharacter {

    public static int firstUniqueChar(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Find first unique character
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        String str = "lleetcode";

        System.out.println("First Unique Index: " + firstUniqueChar(str));
    }
}