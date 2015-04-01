package com.getjavajob.training.algo1503.halturina.lesson02;

/**
 * Created by halturin_a on 24.03.2015.
 */
public class Task10_042 {

    public static double degree(double a, double n) {
        if (n < 0) {
            if (n == -1) {
                return 1 / a;
            } else {
                return 1 / a * degree(a, n + 1);
            }
        } else {
            if (n == 1) {
                return a;
            } else {
                return a * degree(a, n - 1);
            }
        }

    }
}
