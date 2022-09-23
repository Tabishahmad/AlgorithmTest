package com.example.algorithm;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GallonGasDistanceTest {

    GallonGasDistance gallonGasDistance;
    @Before
    public void setUp() throws Exception {
        gallonGasDistance = new GallonGasDistance();
    }

    @Test
    public void test1() {
        String[] N = {"4","3:1","2:2","1:2","0:1"};
        String value = gallonGasDistance.ArrayChallenge(N);
        System.out.println(" value " + value);
    }
    @Test
    public void test2() {
        String[] N = {"4","3:1","2:2","1:2","2:1"};
        String value = gallonGasDistance.ArrayChallenge(N);
        System.out.println(" value " + value);
    }

}