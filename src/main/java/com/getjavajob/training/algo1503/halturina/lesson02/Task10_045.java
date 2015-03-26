package com.getjavajob.training.algo1503.halturina.lesson02;

/**
 * Created by halturin_a on 25.03.2015.
 */
public class Task10_045 {

    public static int count = 1;
    public static int sum;

    public static double getNumber(int a, int b, int n) {
        int sum = a + b;
        count++;
        if (count == n) {
            return sum;
        } else {
            return getNumber(sum, b, n);
        }
    }

    public static double getSum(int a, int b, int n) {
        return 0;
    }
}
