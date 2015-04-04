package com.getjavajob.training.algo05.halturina.lesson02;

/**
 * Created by halturin_a on 31.03.2015.
 */
public class Task10_056 {

    private static int devisor = 2;
    public static void resetDevisor(){
        devisor = 2;
    }
    public static boolean isSimple(int a) {
        if (a == devisor) {
            return true;
        } else if (a % devisor == 0) {
            return false;
        } else {
            devisor++;
            return isSimple(a);
        }
    }
}
