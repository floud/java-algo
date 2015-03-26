package com.getjavajob.training.algo1503.halturina.init;

import com.getjavajob.training.algo1503.halturina.util.Assert;

/**
 * Created by floud on 15.03.2015.
 */
public class Task4_33Test {
    public static void main(String[] args) {
        Assert.assertEquals("true", String.valueOf(Task4_33.isLastEven(542)));
        Assert.assertEquals("false", String.valueOf(Task4_33.isLastEven(35)));
        Assert.assertEquals("true", String.valueOf(Task4_33.isLastOdd(43)));
        Assert.assertEquals("false", String.valueOf(Task4_33.isLastOdd(2)));
    }
}
