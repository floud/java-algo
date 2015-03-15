package com.getjavajob.training.algo1503.halturina.lesson01;

import java.util.Scanner;

/**
 * Created by floud on 15.03.2015.
 */
public class Task5_64 {

    public static double getDense() {

        int population = 0;
        int area = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 12; i++) {
            population = population + scanner.nextInt();
            area = area + scanner.nextInt();
        }
        return population/area;
    }
}
