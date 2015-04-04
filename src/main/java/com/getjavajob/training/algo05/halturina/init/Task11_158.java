package com.getjavajob.training.algo05.halturina.init;

import java.util.Arrays;

/**
 * Created by floud on 16.03.2015.
 */
public class Task11_158 {
    public static String removeDuplicates(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[i] == ints[j]) {
                    for (int k = j; k < ints.length; k++) {
                        if (k == ints.length -1) break;
                        ints[k] = ints[k+1];
                    }
                    ints[ints.length - 1] = 0;
                }
            }
        }
        return Arrays.toString(ints);

    }
}
