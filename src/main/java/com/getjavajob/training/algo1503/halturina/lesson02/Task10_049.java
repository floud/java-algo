package com.getjavajob.training.algo1503.halturina.lesson02;

import static com.getjavajob.training.algo1503.halturina.lesson02.Task10_048.*;

/**
 * Created by halturin_a on 26.03.2015.
 */
public class Task10_049 {
    private static int index;

    public static int getIndex(int[] array, int n) {
        if (n == 0) {
            return 0;
        } else {
            index = getIndex(array, n - 1);
            if (array[index] > array[n - 1]) {
                return index;
            } else {
                index = n - 1;
                return index;
            }
        }
    }
}
