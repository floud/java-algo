package com.getjavajob.training.algo05.halturina.lesson03;

import java.util.Arrays;

/**
 * Created by floud on 04.04.2015.
 */
public class DynamicArray<E> implements GjjList<E> {
    private E[] elements;
    private int numberOfElements;

    public DynamicArray(int i) {
        elements = (E[]) new Object[i];
    }

    public DynamicArray() {
        this(10);
    }

    @Override
    public int add(E e) {
        try {
            elements[numberOfElements] = e;
        } catch (ArrayIndexOutOfBoundsException ex) {
            maximizeArray();
            elements[numberOfElements] = e;
        }
        return numberOfElements++;
    }

    private void maximizeArray() {
        int newLength = (int) (elements.length * 1.5);
        elements = Arrays.copyOf(elements, newLength);
    }

    @Override
    public void add(int i, E e) {
        try {
            System.arraycopy(elements, i, elements, i + 1, numberOfElements - i);
        } catch (ArrayIndexOutOfBoundsException ex) {
            maximizeArray();
            System.arraycopy(elements, i, elements, i + 1, numberOfElements - i);
        }
        elements[i] = e;
        numberOfElements++;
    }

    @Override
    public E get(int i) throws IndexOutOfBoundsException {
        return elements[i];
    }

    @Override
    public E remove(int i) {
        E removed = elements[i];
        if (i < numberOfElements - 1) {
            System.arraycopy(elements, i + 1, elements, i, numberOfElements - i);
        } else if (i == numberOfElements) {
            elements[numberOfElements] = null;
        }
        numberOfElements--;
        return removed;
    }

    @Override
    public int remove(E e) {
        int i = 0;
        for (; i < numberOfElements; i++) {
            if (elements[i].equals(e)) {
                remove(i);
            }
        }
        return i;
    }

    @Override
    public int size() {
        return numberOfElements;
    }

    @Override
    public int indexOf(E e) {
        int i = 0;
        for (; i < numberOfElements; i++) {
            if (elements[i].equals(e)) {
                break;
            }
        }
        return i;
    }

    @Override
    public boolean contains(E e) {
        int i = 0;
        for (; i < numberOfElements; i++) {
            if (elements[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void set(int i, E e) {
        elements[i] = e;
    }
}
