package com.getjavajob.training.algo05.halturina.init;

/**
 * Created by floud on 16.03.2015.
 */
public class Task09_022 {
    public static String getFirstHalfOfWord(String word) {
        int wordLength = word.length();
        return (word.substring(0, (wordLength/2)));
    }
}
