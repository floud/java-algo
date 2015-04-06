package com.getjavajob.training.algo05.halturina.init;

import java.util.Scanner;

/**
 * Created by floud on 16.03.2015.
 */
public class Task06_087 {
    public static String game() {
        int a = 0; //team #1 score
        int b = 0; //team #2 score
        int a1; //each obe score tram #1
        int b1; //each one score team #2
        Scanner scanner = new Scanner(System.in);
        while (true) {

            a1 = scanner.nextInt();
            if (a1 == 0) break;
            if (a1 < 1 || a1 > 3) continue;
            a += a1;
            System.out.println("team #1- " + a + " team #2- " + b);
            b1 = scanner.nextInt();
            if (b1 == 0) break;
            if (b1 < 1 || b1 > 3) continue;
            b += b1;
            System.out.println("team #1- " + a + " team #2- " + b);
        }
        if (a > b) {
            return "Final scores: team #1 - " + a + " team #2 - " + b + ", Team #1 win!";
        } else {
            if (a < b) {
                return "Final scores: team #1 - " + a + " team #2 - " + b + ", Team #2 win!";
            } else {
                return "Final scores: team #1 - " + a + " team #2 - " + b + ", that's a draw!";
            }
        }


    }
}
