package com.getjavajob.training.algo1503.halturina.lesson02;

import com.getjavajob.training.algo1503.halturina.util.Assert;

/**
 * Created by halturin_a on 01.04.2015.
 */
public class Task10_056Test {
    public static void main(String[] args) {
        Assert.assertEquals("true", String.valueOf(Task10_056.isSimple(11)));
        Task10_056.resetDevisor();
        Assert.assertEquals("false", String.valueOf(Task10_056.isSimple(34)));
    }
}
