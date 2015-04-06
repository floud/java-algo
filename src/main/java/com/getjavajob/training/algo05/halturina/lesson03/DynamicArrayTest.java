package com.getjavajob.training.algo05.halturina.lesson03;

import com.getjavajob.training.algo05.halturina.util.Assert;

import java.util.LinkedList;

/**
 * Created by floud on 04.04.2015.
 */
public class DynamicArrayTest {
    public static void main(String[] args) {
        // Fill Array with numbers
        DynamicArray<Number> numberDynamicArray = new DynamicArray<>(15);
        for (int i = 0; i < 15; i++) {
            numberDynamicArray.add(i);
        }
        /* Test cases for add elements in the beginning, middle and end */
        numberDynamicArray.add(0, 17);
        for (int i = 0; i < numberDynamicArray.size(); i++) {
            System.out.printf(numberDynamicArray.get(i) + " ");
        }
        System.out.println();
        Assert.assertEquals(17, numberDynamicArray.get(0));
        numberDynamicArray.add(numberDynamicArray.size() / 2, 20);
        Assert.assertEquals(20, numberDynamicArray.get(numberDynamicArray.size() / 2));
        for (int i = 0; i < numberDynamicArray.size(); i++) {
            System.out.printf(numberDynamicArray.get(i) + " ");
        }
        System.out.println();
        numberDynamicArray.add(numberDynamicArray.size(), 23);
        Assert.assertEquals(23, numberDynamicArray.get(numberDynamicArray.size() - 1));
        for (int i = 0; i < numberDynamicArray.size(); i++) {
            System.out.printf(numberDynamicArray.get(i) + " ");
        }
        System.out.println();

        //Test cases for remove elements from the beggining, middle and end
        Assert.assertEquals(17, numberDynamicArray.remove(0));
        for (int i = 0; i < numberDynamicArray.size(); i++) {
            System.out.printf(numberDynamicArray.get(i) + " ");
        }
        System.out.println();
        Assert.assertEquals(7, numberDynamicArray.remove(8));
        for (int i = 0; i < numberDynamicArray.size(); i++) {
            System.out.printf(numberDynamicArray.get(i) + " ");
        }
        System.out.println();
        Assert.assertEquals(23, numberDynamicArray.remove(numberDynamicArray.size() - 1));
        for (int i = 0; i < numberDynamicArray.size(); i++) {
            System.out.printf(numberDynamicArray.get(i) + " ");
        }
        System.out.println();

        LinkedList<Object> objects = new LinkedList<>();

    }
}
