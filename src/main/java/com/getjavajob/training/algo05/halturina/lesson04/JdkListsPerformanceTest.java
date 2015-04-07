package com.getjavajob.training.algo05.halturina.lesson04;

import com.getjavajob.training.algo05.halturina.util.Timer;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by halturin_a on 07.04.2015.
 */
public class JdkListsPerformanceTest {
    public static void main(String[] args) {
        ArrayList<Number> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        LinkedList<Number> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }

        Timer timer = new Timer();
        System.out.println("Addition/remove to/from the beggining test");
        System.out.println("==============================");
        timer.start();
        arrayList.add(0, 45);
        System.out.println("ArrayList.add(e): " + timer.getElapsedTime());
        timer.start();
        linkedList.add(0, 45);
        System.out.println("LinkedList.add(e): " + timer.getElapsedTime());
        System.out.println("------------");
        timer.start();
        arrayList.remove(0);
        System.out.println("ArrayList.remove(e): " + timer.getElapsedTime());
        timer.start();
        linkedList.remove(0);
        System.out.println("LinkedList.remove(e): " + timer.getElapsedTime());
        System.out.println("==============================");
        System.out.println("Addition/remove to/from the middle test");
        System.out.println("==============================");
        timer.start();
        arrayList.add(500000, 45);
        System.out.println("ArrayList.add(e): " + timer.getElapsedTime());
        timer.start();
        linkedList.add(500000, 45);
        System.out.println("LinkedList.add(e): " + timer.getElapsedTime());
        System.out.println("------------");
        timer.start();
        arrayList.remove(500000);
        System.out.println("ArrayList.remove(e): " + timer.getElapsedTime());
        timer.start();
        linkedList.remove(500000);
        System.out.println("LinkedList.remove(e): " + timer.getElapsedTime());
        System.out.println("==============================");
        System.out.println("Addition/remove to/from the end test");
        System.out.println("==============================");
        timer.start();
        arrayList.add(arrayList.size() - 1, 222);
        System.out.println("ArrayList.add(e): " + timer.getElapsedTime());
        timer.start();
        linkedList.add(linkedList.size() - 1, 222);
        System.out.println("LinkedList.add(e): " + timer.getElapsedTime());
        System.out.println("------------");
        timer.start();
        arrayList.remove(arrayList.size() - 1);
        System.out.println("ArrayList.remove(e): " + timer.getElapsedTime());
        timer.start();
        linkedList.remove(linkedList.size() - 1);
        System.out.println("LinkedList.remove(e): " + timer.getElapsedTime());
    }
}
