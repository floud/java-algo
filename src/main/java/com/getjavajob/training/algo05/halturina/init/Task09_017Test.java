package com.getjavajob.training.algo05.halturina.init;

import com.getjavajob.training.algo05.halturina.util.Assert;

/**
 * Created by floud on 16.03.2015.
 */
public class Task09_017Test {
    public static void main(String[] args) {
        Assert.assertEquals("true", String.valueOf(Task09_017.equalFirstAndLastLiterals("javaj")));
        Assert.assertEquals("false", String.valueOf(Task09_017.equalFirstAndLastLiterals("oracle")));
    }
}
