package com.getjavajob.training.algo05.halturina.init;

/**
 * Created by floud on 19.03.2015.
 */
public class Task12_25 {

    public static void fillArrayA() {
        int[][] ints = new int[12][10];
        int k = 1;
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 10; j++) {
                ints[i][j] = k++;

            }
        }
    }
    public static void fillArrayB() {
        int[][] ints = new int[12][10];
        int k;
        for (int i = 0; i < 12; i++) {
            k = i + 1;
            for (int j = 0; j < 10; j++) {
                ints[i][j] = k;
                k += 12;

            }

        }
    }
    public static void fillArrayV() {
        int[][] ints = new int[12][10];
        int k;
        int m = 1;
        for (int i = 0; i < 12; i++) {
            k = m*10;
            for (int j = 0; j < 10; j++) {
                ints[i][j] = k--;
            }
            m++;
        }
    }
    public static void fillArrayG() {
        int[][] ints = new int[12][10];
        int k;
        int m = 1;
        for (int i = 0; i < 12; i++) {
            k = 13 - m;
            for (int j = 0; j < 10; j++) {
                ints[i][j] = k;
                k += 12;
                System.out.printf(ints[i][j] + ", ");
            }
            m++;
            System.out.println();
        }
    }
    public static void fillArrayD() {
        int[][] ints = new int[10][12];
        int k = 1;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 12; j++){
                    ints[i][j] = k++;
                }
            } else {
                for (int j = 11; j >= 0; j--) {
                    ints[i][j] = k++;
                }
            }
        }
    }
    public static void fillArrayE() {
        int[][] ints = new int[12][10];
        int k = 1;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 12; j++){
                    ints[j][i] = k++;
                }
            } else {
                for (int j = 11; j >= 0; j--) {
                    ints[j][i] = k++;
                }
            }
        }

    }
    public static void fillArrayZh() {
        int[][] ints = new int[12][10];
        int k = 120;
        for (int i = 0; i < 12; i++) {
            for (int j = 9; j >= 0; j--) {
                ints[i][j] = k--;
            }
        }
    }
    public static void fillArrayZ() {
        int[][] ints = new int[12][10];
        int k = 1;
        for (int j = 9; j >= 0 ; j--) {
            for (int i = 0; i < 12; i++) {
                ints[i][j] = k++;
            }
        }

    }
    public static void fillArrayI() {
        int[][] ints = new int[12][10];
        int k = 1;
        for (int i = 11; i >= 0; i--) {
            for (int j = 9; j >= 0 ; j--) {
                    ints[i][j] = k++;
                }
        }

    }
    public static void fillArrayK() {
        int[][] ints = new int[12][10];
        int k = 1;
        for (int j = 9; j >= 0; j--) {
            for (int i = 11; i >= 0 ; i--) {
                ints[i][j] = k++;
            }
        }

    }
    public static void fillArrayL() {
        int[][] ints = new int[12][10];
        int k = 1;
        for (int i = 11; i >= 0; i--) {
            if (i % 2 != 0) {
                for (int j = 0; j < 10; j++) {
                    ints[i][j] = k++;
                }
            } else {
                for (int j = 9; j >= 0; j--) {
                    ints[i][j] = k++;
                }
            }

        }

    }
    public static void fillArrayM() {
        int[][] ints = new int[12][10];
        int k = 1;
        for (int i = 0; i < 12; i++) {
            if (i % 2 == 0) {
                for (int j = 9; j >= 0; j--) {
                    ints[i][j] = k++;
                }
            } else {
                for (int j = 0; j < 10; j++) {
                    ints[i][j] = k++;
                }
            }

        }

    }
    public static void fillArrayN() {
        int[][] ints = new int[12][10];
        int k = 1;
        for (int j = 9; j >= 0; j--) {
            if (j % 2 != 0) {
                for (int i = 0; i < 12; i++) {
                    ints[i][j] = k++;
                }
            } else {
                for (int i = 11; i >= 0; i--) {
                    ints[i][j] = k++;
                }
            }

        }

    }
    public static void fillArrayO() {
        int[][] ints = new int[12][10];
        int k = 1;
        for (int j = 0; j < 10; j++) {
            if (j % 2 == 0) {
                for (int i = 11; i >= 0; i--) {
                    ints[i][j] = k++;
                }
            } else {
                for (int i = 0; i < 12; i++) {
                    ints[i][j] = k++;
                }
            }

        }


    }
    public static void fillArrayP() {
        int[][] ints = new int[12][10];
        int k = 1;
        for (int i = 11; i >= 0; i--) {
            if (i % 2 != 0) {
                for (int j = 9; j >= 0; j--) {
                    ints[i][j] = k++;
                }
            } else {
                for (int j = 0; j < 10; j++) {
                    ints[i][j] = k++;
                }
            }
        }

    }
    public static void fillArrayR() {
        int[][] ints = new int[12][10];
        int k = 1;
        for (int j = 9; j >= 0; j--) {
            if (j % 2 != 0) {
                for (int i = 11; i >= 0; i--) {
                    ints[i][j] = k++;
                }
            } else {
                for (int i = 0; i < 12; i++) {
                    ints[i][j] = k++;
                }
            }
        }

    }
}
