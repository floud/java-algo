package com.getjavajob.training.algo1503.halturina.init;

import com.getjavajob.training.algo1503.halturina.init.util.Assert;

import java.util.Arrays;

/**
 * Created by floud on 19.03.2015.
 */
public class Task12_134Test {
    public static void main(String[] args) {
        int[][] ints = {
                {2 , 4, 5},
                {4, 5, 3,},
                {3, 54, 32},
                {324, 54, 32}
        };
        int[][] ints2 = {
                {21 , 46, 5},
                {76, 5, 3,},
                {3, 54, 312},
                {34, 534, 32}
        };
        int[][] intsRemovedSecondLine = {
                {2, 4, 5},
                {3, 54, 32},
                {324, 54, 32},
                {0, 0, 0}
        } ;
        int[][] intsRemovedSecondColumn = {
                {21, 5, 0},
                {76, 3, 0},
                {3, 312, 0},
                {34, 32, 0}
        };
        Assert.assertEquals(intsRemovedSecondLine, Task12_134.removeLine(ints, 1));
        Assert.assertEquals(intsRemovedSecondColumn, Task12_134.removeColumn(ints2, 1));


    }

}
