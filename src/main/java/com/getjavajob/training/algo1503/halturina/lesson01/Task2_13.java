package com.getjavajob.training.algo1503.halturina.lesson01;

/**
 * Created by floud on 15.03.2015.
 */
public class Task2_13 {

    /**
     *reverse view of Number*/
    public static int reverseNumber(int a) {
        String s = Integer.toString(a);
        char[] chars = s.toCharArray();
        char first = chars[0];
        chars[0] = chars[2];
        chars[2] = first;
        return Integer.parseInt(String.valueOf(chars));
    }
}
