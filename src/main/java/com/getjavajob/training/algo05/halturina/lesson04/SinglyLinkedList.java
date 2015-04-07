package com.getjavajob.training.algo05.halturina.lesson04;

import com.getjavajob.training.algo05.halturina.lesson03.GjjList;

/**
 * Created by halturin_a on 07.04.2015.
 */
public class SinglyLinkedList<V> implements GjjList<V> {

    @Override
    public int add(V v) {
        return 0;
    }

    @Override
    public void add(int i, V v) {

    }

    @Override
    public V get(int i) {
        return null;
    }

    @Override
    public V remove(int i) {
        return null;
    }

    @Override
    public int remove(V v) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int indexOf(V v) {
        return 0;
    }

    @Override
    public boolean contains(V v) {
        return false;
    }

    @Override
    public void set(int i, V v) {

    }

    private Node<V> last;
    private Node<V> first;
    private int size;
}
