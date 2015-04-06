package com.getjavajob.training.algo05.halturina.init;

/**
 * Created by floud on 16.03.2015.
 */
public class Task05_064Test {
    public static void main(String[] args) {
        //Population-area array;
        double[][] doubles = {
                {300, 12},
                {200, 5},
                {23, 1},
                {23, 4},
                {100, 10},
                {234, 33},
                {243, 56},
                {56, 10},
                {673, 100},
                {3443, 464},
                {3, 15},
                {8, 90}
        };

        System.out.println("Average density in region is  = " + Task05_064.getDense(doubles) + " thousands of people for square km");
    }
}
