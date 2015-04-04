package com.getjavajob.training.algo05.halturina.lesson02;

/**
 * Created by floud on 26.03.2015.
 */
public class Task10_050 {
    public static int getAckermann (int n, int m) {
        if (n == 0) {
            return m + 1;
        } else if (n != 0 && m == 0) {
            return getAckermann(n - 1, 1);
        } else if (n > 0 && m > 0) {
            return getAckermann(n - 1, getAckermann(n, m - 1));
        }
        return 0;
    }
}
