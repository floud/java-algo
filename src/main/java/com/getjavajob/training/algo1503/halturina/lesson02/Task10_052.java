package com.getjavajob.training.algo1503.halturina.lesson02;

/**
 * Created by halturin_a on 27.03.2015.
 */
public class Task10_052 {

    static {
        sb = new StringBuilder();
    }
    private static StringBuilder sb;
    private static int number;
    public static int reverseNumber(int a) {
        if (a % 10 == 0) {
            return Integer.parseInt(sb.toString());
        } else {
            number = a % 10;
            sb.append(number);
            return reverseNumber(a / 10);
        }
    }
}
