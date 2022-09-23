package com.example.algorithm;

public class GallonGasDistance {

    public static void main(String[] args) {
        String[] N = {"1","3:1","2:2","1:2","2:1"};
        GallonGasDistance gallonGasDistance = new GallonGasDistance();
        String value = gallonGasDistance.ArrayChallenge(N);
        System.out.println(" value " + value);
    }

    public String ArrayChallenge(String[] strArr) {
        // code goes here
        int gallons = 0;
        int totalGallon = 0;
        int distance = 0;
        int numberOfStation = Integer.parseInt(strArr[0]);
        for (int i = 1 ; i <= numberOfStation ; i++){
            String[] string = strArr[i].split(":");
            gallons = Integer.parseInt(string[0]);
            distance = Integer.parseInt(string[1]);

            totalGallon += (gallons - distance);

            System.out.println(" gallons "+gallons + "  distance " + distance + " totalGallon " +totalGallon);
            if(totalGallon <= 0) return "Impossible";
        }
        return ""+totalGallon;
    }
}