package com.example.algorithm;

public class ReverseInteger {
    public static void main(String[] args){
        int  N = -123;
        ReverseInteger reverseInteger = new ReverseInteger();
        int result = reverseInteger.reverse(N);
    }
    public int reverse(int number) {
        boolean isNegative = false;
        if(number < 0){
            //make it positive
            number = number * -1;
            isNegative = true;
        }
        int reverse = 0;
        StringBuffer sb = new StringBuffer();
        while(number != 0)
        {
            int remainder = number % 10;
            sb.append(remainder);
            number = number/10;
        }
        try {
            reverse = Integer.parseInt(sb.toString());
            if(isNegative){
                return reverse*-1;
            }
            return reverse;
        }catch (Exception e){
            return 0;
        }
    }

}
