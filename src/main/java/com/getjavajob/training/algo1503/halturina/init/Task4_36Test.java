package com.getjavajob.training.algo1503.halturina.init;

import com.getjavajob.training.algo1503.halturina.util.Assert;

/**
 * Created by floud on 16.03.2015.
 */
public class Task4_36Test {
    public static void main(String[] args) {
        Assert.assertEquals("red", Task4_36.getLight(3));
        Assert.assertEquals("green", Task4_36.getLight(5));
    }
}
