package com.getjavajob.training.algo05.halturina.init;

/**
 * Created by floud on 16.03.2015.
 */
public class Task9_102 {
    public static String changeChars(String word, int m, int n){
        char a = word.charAt(m);
        char b = word.charAt(n);
        char[] chars = word.toCharArray();
        chars[m] = b;
        chars[n] = a;
        return String.valueOf(chars);
    }
}
