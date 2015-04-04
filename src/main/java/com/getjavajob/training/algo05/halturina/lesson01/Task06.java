package com.getjavajob.training.algo05.halturina.lesson01;

/**
 * Created by floud on 22.03.2015.
 */
public class Task06 {


    /**
     * Calculate 2^n
     *
     * @param n degree
     * @return 2 degree n
     */
    public static int getSolutionA(int n) {
        return 1 << n;
    }

    /**
     * Calculates 2^n + 2^m
     *
     * @param n 1st degree
     * @param m 2nd degree
     * @return 2^ n + 2^m
     */
    public static int getSolutionB(int n, int m) {
        return 1 << n | 1 << m;
    }

    /**
     * Reset n lower bits
     *
     * @param a initial number
     * @param n the count of lower bits, that must be reset.
     * @return number, whose n lower bits is reset
     */
    public static int getSolutionC(int a, int n) {
        return a & (~1 << n - 1);
    }

    /**
     * Set number a n-th bit to 1
     *
     * @param a int number
     * @param n the bit
     * @return number, whose n-th bit set with 1.
     */
    public static int getSolutionD(int a, int n) {
        return a | 1 << n;
    }

    /**
     * Invert n-th bit of number 'a'
     *
     * @param a number
     * @param n bit
     * @return int number, whose n-th bit inverted
     */
    public static int getSolutionE(int a, int n) {
        return a ^ 1 << n;
    }

    /**
     * set n-th bit with 0
     *
     * @param a int number
     * @param n bit
     * @return int number, whose n-th bit set with 0
     */
    public static int getSolutionF(int a, int n) {
        return a & ~(1 << n);
    }

    /**
     * return n lower bits
     *
     * @param a int number
     * @param n bit
     * @return int number
     */
    public static int getSolutionG(int a, int n) {
        return a & ~(~0 << n + 1);
    }

    /**
     * return n-th bit
     *
     * @param a int number
     * @param n bit
     * @return nth bit of number 'a'
     */
    public static int getSolutionH(int a, int n) {
        if ((a & (1 << n)) == 1 << n) {
            return 1;
        } else return 0;
    }

    /**
     * return bin representation of byte
     *
     * @param a byte number
     * @return bin representation of byte number 'a'
     */
    public static String getSolutionI(byte a) {
        String stringRepresentation = new String();
        while (true) {
            if (a == 0) break;
            if (a % 2 == 0) {
                a = (byte) (a / 2);
                stringRepresentation = 0 + stringRepresentation;
            } else {
                a = (byte) (a / 2);
                stringRepresentation = 1 + stringRepresentation;
            }
        }
        return stringRepresentation;

    }
}
