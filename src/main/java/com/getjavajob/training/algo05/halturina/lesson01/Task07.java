package com.getjavajob.training.algo05.halturina.lesson01;

/**
 * Created by halturin_a on 23.03.2015.
 */
public class Task07 {
    public static void main(String[] args) {

        byte b = -1;
        char c = (char) b;
        int a = c;
        System.out.println(b + " " + c + " " + a);
    }

    public static String swapOneBitwise(int a, int b) {
        a = a ^ b;
        b = b ^ a;
        a = a ^ b;
        return a + " " + b;
    }


    public static String swapTwoBitwise(int a, int b) {
        a = ~a & b | ~b & a;
        b = ~a & b | ~b & a;
        a = ~a & b | ~b & a;
        return "" + a + " " + b;
    }

    public static String swapOneArifm(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        return a + " " + b;
    }

    public static String swapTwoArifm(int a, int b) {
        a = a * b;
        b = a / b;
        a = a / b;
        return a + " " + b;
    }
}