package com.getjavajob.training.algo05.halturina.lesson03;

import com.getjavajob.training.algo05.halturina.util.Timer;

import java.util.ArrayList;

/**
 * Created by floud on 04.04.2015.
 */
public class DynamicArrayPerformanceTest {
    public static void main(String[] args) {
        DynamicArray<Number> numberDynamicArray = new DynamicArray<>(1000000);
        for (int i = 0; i < 1000000; i++) {
            numberDynamicArray.add(i);
        }
        ArrayList<Number> numbers = new ArrayList<>(1000000);
        for (int i = 0; i < 1000000; i++) {
            numbers.add(i);
        }

        Timer timer = new Timer();
        System.out.println("Addition/remove to/from the beggining test");
        System.out.println("==============================");
        timer.start();
        numberDynamicArray.add(0, 45);
        System.out.println("DynamicArray.add(e): " + timer.getElapsedTime());
        timer.start();
        numbers.add(0, 45);
        System.out.println("ArrayList.add(e): " + timer.getElapsedTime());
        System.out.println("------------");
        timer.start();
        numberDynamicArray.remove(0);
        System.out.println("DynamicArray.remove(e): " + timer.getElapsedTime());
        timer.start();
        numbers.remove(0);
        System.out.println("ArrayList.remove(e): " + timer.getElapsedTime());
        System.out.println("==============================");
        System.out.println("Addition/remove to/from the middle test");
        System.out.println("==============================");
        timer.start();
        numberDynamicArray.add(500000, 45);
        System.out.println("DynamicArray.add(e): " + timer.getElapsedTime());
        timer.start();
        numbers.add(500000, 45);
        System.out.println("ArrayList.add(e): " + timer.getElapsedTime());
        System.out.println("------------");
        timer.start();
        numberDynamicArray.remove(500000);
        System.out.println("DynamicArray.remove(e): " + timer.getElapsedTime());
        timer.start();
        numbers.remove(500000);
        System.out.println("ArrayList.remove(e): " + timer.getElapsedTime());
        System.out.println("==============================");
        System.out.println("Addition/remove to/from the end test");
        System.out.println("==============================");
        timer.start();
        numberDynamicArray.add(numberDynamicArray.size() - 1, 222);
        System.out.println("DynamicArray.add(e): " + timer.getElapsedTime());
        timer.start();
        numbers.add(numbers.size() - 1, 222);
        System.out.println("ArrayList.add(e): " + timer.getElapsedTime());
        System.out.println("------------");
        timer.start();
        numberDynamicArray.remove(numberDynamicArray.size() - 1);
        System.out.println("DynamicArray.remove(e): " + timer.getElapsedTime());
        timer.start();
        numbers.remove(numbers.size() - 1);
        System.out.println("ArrayList.remove(e): " + timer.getElapsedTime());

    }
}
