package com.getjavajob.training.algo05.halturina.init;

import com.getjavajob.training.algo05.halturina.util.Assert;

/**
 * Created by floud on 15.03.2015.
 */
public class Task02_043Test {
    public static void main(String[] args) {
        Assert.assertEquals(1, Task02_043.divided(5, 10));
        Assert.assertEquals(1, Task02_043.divided(22, 2));
        Assert.assertEquals(1, Task02_043.divided(21, 45)); // testHome for wrong result
    }
}
