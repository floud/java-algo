package com.getjavajob.training.algo1503.halturina.lesson01;

/**
 * Created by floud on 15.03.2015.
 */
public class Task4_15 {

    public static int getAge(int thisMonth, int thisYear, int bMonth, int bYear) {
        int age = thisYear - bYear - 1;
        if (thisMonth >= bMonth) age++;
        return age;
    }
}
