package com.getjavajob.training.algo05.halturina.init;

import java.util.Scanner;

/**
 * Created by floud on 15.03.2015.
 */
public class Task1_17 {
    public static double getO(double x) {

        return Math.sqrt(1 - (1 - Math.cos(2*x))/2);
    }
    public static double getP(double a,double x, double b, double c) {

        return 1 / (Math.sqrt(a * Math.pow(x, 2) + b * x + c));
    }
    public static double getR(double x) {

        return (Math.sqrt(x + 1) + Math.sqrt(x - 1)) / 2 * Math.sqrt(x);
    }

    public static double getS(double x) {
        return Math.abs(x) + Math.abs(x + 1);
    }


}
