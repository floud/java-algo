package com.getjavajob.training.algo05.halturina.init;

/**
 * Created by floud on 15.03.2015.
 */
public class Task06_008 {

    public static String getNumber(int n) {

        int square;
        StringBuilder sb = new StringBuilder();
        for (int i = 1;; i++) {
            square = (int) Math.pow(i, 2);
            if (square <= n) sb.append(square + ", ");
            else break;
        }
        return sb.toString();
    }
}