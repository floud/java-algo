package com.getjavajob.training.algo1503.halturina.lesson01.util;

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
}
