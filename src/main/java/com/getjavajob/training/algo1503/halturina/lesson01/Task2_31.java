package com.getjavajob.training.algo1503.halturina.lesson01;

import java.util.Scanner;

/**
 * Created by floud on 15.03.2015.
 */
public class Task2_31 {


    public static int findInitialNumber() {
        int a = new Scanner(System.in).nextInt();
        char[] chars = String.valueOf(a).toCharArray();
        char c = chars[1];
        chars[1] = chars[2];
        chars[2] = c;
        return Integer.valueOf(String.valueOf(chars));
    }
}
