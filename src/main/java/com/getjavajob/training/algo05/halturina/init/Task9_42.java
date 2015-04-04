package com.getjavajob.training.algo05.halturina.init;

/**
 * Created by floud on 16.03.2015.
 */
public class Task9_42 {
    public static String printReverseWord(String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = word.length()-1; i >= 0; i--)  {
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }
}
