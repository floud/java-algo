package com.getjavajob.training.algo05.halturina.init;

import com.getjavajob.training.algo05.halturina.util.Assert;

/**
 * Created by floud on 15.03.2015.
 */
public class Task4_106Test {
    public static void main(String[] args) {
        Assert.assertEquals("Winter", Task4_106.getMonth(2));
        Assert.assertEquals("Spring", Task4_106.getMonth(4));
        Assert.assertEquals("Summer", Task4_106.getMonth(7));
        Assert.assertEquals("Autumn", Task4_106.getMonth(11));
    }
}
