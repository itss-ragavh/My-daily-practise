package softsauve;

import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String input = "abccabcabb";//,input2="aaabbcdda";
        String result = longestSubstring(input);
//        String result1 = longestSubstring(input2);
        System.out.println("Output: " + result );//+" Output: " + result1);
    }

    public static String longestSubstring(String s) {
        int n = s.length();
        int start = 0, end = 0, maxLength = 0, startOfMax = 0;
        HashSet<Character> set = new HashSet<>();

        while (end < n) {
            char currentChar = s.charAt(end);
            if (!set.contains(currentChar)) {
                set.add(currentChar);
                end++;
                if (end - start > maxLength) {
                    maxLength = end - start;
                    startOfMax = start;
                }
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }

        return s.substring(startOfMax, startOfMax + maxLength);
    }
}
