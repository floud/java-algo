package com.getjavajob.training.algo05.halturina.init;

/**
 * Created by floud on 15.03.2015.
 */
public class Task02_013 {

    /**
     *reverse view of Number*/
    public static String reverseNumber(int a) {
        String s = Integer.toString(a);
        char[] chars = s.toCharArray();
        char first = chars[0];
        chars[0] = chars[2];
        chars[2] = first;
        return String.valueOf(chars);
    }
}
