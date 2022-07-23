package com.example.algorithm;

public class AlgoCheck {
    public int[] solution(int[] A, int K) {
        if(A == null){
           return null;
        }
        int size = A.length;
        if(size == 1){
            return A;
        }
        for(int i=0;i < K;i++){
            for(int j=size-1;i > 1;j--){
                if(j == size-1 ){
                  A[0] = A[size-1];
                }else {
                  A[j] = A[j-1];
                }
            }
            printArray(A);
        }
        return A;
    }
    public int solution(int[] A, int[] B, int X, int Y) {
       int size = A.length;
       for (int i = 0 ; i < size ; i++ ){
           if(X >= A[i]-20 && X <= A[i+20] && Y >= B[i]-20 && Y <= B[i+20]){
                return i;
           }
       }
       System.out.println("out of the box");
       return -1;
    }
    private void printArray(int[] A){
        int N = 0;
        int size = A.length;
        String str = ""+N;
        if(str.indexOf("5") == -1){
            int li = str.lastIndexOf("5");
            //Integer.parseInt()
            System.out.println("INVALID VALUE");
        }
        System.out.println("[");
        for(int i=0;i < size;i++){
            System.out.println(A[i]+",");
        }
        System.out.println("]");
    }
//    public static String removeX(String string, char X)
//    {
//        // Stores the index of X
//        // that has to be removed
//        int index = -1;
//
//        // Find leftmost occurrence of X
//        // such that the digit just after X
//        // is greater than X
//        String string
//        if(string > 0){
//            for (int i = 0; i < string.length() - 1;
//                 i++) {
//                if (string.charAt(i) == X
//                        && string.charAt(i) - '0'
//                        < string.charAt(i + 1) - '0') {
//
//                    // Update index and break
//                    index = i;
//                    break;
//                }
//            }
//        }else{
//            for (int i = string.length()-1; i > 0;
//                 i++) {
//                if (string.charAt(i) == X
//                        && string.charAt(i) - '0'
//                        < string.charAt(i + 1) - '0') {
//
//                    // Update index and break
//                    index = i;
//                    break;
//                }
//            }
//        }
//
//        // If no occurrence of X such that
//        // the digit just after X
//        // is greater than X is found
//        // then find last occurrence of X
//        if (index == -1) {
//            for (int i = string.length() - 1;
//                 i >= 0; i--) {
//                if (string.charAt(i) == X) {
//                    index = i;
//                    break;
//                }
//            }
//        }
//
//        // Construct answer using all characters
//        // in string N except index
//        String ans = "";
//        for (int i = 0; i < string.length(); i++) {
//            if (i != index)
//                ans = ans + string.charAt(i);
//        }
//
//        return ans;
//    }
}
