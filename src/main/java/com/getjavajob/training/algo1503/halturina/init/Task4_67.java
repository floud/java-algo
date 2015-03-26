package com.getjavajob.training.algo1503.halturina.init;

/**
 * Created by floud on 15.03.2015.
 */
public class Task4_67 {

    public static String isWorkDay(int k) {
        if (k % 7 >=1 && k % 7 <= 5) return "Workday";
        else return "Weekend";
    }
}
