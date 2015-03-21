package com.getjavajob.training.algo1503.halturina.init;

import com.getjavajob.training.algo1503.halturina.init.util.Assert;

/**
 * Created by floud on 18.03.2015.
 */
public class Task4_115Test {
    public static void main(String[] args) {
        Assert.assertEquals("Петух, Красный", Task4_115.getMoonYear(2015)); // testHome for invalid input
        Assert.assertEquals("Овца, Зеленый", Task4_115.getMoonYear(2015)); // valid input
        Assert.assertEquals("Тигр, Черный", Task4_115.getMoonYear(2022)); // valid input
    }
}
