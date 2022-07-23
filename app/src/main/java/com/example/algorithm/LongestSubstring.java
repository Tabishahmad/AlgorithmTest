package com.example.algorithm;

public class LongestSubstring {
    public static void main(String[] args){
        String  N = "bbbbbbb";
        LongestSubstring longestSubstring = new LongestSubstring();
        int result = longestSubstring.lengthOfLongestSubstring(N);
        System.out.println("N " + N + " lengthOfLongestSubstring " + result);
    }
    public int lengthOfLongestSubstring(String str) {
        String test = "";
        int maxLength = -1;
        if (str.isEmpty()) {
            return 0;
        }
        // Return one if string length is one
        else if (str.length() == 1) {
            return 1;
        }
        for (char c : str.toCharArray()) {
            String current = String.valueOf(c);

            // If string already contains the character
            // Then substring after repeating character
            if (test.contains(current)) {
                test = test.substring(test.indexOf(current) + 1);
            }
            test = test + c;
            maxLength = Math.max(test.length(), maxLength);
        }
        return maxLength;
    }
}
