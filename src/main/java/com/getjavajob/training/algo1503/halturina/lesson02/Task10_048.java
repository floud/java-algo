package com.getjavajob.training.algo1503.halturina.lesson02;

/**
 * Created by halturin_a on 26.03.2015.
 */
public class Task10_048 {

    public static int[] array;
    private static double max;

    public static double getMax(int n) {
        if (n == 0) {
            return array[n];
        } else {
            max = getMax(n - 1);
            return array[n - 1] > max ? array[n - 1] : max;
        }
    }
}
