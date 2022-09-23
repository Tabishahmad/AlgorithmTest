package com.example.algorithm;
/*

Given an array of integers, return a new array such that each element at index i of the new array
is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 */
public class DailyCoadingProblem_1 {

    public static void main(String[] args) {
        int arr[] = { 3, 5, 8, 10, 20,50,88 };
        DailyCoadingProblem_1 Search = new DailyCoadingProblem_1();
        int prod[] = Search.productExceptSelf(arr);
        for (int i = 0; i < prod.length; i++)
            System.out.print(" test =  "   + prod[i] + " ");
    }


    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0, tmp = 1; i < nums.length; i++) {
            result[i] = tmp;
            tmp *= nums[i];
        }
        for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {
            result[i] *= tmp;
            tmp *= nums[i];
        }
        return result;
    }
    // LOGIC IS RIGHT NOT TIME CONSUMING NOT A GOOD WAY TO WRITE
    //
    // public int[] productExceptSelf(int[] nums) {
    //      int n = nums.length;
    //      int newarray[] = new int[n];
    //      int newVal = 1;
    //      int currentindex = 0;
    //      for (int i = 0; i < n; i++)
    //      {
    //         for (int j = 0; j < n; j++){
    //              if(currentindex != j ){
    //                 newVal = newVal*nums[j];
    //              }
    //         }
    //         newarray[i] = newVal;
    //         currentindex++;
    //         newVal = 1;
    //      }
    //      return newarray;
    // }
}