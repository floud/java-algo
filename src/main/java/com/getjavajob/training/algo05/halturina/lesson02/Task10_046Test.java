package com.getjavajob.training.algo05.halturina.lesson02;

import com.getjavajob.training.algo05.halturina.util.Assert;

import static com.getjavajob.training.algo05.halturina.lesson02.Task10_046.*;

/**
 * Created by floud on 01.04.2015.
 */
public class Task10_046Test {
    public static void main(String[] args) {
        Assert.assertEquals(16, Task10_046.getNumber(2, 2, 4));
        resetStaticVariables();
        Assert.assertEquals(62, getSum(2, 2, 5));
    }
}
