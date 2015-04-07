package com.getjavajob.training.algo05.halturina.lesson04;


import com.getjavajob.training.algo05.halturina.util.Timer;

import java.util.LinkedList;

/**
 * Created by floud on 06.04.2015.
 */
public class DoublyLinkedPerfomarmanceTest {
    public static void main(String[] args) {
        DoublyLinkedList<Number> doublyLinkedList = new DoublyLinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            doublyLinkedList.add(i);
        }
        LinkedList<Number> numbers = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            numbers.add(i);
        }

        Timer timer = new Timer();
        System.out.println("Addition/remove to/from the beggining test");
        System.out.println("==============================");
        timer.start();
        doublyLinkedList.add(0, 45);
        System.out.println("DoublyLinkedList.add(e): " + timer.getElapsedTime());
        timer.start();
        numbers.add(0, 45);
        System.out.println("LinkedList.add(e): " + timer.getElapsedTime());
        System.out.println("------------");
        timer.start();
        doublyLinkedList.remove(0);
        System.out.println("DoublyLinkedList.remove(e): " + timer.getElapsedTime());
        timer.start();
        numbers.remove(0);
        System.out.println("LinkedList.remove(e): " + timer.getElapsedTime());
        System.out.println("==============================");
        System.out.println("Addition/remove to/from the middle test");
        System.out.println("==============================");
        timer.start();
        doublyLinkedList.add(500000, 45);
        System.out.println("DoublyLinkedList.add(e): " + timer.getElapsedTime());
        timer.start();
        numbers.add(500000, 45);
        System.out.println("LinkedList.add(e): " + timer.getElapsedTime());
        System.out.println("------------");
        timer.start();
        doublyLinkedList.remove(500000);
        System.out.println("DoublyLinkedList.remove(e): " + timer.getElapsedTime());
        timer.start();
        numbers.remove(500000);
        System.out.println("LinkedList.remove(e): " + timer.getElapsedTime());
        System.out.println("==============================");
        System.out.println("Addition/remove to/from the end test");
        System.out.println("==============================");
        timer.start();
        doublyLinkedList.add(doublyLinkedList.size() - 1, 222);
        System.out.println("DoublyLinkedList.add(e): " + timer.getElapsedTime());
        timer.start();
        numbers.add(numbers.size() - 1, 222);
        System.out.println("LinkedList.add(e): " + timer.getElapsedTime());
        System.out.println("------------");
        timer.start();
        doublyLinkedList.remove(doublyLinkedList.size() - 1);
        System.out.println("DoublyLinkedList.remove(e): " + timer.getElapsedTime());
        timer.start();
        numbers.remove(numbers.size() - 1);
        System.out.println("LinkedList.remove(e): " + timer.getElapsedTime());
    }
}
