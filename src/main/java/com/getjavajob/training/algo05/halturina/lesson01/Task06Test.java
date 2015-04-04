package com.getjavajob.training.algo05.halturina.lesson01;

import com.getjavajob.training.algo05.halturina.util.Assert;

/**
 * Created by floud on 24.03.2015.
 */
public class Task06Test {
    public static void main(String[] args) {
        Assert.assertEquals("1000", Integer.toBinaryString(Task06.getSolutionA(3)));
        Assert.assertEquals("11000", Integer.toBinaryString(Task06.getSolutionB(3, 4)));
        Assert.assertEquals("10100100", Integer.toBinaryString(Task06.getSolutionC(167, 2)));
        Assert.assertEquals("101111", Integer.toBinaryString(Task06.getSolutionD(47, 1)));
        Assert.assertEquals("10100", Integer.toBinaryString(Task06.getSolutionE(22, 1)));
        Assert.assertEquals("100001101", Integer.toBinaryString(Task06.getSolutionF(271, 1)));
        Assert.assertEquals("1", Integer.toBinaryString(Task06.getSolutionG(5, 1)));
        Assert.assertEquals("1", Integer.toBinaryString(Task06.getSolutionH(12, 2)));
        Assert.assertEquals("10111", Task06.getSolutionI((byte) 23));
    }
}
