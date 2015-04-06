package com.getjavajob.training.algo05.halturina.init;

import com.getjavajob.training.algo05.halturina.util.Assert;

/**
 * Created by floud on 15.03.2015.
 */
public class Task04_033Test {
    public static void main(String[] args) {
        Assert.assertEquals("true", String.valueOf(Task04_033.isLastEven(542)));
        Assert.assertEquals("false", String.valueOf(Task04_033.isLastEven(35)));
        Assert.assertEquals("true", String.valueOf(Task04_033.isLastOdd(43)));
        Assert.assertEquals("false", String.valueOf(Task04_033.isLastOdd(2)));
    }
}
