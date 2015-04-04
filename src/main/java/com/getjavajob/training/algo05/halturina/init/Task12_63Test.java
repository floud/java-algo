package com.getjavajob.training.algo05.halturina.init;

import java.util.Arrays;

/**
 * Created by floud on 21.03.2015.
 */
public class Task12_63Test {
    public static void main(String[] args) {
        int[][] students = {
                {23, 34, 23, 23},
                {32, 45, 22, 23},
                {12, 27, 18, 31},
                {20, 17, 29, 13},
                {33, 21, 15, 15},
                {22, 27, 17, 38},
                {11, 15, 16, 10},
                {6, 32, 16, 18},
                {21, 12, 18, 15},
                {21, 26, 20, 12},
                {11, 17, 12, 22},

        };
        System.out.println("Average count of students by parallel is - " + Arrays.toString(Task12_63.getAverageCountOfStudents(students)));
    }
}
