package com.getjavajob.training.algo05.halturina.init;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by floud on 15.03.2015.
 */
public class Task5_10 {

    public static void printCurrExchange() {
        double currencyRate = new Scanner(System.in).nextDouble();
        for (int i = 1; i <=20; i++) {
            System.out.println(i + " " + new BigDecimal(i*currencyRate).setScale(2, BigDecimal.ROUND_UP));
        }
    }
}