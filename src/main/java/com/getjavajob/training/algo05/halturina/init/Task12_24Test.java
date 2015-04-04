package com.getjavajob.training.algo05.halturina.init;

import com.getjavajob.training.algo05.halturina.util.Assert;

/**
 * Created by floud on 19.03.2015.
 */
public class Task12_24Test {
    public static void main(String[] args) {
        Assert.assertEquals(new int[][]{
                {1, 1, 1, 1, 1, 1},
                {1, 2, 3, 4, 5, 6},
                {1, 3, 6, 10, 15, 21},
                {1, 4, 10, 20, 35, 56},
                {1, 5, 15, 35, 70, 126},
                {1, 6, 21, 56, 126, 252}
        }, Task12_24.fillArrayA());
        Assert.assertEquals(new int[][]{
                {1, 2, 3, 4, 5, 6},
                {2, 3, 4, 5, 6, 1},
                {3, 4, 5, 6, 1, 2},
                {4, 5, 6, 1, 2, 3},
                {5, 6, 1, 2, 3, 4},
                {6, 1, 2, 3, 4, 5},
        }, Task12_24.fillArrayB());
    }
}
