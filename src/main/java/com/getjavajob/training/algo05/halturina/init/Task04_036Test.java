package com.getjavajob.training.algo05.halturina.init;

import com.getjavajob.training.algo05.halturina.util.Assert;

/**
 * Created by floud on 16.03.2015.
 */
public class Task04_036Test {
    public static void main(String[] args) {
        Assert.assertEquals("red", Task04_036.getLight(3));
        Assert.assertEquals("green", Task04_036.getLight(5));
    }
}
