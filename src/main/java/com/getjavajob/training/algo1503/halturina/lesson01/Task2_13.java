package com.getjavajob.training.algo1503.halturina.lesson01;

/**
 * Created by Cloud on 15.03.2015.
 */
public class Task2_13 {
    public static int b = 256;

    public static void main(String[] args) {
        System.out.println(reverseNumber(b));
    }

    /**
     *reverse view of Number*/
    public static int reverseNumber(int a) {
        String s = Integer.toString(a);
        char[] chars = s.toCharArray();
        char first = chars[0];
        char third = chars[2];
        chars[0] = third;
        chars[2] = first;
        return Integer.parseInt(String.valueOf(chars));
    }
}
