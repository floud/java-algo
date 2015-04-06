package com.getjavajob.training.algo05.halturina.lesson01;

import com.getjavajob.training.algo05.halturina.util.Assert;

/**
 * Created by floud on 24.03.2015.
 */
public class Task7Test {
    public static void main(String[] args) {
        Assert.assertEquals("2 45", Task7.swapOneArifm(45, 2));
        Assert.assertEquals("-3 -45", Task7.swapTwoArifm(-45, -3));
        Assert.assertEquals("-44 22", Task7.swapOneBitwise(22, -44));
        Assert.assertEquals("6 41", Task7.swapTwoBitwise(41, 6));
    }
}
