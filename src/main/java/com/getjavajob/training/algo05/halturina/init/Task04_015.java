package com.getjavajob.training.algo05.halturina.init;

/**
 * Created by floud on 15.03.2015.
 */
public class Task04_015 {

    public static int getAge(int thisMonth, int thisYear, int bMonth, int bYear) {
        int age = thisYear - bYear - 1;
        if (thisMonth >= bMonth) age++;
        return age;
    }
}
