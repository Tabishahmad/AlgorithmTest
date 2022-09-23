package com.example.algorithm;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = { 3, 5, 8, 10, 20,50,88 };
        BinarySearch Search = new BinarySearch();
        int value = Search.binarySearch(arr,0,arr.length-1,20);
        if(value == -1){
            //find nearest
        }
    }


    public int binarySearch(int[] intArry,int start,int end,int key) {
        // code goes here
        if(end >= 1){
            int mid = start + (end - start) / 2;

            if (intArry[mid] == key)
                return mid;

            if (intArry[mid] > key)
                return binarySearch(intArry, start, mid - 1, key);

            return binarySearch(intArry, mid + 1, end, key);
        }
        return -1;
    }
}