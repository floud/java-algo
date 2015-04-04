package com.getjavajob.training.algo05.halturina.util;

import java.util.Arrays;

/**
 * Created by floud on 15.03.2015.
 */
public class Assert {
    public static void assertEquals(String expected, String actual) {
        if (expected.equals(actual)) {
            System.out.println("Success");
        } else {
            System.out.println("Failure: expected " + expected + ", actual " + actual);
        }

    }

    public static void assertEquals(double expected, double actual) {
        if (expected == actual) {
            System.out.println("Success");
        } else {
            System.out.println("Failure: expected " + expected + ", actual " + actual);
        }
    }

    public static void assertEquals(int[][] integers, int[][] ints) {
        if (Arrays.deepEquals(integers, ints)) {
            System.out.println("Success");
        } else {
            System.out.println("Failure!");
        }
    }
    public static void assertEquals(char expected, char actual) {
        if (expected == actual) {
            System.out.println("Success");
        } else System.out.println("Failure: expected " + expected + ", actual " + actual);
    }


    public static void assertEquals(Number expected, Number actual) {
        if (expected.equals(actual)) {
            System.out.println("Success");
        } else System.out.println("Failure: expected " + expected + ", actual " + actual);
    }
}