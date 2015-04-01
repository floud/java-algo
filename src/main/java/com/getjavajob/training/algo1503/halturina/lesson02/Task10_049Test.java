package com.getjavajob.training.algo1503.halturina.lesson02;

import com.getjavajob.training.algo1503.halturina.util.Assert;

/**
 * Created by floud on 26.03.2015.
 */
public class Task10_049Test {
    public static void main(String[] args) {
        int[] array = new int[]{5, 32, 444, 3, -4};
        Assert.assertEquals(2, Task10_049.getIndex(array, array.length));
    }
}
