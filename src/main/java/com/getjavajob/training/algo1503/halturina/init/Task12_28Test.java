package com.getjavajob.training.algo1503.halturina.init;

import com.getjavajob.training.algo1503.halturina.init.util.Assert;

/**
 * Created by floud on 21.03.2015.
 */
public class Task12_28Test {
    public static void main(String[] args) {
        int[][] ints = { {1,   2,   3,   4,   5,   6},
                {20,  21,  22,  23,  24,  7},
                {19,  32,  33,  34,  25,  8},
                {18,  31,  36,  35,  26,  9},
                {17,  30, 29,  28, 27,  10,},
                {16,  15,  14,  13,  12,  11}
    };
        Assert.assertEquals(ints, Task12_28.fillArray(6));
    }
}
