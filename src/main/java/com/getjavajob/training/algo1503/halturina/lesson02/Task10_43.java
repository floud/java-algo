package com.getjavajob.training.algo1503.halturina.lesson02;

/**
 * Created by halturin_a on 24.03.2015.
 */
public class Task10_43 {

    public static int sumOfNumbers(int a) {
        int summ = 0;
        if (a == 0) {
            return 0;
        }
        summ += a % 10;
        summ += sumOfNumbers(a / 10);
        return summ;

    }

    public static int countOfNumbers(int a) {
        int count = 0;
        if (a <= 1) {
            return 0;
        }
        //count++;
        count += countOfNumbers(a / 10);
        return ++count;

    }
}
