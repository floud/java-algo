package com.getjavajob.training.algo1503.halturina.init;

import com.getjavajob.training.algo1503.halturina.init.util.Assert;

/**
 * Created by floud on 17.03.2015.
 */
public class Task11_158Test {
    public static void main(String[] args) {
        int[] ints = {4, 4, 5, 3, 3, 45, 32, 45, 33, 33, 22};
        Assert.assertEquals("[4, 5, 3, 45, 32, 33, 22, 0, 0, 0, 0]", Task11_158.removeDuplicates(ints));

    }
}
