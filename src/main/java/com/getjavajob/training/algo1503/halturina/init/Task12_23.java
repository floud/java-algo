package com.getjavajob.training.algo1503.halturina.init;

import java.util.Arrays;

/**
 * Created by floud on 17.03.2015.
 */
public class Task12_23 {
    public static int[][] fillArrayA() {
        int[][] ints = new int[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == j || i + j == 6) {
                    ints[i][j] = 1;
                } else ints[i][j] = 0;

            }
        }

        return ints;
    }

    public static int[][] fillArrayB() {
        int[][] ints = new int[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == j || i + j == 6 || i == 3 || j == 3) {
                    ints[i][j] = 1;
                } else ints[i][j] = 0;

            }
        }
        return ints;

    }

    public static int[][] fillArrayV() {
        int[][] ints = new int[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++ ) {
                if (i == 0 || i == 6) {
                    ints[i][j] = 1;
                } else if ((i == 1 || i == 5) && (j >= 1 && j <= 5)) {
                    ints[i][j] = 1;
                } else if (((i == 2 || i == 4) && (j >= 2 && j <= 4))) {
                    ints[i][j] = 1;
                } else if (i == 3 && j == 3) ints[i][j] = 1;
                else ints[i][j] = 0;

            }

        }
        return ints;
    }


}
