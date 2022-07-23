package com.example.algorithm;

public class MaximumPossibleValue {

//    Question: Write a function solution that, given an integer N, returns the maximum
//    possible value obtainable by deleting one ‘5’ digit from the decimal representation of N.
//    It is guaranteed that N will contain at least one “5′ digit.

//    Given N = 15958, the function should return 1958.
//    for Given N = -5859, the function should return -589.
//    and Given N = -5000, the function should return O. After deleting the ‘5,
//    the only digits in the number are zeroes, so its value is 0.

    public static void main(String[] args){
        int  N = -5000;
        MaximumPossibleValue maximumPossibleValue = new MaximumPossibleValue();
        int result = maximumPossibleValue.solution(N);
        System.out.println("N " + N + " maximumPossibleValue " + result);
     }
    public int solution(int number) {
        String numberS = ""+number;
        StringBuilder stringBuilder = new StringBuilder(""+number);
        char ch = '5';

        if(number < 0){
            int lastIndex = numberS.lastIndexOf(ch);
            stringBuilder.deleteCharAt(lastIndex);
            numberS = stringBuilder.toString();
        }else{
            int firstIndex = numberS.indexOf(ch);
            System.out.println("firstIndex " + firstIndex);
            stringBuilder.deleteCharAt(firstIndex);
            numberS = stringBuilder.toString();
        }
        int value = Integer.parseInt(numberS);
        return value;
    }
}
