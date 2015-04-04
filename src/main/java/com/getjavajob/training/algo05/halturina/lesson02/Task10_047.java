package com.getjavajob.training.algo05.halturina.lesson02;

/**
 * Created by halturin_a on 26.03.2015.
 */
public class Task10_047 {
    public static int count;

    public static double getFibonacci(int k) {
        if (k == 1) {
            return 1;
        } else if (k == 2) {
            return 1;
        } else {
            return getFibonacci(k - 1) + getFibonacci(k - 2);
        }
    }
}
