package com.getjavajob.training.algo1503.halturina.lesson01;

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
    public static int getSumFromA() {
        int sum = 0;
        int a = new Scanner(System.in).nextInt();
        for (; a <= 500; a++) {
            sum = sum + a;
        }
        return sum;
    }

    public static int getSumToB() {
        int sum = 0;
        int b = new Scanner(System.in).nextInt();
        for (int i = -10; i <=b; i++) {
            sum = sum + i;
        }
        return sum;
    }
    public static int getSumFromAtoB() {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (; a <=b; a++) {
            sum = sum + a;
        }
        return sum;
    }
}
