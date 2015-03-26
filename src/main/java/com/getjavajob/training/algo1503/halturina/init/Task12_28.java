package com.getjavajob.training.algo1503.halturina.init;

/**
 * Created by floud on 21.03.2015.
 */
public class Task12_28 {
    public static int[][] fillArray(int n) {
        int[][] ints = new int[n][n];
        int changeOfDirection = 0;
        int row = 0;
        int column = 0;
        int x = 1;
        int y = 0;
        int vis = n;

        for (int i = 0; i < n*n; i++) {
            ints[row][column] = i + 1;
            if (--vis == 0) {
                vis = n*(changeOfDirection % 2) + n*((changeOfDirection + 1) % 2) - (changeOfDirection / 2 - 1) - 2;
                int tmp = x;
                x = -y;
                y = tmp;
                changeOfDirection++;
            }
            column += x;
            row += y;
        }
        return ints;
    }
}
