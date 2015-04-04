package com.getjavajob.training.algo05.halturina.init;

import com.getjavajob.training.algo05.halturina.util.Assert;

/**
 * Created by floud on 17.03.2015.
 */
public class Task12_23Test {
    public static void main(String[] args) {
        int[][] integersA = new int[][]{
                {1, 0, 0, 0, 0, 0, 1},
                {0, 1, 0, 0, 0, 1, 0},
                {0, 0, 1, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 0, 1, 0},
                {1, 0, 0, 0, 0, 0, 1}
        };
        Assert.assertEquals(integersA, Task12_23.fillArrayA());

        int[][] integersB =new int[][]{
                {1, 0, 0, 1, 0, 0, 1},
                {0, 1, 0, 1, 0, 1, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {1, 1, 1, 1, 1, 1, 1},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 1, 0, 1, 0, 1, 0},
                {1, 0, 0, 1, 0, 0, 1}
        };
        Assert.assertEquals(integersB, Task12_23.fillArrayB());

        int[][] integersV = new int[][]{
                {1, 1, 1, 1, 1, 1, 1},
                {0, 1, 1, 1, 1, 1, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 1, 1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1, 1, 1}
        };
        Assert.assertEquals(integersV, Task12_23.fillArrayV());
    }
}
