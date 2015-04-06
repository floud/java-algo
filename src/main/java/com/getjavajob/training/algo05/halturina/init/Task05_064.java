package com.getjavajob.training.algo05.halturina.init;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by floud on 15.03.2015.
 */
public class Task05_064 {

    /**
    * ints - population and area Array*/
    public static BigDecimal getDense(double[][] doubles) {

        double population = 0;
        double area = 0;
        for (int i = 0; i < 12; i++) {
            population += doubles[i][0];
            area += doubles[i][1];
        }
        return new BigDecimal(population/area).setScale(3, BigDecimal.ROUND_DOWN);
    }
}