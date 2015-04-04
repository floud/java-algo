package com.getjavajob.training.algo05.halturina.lesson03;

/**
 * Created by floud on 04.04.2015.
 */
public interface GjjList<E> {
    int add(E e);

    void add(int i, E e);

    E get(int i);

    E remove(int i);

    int remove(E e);

    int size();

    int indexOf(E e);

    boolean contains(E e);

    void set(int i, E e);
}
