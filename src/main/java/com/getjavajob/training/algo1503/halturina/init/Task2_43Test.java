package com.getjavajob.training.algo1503.halturina.init;

import com.getjavajob.training.algo1503.halturina.init.util.Assert;

/**
 * Created by floud on 15.03.2015.
 */
public class Task2_43Test {
    public static void main(String[] args) {
        Assert.assertEquals(1, Task2_43.divided(5, 10));
        Assert.assertEquals(1, Task2_43.divided(22, 2));
        Assert.assertEquals(1, Task2_43.divided(21, 45)); // testHome for wrong result
    }
}
