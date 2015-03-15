package com.getjavajob.training.algo1503.halturina.lesson01;

import com.getjavajob.training.algo1503.halturina.lesson01.util.Assert;

/**
 * Created by floud on 15.03.2015.
 */
public class Task4_33Test {
    public static void main(String[] args) {
        Assert.assertEquals("true", String.valueOf(Task4_33.isLastEven(542)));
        Assert.assertEquals("true", String.valueOf(Task4_33.isLastOdd(43)));
    }
}
