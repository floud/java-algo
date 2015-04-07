package com.getjavajob.training.algo05.halturina.lesson04;

import com.getjavajob.training.algo05.halturina.util.Assert;

/**
 * Created by floud on 07.04.2015.
 */
public class SinglyLinkedListTest {
    public static void main(String[] args) {
        SinglyLinkedList<Number> numberSinglyLinkedList = new SinglyLinkedList<>();
        for (int i = 0; i < 10; i++) {
            numberSinglyLinkedList.add(i);
        }
        Assert.assertEquals("9 8 7 6 5 4 3 2 1 0 ", numberSinglyLinkedList.reverseNodes());
    }
}
