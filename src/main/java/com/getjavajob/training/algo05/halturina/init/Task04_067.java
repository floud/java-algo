package com.getjavajob.training.algo05.halturina.init;

/**
 * Created by floud on 15.03.2015.
 */
public class Task04_067 {

    public static String isWorkDay(int k) {
        if (k % 7 >=1 && k % 7 <= 5) return "Workday";
        else return "Weekend";
    }
}
