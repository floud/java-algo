package com.getjavajob.training.algo1503.halturina.lesson02;

/**
 * Created by halturin_a on 24.03.2015.
 */
public class Task10_41 {


    public static double factorial(double a) {
        if (a == 1) {
            return 1;
        } else {
            return a * factorial(a - 1);
        }
    }
}
