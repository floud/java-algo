package com.getjavajob.training.algo1503.halturina.init;

import com.getjavajob.training.algo1503.halturina.util.Assert;

/**
 * Created by floud on 16.03.2015.
 */
public class Task5_27Test {
    public static void main(String[] args) {
        Assert.assertEquals(120300, Task5_27.getSum());
        Assert.assertEquals(999, Task5_27.getSumFromA(499));
        Assert.assertEquals(49, Task5_27.getSumFromAtoB(4, 10));
        Assert.assertEquals(0, Task5_27.getSumToB(10));
    }
}
