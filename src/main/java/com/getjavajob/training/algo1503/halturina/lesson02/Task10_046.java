package com.getjavajob.training.algo1503.halturina.lesson02;

/**
 * Created by floud on 01.04.2015.
 */
public class Task10_046 {
    private static int count = 1;
    private static int currentNumber; //current number on each call of recursive function
    private static int sumTmp; //current sum of all elements on each call of recursive function

    public static double getNumber(int a, int b, int n) {
        currentNumber = a * b;
        count++;
        if (count == n) {
            return currentNumber;
        } else {
            return getNumber(currentNumber, b, n);
        }
    }

    public static double getSum(int a, int b, int n) {
        currentNumber = a * b;
        if (count == 1) {
            sumTmp += a + currentNumber;
        } else {
            sumTmp += currentNumber;
        }
        count++;
        if (count == n) {
            return sumTmp;
        } else {
            return getSum(currentNumber, b, n);
        }
    }

    public static void resetStaticVariables() {
        count = 1;
        currentNumber = 0;
        sumTmp = 0;
    }
}
