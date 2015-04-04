package com.getjavajob.training.algo05.halturina.init;

import com.getjavajob.training.algo05.halturina.util.Assert;

/**
 * Created by floud on 15.03.2015.
 */
public class Task4_67Test {
    public static void main(String[] args) {
        Assert.assertEquals("Workday", Task4_67.isWorkDay(5));
        Assert.assertEquals("Weekend", Task4_67.isWorkDay(7));
    }
}
