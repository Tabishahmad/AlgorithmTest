package com.example.algorithm;

import java.util.Arrays;

public class MedianArrays {
    public static void main(String[] args){
        int[] nums = {1};
        int[] nums2  = {3};
        MedianArrays medianArrays = new MedianArrays();
        Double result = medianArrays.findMedianSortedArrays(nums,nums2);
        System.out.println(" result " + result);

    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null){
            System.out.println("Invalid Paraments");
            return  -1;
        }
         // resultant array size
        int num1L = nums1.length;
        int num2L = nums2.length;
        int totalL = num1L  + num2L;

        // create the resultant array
        int[] mergedArray = new int[totalL];
        System.arraycopy(nums1,0,mergedArray,0,num1L);
        System.arraycopy(nums2,0,mergedArray,num1L,num2L);

        Arrays.sort(mergedArray);

        double value = 0;
        int mid = totalL/2;
        if(totalL % 2 == 0){
            value =(double) (mergedArray[mid]+mergedArray[mid-1])/2;
        }else{
            value = mergedArray[mid];
        }
        return value;
    }

}
