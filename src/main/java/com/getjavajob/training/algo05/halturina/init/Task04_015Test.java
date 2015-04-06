package com.getjavajob.training.algo05.halturina.init;

import com.getjavajob.training.algo05.halturina.util.Assert;

/**
 * Created by floud on 15.03.2015.
 */
public class Task04_015Test {
    public static void main(String[] args) {
        Assert.assertEquals("29", String.valueOf(Task04_015.getAge(12, 2014, 6, 1985)));
        Assert.assertEquals("28", String.valueOf(Task04_015.getAge(5, 2014, 6, 1985)));
        Assert.assertEquals("29", String.valueOf(Task04_015.getAge(6, 2014, 6, 1985)));
    }
}
