package com.example.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ATOI {
    static int count = 0;
    public static void main(String[] args){
        String  N = "-123";
        ATOI atoi = new ATOI();
        int result = atoi.findDifferenceValue("ksrek","ksrek");
//        int result = atoi.findDifferenceValue("A","B");
        System.out.println(" result " + result + " count " + count);
//        List<List<Integer>> list= new ArrayList();
//        List<Integer> list2=new ArrayList();
//        list2.add(2);
//        list2.add(3);
//        list2.add(4);
//        list2.add(5);
//        list.add(list2);
//        for(List<Integer> m:list){
//            int[][] afterMatrix = {{m.get(0),m.get(1)}, {m.get(2),m.get(3)}};
//            System.out.println(findBeforematrix(afterMatrix));
//        }
    }
    static int[][] findBeforematrix( int[][] afterMatrix){
        int m = afterMatrix.length;
        int n = afterMatrix[0].length;

        for(int i=0; i<m-1 ;i++){
            for (int j=0; j<n-1 ;j++){
                if (i-1 >= 0 && j-1 >= 0){
                    afterMatrix[i][j] = afterMatrix[i][j] - afterMatrix[i-1][j] - afterMatrix[i][j-1] + afterMatrix[i-1][j-1];
                }
                else if( j-1 >= 0 && i-1 < 0){
                    afterMatrix[i][j] -= afterMatrix[i][j-1];
                }
                else if(i-1 >= 0  &&  j-1 < 0){
                    afterMatrix[i][j] -= afterMatrix[i-1][j];

                }
            }
        }
        return afterMatrix;
    }

    public int myAtoi(String str) {
        int index = 0;
        int total = 0;
        int sign = 1;

        if(str.length() == 0)
            return 0;

        while(index < str.length() && str.charAt(index) == ' ')
            index++;

        if (index == str.length()) return 0;

        if(str.charAt(index) == '+' || str.charAt(index) == '-') {
            sign = str.charAt(index) == '+' ? 1 : -1;
            index++;
        }

        while(index < str.length()) {
            int digit = str.charAt(index) - '0';
            if(digit < 0 || digit > 9) break;

            if(Integer.MAX_VALUE / 10 < total || Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            total = total*10 + digit;
            index++;
        }
        return total*sign;
    }

    public static String ArrayChallenge(String[] strArr) {
        // code goes here
        String s1 = strArr[0];
        String s2 = strArr[1];
        int count = 0;
        for(int i = 0; i < s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i)){
                count++;
            }
        }
        return strArr[0];
    }
    int hammingDist(char str1[], char str2[])
    {
        int i = 0, count = 0;
        while(str1[i]!='\0')
        {
            if (str1[i] != str2[i])
                count++;
            i++;
        }
        return count;
    }
    int findDifferenceValue(String firstString, String secondString)
    {
        int n = firstString.length();
        int m = secondString.length();

        if(m > n){
            //invalid
            return 0;
        }
        if(m == 1 && n == 1 && firstString.equalsIgnoreCase(secondString) == false)
            return 1;
        if(m == 1 && n == 1 && firstString.equalsIgnoreCase(secondString) == true)
            return 1;

//        StringBuffer stringBuffer = new StringBuffer(firstString);
        String f1Sub = firstString.substring(0,m);
        if (secondString.equalsIgnoreCase(f1Sub)) {
            return 0;
        }
        for(int i = 0 ; i < (secondString.length()-1) ; i++){
            char ch = secondString.charAt(i);
            int index = firstString.indexOf(ch);

            if(index == -1){

            }else{
                count = count + index;
                firstString = firstString.substring(index);
                System.out.println(" index " + index +  " ch " + ch);
            }
        }
        return count;
    }
//    public List<List<Integer>> twoDArrayToList(Integer[][] twoDArray) {
//        List<List<Integer>> list = new ArrayList<List<Integer>>();
//        for (Integer[] array : twoDArray) {
//            list.addAll(Arrays.asList((Integer) array));
//        }
//    }
}
