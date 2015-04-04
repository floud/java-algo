package com.getjavajob.training.algo05.halturina.init;

/**
 * Created by floud on 21.03.2015.
 */
public class Task12_63 {
    public static int[][] students;
    public static int[] getAverageCountOfStudents(int[][] students) {
        int[] averageCount = new int[students.length];
        for (int i = 0; i < students.length; i++) {
            int avg = 0; // avg = count of students in 1 parallel;
            for (int j = 0; j < students[i].length; j++) {
                avg += students[i][j];
            }
            averageCount[i] = avg/4;
        }
        return averageCount;
    }

}
