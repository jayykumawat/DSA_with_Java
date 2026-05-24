package dsa.strings;

/*
PROBLEM:
Find longest common prefix among strings.

APPROACH:
Compare characters one-by-one.

TIME: O(n * m)
SPACE: O(1)
*/

public class LongestCommonPrefix {

    public static String longestPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            while (strs[i].indexOf(prefix) != 0) {

                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};

        System.out.println("Longest Prefix: " + longestPrefix(strs));
    }
}