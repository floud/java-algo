package com.getjavajob.training.algo1503.halturina.lesson02;

import com.getjavajob.training.algo1503.halturina.util.Assert;

/**
 * Created by halturin_a on 26.03.2015.
 */
public class Task10_048Test {
    public static void main(String[] args) {
        int[] array = new int[]{3, 4, 102, 43, 64, 1, 4};
        Assert.assertEquals(102, Task10_048.getMax(array, array.length));
    }
}
