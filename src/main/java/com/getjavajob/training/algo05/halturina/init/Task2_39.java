package com.getjavajob.training.algo05.halturina.init;

/**
 * Created by floud on 15.03.2015.
 */
public class Task2_39 {


    public static double getAngle(int h, int m,  int s) {
        if (h > 12) {
            h-= 12;
        }
        double angle = 360* (h + (double)m/60 + (double)s/3600)/12;
        if (angle > 180) {
            angle -= 180;
        }
        return angle;
    }

}
