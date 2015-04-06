package com.getjavajob.training.algo05.halturina.lesson04;

import com.getjavajob.training.algo05.halturina.util.Assert;

/**
 * Created by floud on 06.04.2015.
 */
public class DoublyLinkedListTest {
    public static void main(String[] args) {
        // Fill Array with numbers
        DoublyLinkedList<Number> numberDoublyLinkedList = new DoublyLinkedList<>();
        for (int i = 0; i < 15; i++) {
            numberDoublyLinkedList.add(i);
        }
        /* Test cases for add elements in the beginning, middle and end */
        numberDoublyLinkedList.add(0, 17);
        for (int i = 0; i < numberDoublyLinkedList.size(); i++) {
            System.out.printf(numberDoublyLinkedList.get(i) + " ");
        }
        System.out.println();
        Assert.assertEquals(17, numberDoublyLinkedList.get(0));
        numberDoublyLinkedList.add(numberDoublyLinkedList.size() / 2, 20);
        Assert.assertEquals(20, numberDoublyLinkedList.get(numberDoublyLinkedList.size() / 2));
        for (int i = 0; i < numberDoublyLinkedList.size(); i++) {
            System.out.printf(numberDoublyLinkedList.get(i) + " ");
        }
        System.out.println();
        numberDoublyLinkedList.add(numberDoublyLinkedList.size(), 23);
        Assert.assertEquals(23, numberDoublyLinkedList.get(numberDoublyLinkedList.size() - 1));
        for (int i = 0; i < numberDoublyLinkedList.size(); i++) {
            System.out.printf(numberDoublyLinkedList.get(i) + " ");
        }
        System.out.println();

        //Test cases for remove elements from the beggining, middle and end
        Assert.assertEquals(17, numberDoublyLinkedList.remove(0));
        for (int i = 0; i < numberDoublyLinkedList.size(); i++) {
            System.out.printf(numberDoublyLinkedList.get(i) + " ");
        }
        System.out.println();
        Assert.assertEquals(7, numberDoublyLinkedList.remove(8));
        for (int i = 0; i < numberDoublyLinkedList.size(); i++) {
            System.out.printf(numberDoublyLinkedList.get(i) + " ");
        }
        System.out.println();
        Assert.assertEquals(23, numberDoublyLinkedList.remove(numberDoublyLinkedList.size() - 1));
        for (int i = 0; i < numberDoublyLinkedList.size(); i++) {
            System.out.printf(numberDoublyLinkedList.get(i) + " ");
        }
        System.out.println();
    }
}
