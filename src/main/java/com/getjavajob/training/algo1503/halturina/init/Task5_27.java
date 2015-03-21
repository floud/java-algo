package com.getjavajob.training.algo1503.halturina.init;

import java.util.Scanner;

/**
 * Created by floud on 15.03.2015.
 */
public class Task5_27 {

    public static int getSum() {
        int sum = 0;
        for (int i = 100; i<= 500; i++) {
            sum = sum + i;
        }
        return sum;
    }
    public static int getSumFromA(int a) {
        int sum = 0;
        for (; a <= 500; a++) {
            sum = sum + a;
        }
        return sum;
    }

    public static int getSumToB(int b) {
        int sum = 0;
        for (int i = -10; i <=b; i++) {
            sum = sum + i;
        }
        return sum;
    }
    public static int getSumFromAtoB(int a, int b) {
        int sum = 0;

        for (; a <=b; a++) {
            sum = sum + a;
        }
        return sum;
    }
}