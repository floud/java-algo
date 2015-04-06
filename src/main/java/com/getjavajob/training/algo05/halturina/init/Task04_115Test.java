package com.getjavajob.training.algo05.halturina.init;

import com.getjavajob.training.algo05.halturina.util.Assert;

/**
 * Created by floud on 18.03.2015.
 */
public class Task04_115Test {
    public static void main(String[] args) {
        Assert.assertEquals("Петух, Красный", Task04_115.getMoonYear(2015)); // testHome for invalid input
        Assert.assertEquals("Овца, Зеленый", Task04_115.getMoonYear(2015)); // valid input
        Assert.assertEquals("Тигр, Черный", Task04_115.getMoonYear(2022)); // valid input
    }
}
