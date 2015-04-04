package com.getjavajob.training.algo05.halturina.lesson02;

/**
 * Created by halturin_a on 27.03.2015.
 */
public class Task10_055 {
    private static int remainder;
    private static String s = "";
    public static String changeRadix(int number, int n) {
        if (number < n) {
            return number + s;
        }
        if (n == 16) {
            remainder = number % n;
            number = number / n;
            s = Integer.toHexString(remainder) + s;
            return changeRadix(number, n);
        } else {
            remainder = number % n;
            number /= n;
            s = remainder + s;
            return changeRadix(number, n);
        }
    }
}
