package com.getjavajob.training.algo1503.halturina.lesson02;

import com.getjavajob.training.algo1503.halturina.util.Assert;

import static com.getjavajob.training.algo1503.halturina.lesson02.Task10_045.resetStaticVariables;

/**
 * Created by halturin_a on 25.03.2015.
 */
public class Task10_045Test {
    public static void main(String[] args) {
        Assert.assertEquals(25, Task10_045.getNumber(4, 3, 8));
        resetStaticVariables();
        Assert.assertEquals(35, Task10_045.getSum(1, 3, 5));
    }
}
