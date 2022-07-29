package com.example.algorithm;

import java.util.HashMap;
//Given an array of integers nums and an integer target,
//return indices of the two numbers such that they add up to target.
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
public class TwoSum {
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int  target = 9;
        TwoSum twoSum = new TwoSum();
        int result[] = twoSum.Solution(nums,target);
        twoSum.printArray(result);

    }
    public int[] Solution(int[] numbers, int target) {
        if(numbers == null){
            int toReturn[] = {0, 0};
            System.out.println("Invalid Paraments");
            return  toReturn;
        }


        if(numbers.length < 2){
            int toReturn[] = {0, 0};
            System.out.println("Invalid Paraments");
            return  toReturn;
        }
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for(int i = 0; i < numbers.length; i++){
            Integer diff = (Integer)(target - numbers[i]);
            if(hash.containsKey(diff)){
                int toReturn[] = {hash.get(diff), i};
                return toReturn;
            }
            hash.put(numbers[i], i);
        }
        return null;
    }
    private void printArray(int[] numbers){
        int size = numbers.length;
        System.out.println("[");
        for (int i = 0;i < size;i++) {
            System.out.println(numbers[i]+",");
        }
        System.out.println("[");
    }
}
