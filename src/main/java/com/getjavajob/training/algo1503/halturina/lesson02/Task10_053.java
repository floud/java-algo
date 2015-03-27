package com.getjavajob.training.algo1503.halturina.lesson02;

import java.util.Arrays;

/**
 * Created by halturin_a on 27.03.2015.
 */
public class Task10_053 {

    private static int number;
    private static String s = "";
    public static String reverseNumberFromArray(int[] array) {
        if (array.length == 0) {
            return s.substring(0, s.length() - 2);
        } else {
            number = array[array.length - 1];
            s += number + ", ";
            return reverseNumberFromArray(Arrays.copyOf(array, array.length - 1));
        }

    }
}
