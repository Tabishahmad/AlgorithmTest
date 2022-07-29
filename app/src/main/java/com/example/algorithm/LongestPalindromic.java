package com.example.algorithm;

public class LongestPalindromic {
    private int lo, maxLen;
    public static void main(String[] args){
        String  N = "ac";
        LongestPalindromic longestSubstring = new LongestPalindromic();
        String result = longestSubstring.longestPalindrome(N);
        System.out.println(" longestPalindrome " + result);
    }
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2)
            return s;
//        if(len == 2){
//            if(s.charAt(0) == s.charAt(1)){
//                return s;
//            }else{
//                return ""+s.charAt(0);
//            }
//        }
//        int increase = 0;
//        if(len % 2 == 0) {
//            increase = 1;
//        }
        for (int i = 0; i < len-1; i++) {
            extendPalindrome(s, i, i);
            extendPalindrome(s, i, i+1); //assume even length.
        }
        return s.substring(lo, lo + maxLen);
    }
    private void extendPalindrome(String s, int j, int k) {
//        int a1 = j;
//        int b1 = k;
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        int z = (k-j-1);
        //System.out.println("a1 " + a1 + " b1 " +b1 + " j " + j + " k "+ k + " maxLen" + maxLen + " z " + z + " str " + s.substring(lo, lo + maxLen));
        if (maxLen < z) {
            lo = j + 1;
            maxLen = z;
        }
//        System.out.println(" maxLen " + maxLen + " lo "+ lo);
    }
}
