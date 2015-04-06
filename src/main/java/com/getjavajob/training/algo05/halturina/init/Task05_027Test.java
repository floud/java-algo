package com.getjavajob.training.algo05.halturina.init;

import com.getjavajob.training.algo05.halturina.util.Assert;

/**
 * Created by floud on 16.03.2015.
 */
public class Task05_027Test {
    public static void main(String[] args) {
        Assert.assertEquals(120300, Task05_027.getSum());
        Assert.assertEquals(999, Task05_027.getSumFromA(499));
        Assert.assertEquals(49, Task05_027.getSumFromAtoB(4, 10));
        Assert.assertEquals(0, Task05_027.getSumToB(10));
    }
}
