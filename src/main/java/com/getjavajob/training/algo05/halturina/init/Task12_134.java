package com.getjavajob.training.algo05.halturina.init;

import java.util.Arrays;

/**
 * Created by floud on 19.03.2015.
 */
public class Task12_134 {
    public static int[][] removeLine(int[][] ints, int k) {
        for (int i = k; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                if (i != ints.length - 1) {
                    ints[i][j] = ints[i + 1][j];

                } else {
                    continue;
                }
            }
        }
        for (int i = 0; i < ints[ints.length - 1].length; i++) {
            ints[ints.length - 1][i] = 0;
        }
        return ints;

    }

    public static int[][] removeColumn(int[][] ints, int s) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = s; j < ints[i].length; j++) {
                if (j != ints[i].length - 1) {
                    ints[i][j] = ints[i][j + 1];
                } else {
                    continue;
                }
            }
        }
        for (int i = 0; i < ints.length; i++) {
            ints[i][ints[i].length - 1] = 0;
        }
        return ints;
    }

}
