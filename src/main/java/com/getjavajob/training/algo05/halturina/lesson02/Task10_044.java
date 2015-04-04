package com.getjavajob.training.algo05.halturina.lesson02;

/**
 * Created by halturin_a on 25.03.2015.
 */
public class Task10_044 {

    public static int digitalRoot(int a) {
        int digitalR = 0;
        if (String.valueOf(a).length() == 1) {
            return a;
        } else {
            digitalR = digitalRoot(Task10_043.sumOfNumbers(a));
        }
        return digitalR;
    }
}
