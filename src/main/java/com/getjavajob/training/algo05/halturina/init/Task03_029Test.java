package com.getjavajob.training.algo05.halturina.init;

import com.getjavajob.training.algo05.halturina.util.Assert;

/**
 * Created by floud on 16.03.2015.
 */
public class Task03_029Test {
    public static void main(String[] args) {
        Assert.assertEquals("true", String.valueOf(Task03_029.getA(11, 2345)));
        Assert.assertEquals("true", String.valueOf(Task03_029.getB(5, 3434)));
        Assert.assertEquals("true", String.valueOf(Task03_029.getV(35, -234)));
        Assert.assertEquals("true", String.valueOf(Task03_029.getG(-1, -434, -3)));
        Assert.assertEquals("true", String.valueOf(Task03_029.getD(3, 40, 88)));
        Assert.assertEquals("true", String.valueOf(Task03_029.getE(200, 99, 3)));
    }
}
