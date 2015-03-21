package com.getjavajob.training.algo1503.halturina.init;

import java.util.Arrays;

/**
 * Created by floud on 16.03.2015.
 */
public class Task9_166 {
    public static String switchWords(String words) {
        String[] strings = words.split(" ");
        String first = strings[0];
        strings[0] = strings[strings.length -1];
        strings[strings.length - 1] = first;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            if (i == strings.length - 1) {
                sb.append(strings[i]);
            } else {
                sb.append(strings[i] + " ");
            }
        }
        return sb.toString();

    }
}
