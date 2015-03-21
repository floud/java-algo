package com.getjavajob.training.algo1503.halturina.init;

import java.util.Scanner;

/**
 * Created by floud on 15.03.2015.
 */
public class Task2_31 {


    public static String findInitialNumber(int b) {
        char[] chars = String.valueOf(b).toCharArray();
        char c = chars[1];
        chars[1] = chars[2];
        chars[2] = c;
        return String.valueOf(chars);
    }
}
