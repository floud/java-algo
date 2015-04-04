package com.getjavajob.training.algo05.halturina.init;

/**
 * Created by floud on 19.03.2015.
 */
public class Task12_24 {
    public static int[][] fillArrayA() {
        int[][] ints = new int[6][6];
        for (int i = 0; i < ints.length; i ++) {
            for (int j = 0; j < ints[i].length; j++) {
                if ((i == 0) || (j == 0)) {
                    ints[i][j] = 1;
                } else {
                    ints[i][j] = ints[i - 1][j] + ints[i][j-1];
                }
            }
        }

        return ints;

    }

    public static int[][] fillArrayB() {
        int[][] ints = new int[6][6];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++){
                ints[i][j] = ((i + j) % 6) + 1;

            }

        }
        return ints;
    }
}
