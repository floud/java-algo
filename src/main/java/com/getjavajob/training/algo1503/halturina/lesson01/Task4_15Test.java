package com.getjavajob.training.algo1503.halturina.lesson01;

import com.getjavajob.training.algo1503.halturina.lesson01.util.Assert;

/**
 * Created by floud on 15.03.2015.
 */
public class Task4_15Test {
    public static void main(String[] args) {
        Assert.assertEquals("29", String.valueOf(Task4_15.getAge(12, 2014, 6, 1985)));
        Assert.assertEquals("28", String.valueOf(Task4_15.getAge(5, 2014, 6, 1985)));
        Assert.assertEquals("29", String.valueOf(Task4_15.getAge(6, 2014, 6, 1985)));
    }
}
