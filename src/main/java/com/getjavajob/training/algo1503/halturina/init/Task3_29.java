package com.getjavajob.training.algo1503.halturina.init;

/**
 * Created by floud on 15.03.2015.
 */
public class Task3_29 {

    public static boolean getA(int x, int y) {
        return x/2 != 0 && y/2 != 0;
    }
    public static boolean getB(int x, int y){
        return x < 20 ^ y < 20;
    }
    public static boolean getV(int x, int y) {
        return x <= 2 || y <= 2;
    }
    public static boolean getG(int x, int y, int z){
        return x < 0 && y < 0 && z < 0;
    }
    public static boolean getD(int x, int y, int z) {
        return x <= 3 ^ y <= 3 ^ z <= 3;
    }
    public static boolean getE(int x, int y, int z) {
        return x > 100 || y > 100 || z > 100;
    }
}

