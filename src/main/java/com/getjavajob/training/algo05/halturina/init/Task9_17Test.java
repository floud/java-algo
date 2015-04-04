package com.getjavajob.training.algo05.halturina.init;

import com.getjavajob.training.algo05.halturina.util.Assert;

/**
 * Created by floud on 16.03.2015.
 */
public class Task9_17Test {
    public static void main(String[] args) {
        Assert.assertEquals("true", String.valueOf(Task9_17.equalFirstAndLastLiterals("javaj")));
        Assert.assertEquals("false", String.valueOf(Task9_17.equalFirstAndLastLiterals("oracle")));
    }
}
