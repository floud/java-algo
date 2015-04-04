package com.getjavajob.training.algo05.halturina.lesson02;

/**
 * Created by halturin_a on 25.03.2015.
 */
public class Task10_045 {

    private static int count = 1;
    private static int currentNumber; //current number on each call of recursive function
    private static int sumTmp; //current sum of all elements on each call of recursive function

    public static double getNumber(int a, int b, int n) {
        currentNumber = a + b;
        count++;
        if (count == n) {
            return currentNumber;
        } else {
            return getNumber(currentNumber, b, n);
        }
    }

    public static double getSum(int a, int b, int n) {
        int currentNumber = a + b;
        if (count == 1) {
            sumTmp += a + currentNumber;
        } else {
            sumTmp += currentNumber;
        }
        Task10_045.currentNumber = a + b;
        count++;
        if (count == n) {
            return sumTmp;
        } else {
            return getSum(Task10_045.currentNumber, b, n);
        }
    }

    public static void resetStaticVariables() {
        count = 1;
        currentNumber = 0;
        sumTmp = 0;
    }
}
