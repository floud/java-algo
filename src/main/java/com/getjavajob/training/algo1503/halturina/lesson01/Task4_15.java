package com.getjavajob.training.algo1503.halturina.lesson01;

/**
 * Created by Cloud on 15.03.2015.
 */
public class Task4_15 {

    public static void main(String[] args) {
        getAge();
    }
    public static void getAge() {
        int thisYear = 2015;
        int thisMonth = 3;
        int birthYear = 1984;
        int birthMonth = 9;
        int age = thisYear - birthYear - 1;
        if (thisMonth >= birthMonth) age++;
        System.out.println(age);
    }
}
