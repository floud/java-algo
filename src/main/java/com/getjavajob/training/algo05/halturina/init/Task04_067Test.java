package com.getjavajob.training.algo05.halturina.init;

import com.getjavajob.training.algo05.halturina.util.Assert;

/**
 * Created by floud on 15.03.2015.
 */
public class Task04_067Test {
    public static void main(String[] args) {
        Assert.assertEquals("Workday", Task04_067.isWorkDay(5));
        Assert.assertEquals("Weekend", Task04_067.isWorkDay(7));
    }
}
