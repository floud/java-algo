package com.getjavajob.training.algo05.halturina.lesson04;

import com.getjavajob.training.algo05.halturina.lesson03.GjjList;

/**
 * Created by halturin_a on 06.04.2015.
 */
public class DoublyLinkedList<E> implements GjjList<E> {

    private Element<E> first;
    private Element<E> last;
    private int size;

    private boolean isNull() {
        return size == 0;
    }

    @Override
    public int add(E e) {
        if (isNull()) {
            Element<E> element = new Element<E>(null, null, e);
            first = element;
            last = element;
        } else {
            Element<E> element = new Element<E>(last, null, e);
            last.setNext(element);
            last = element;
        }
        return size++;
    }

    private Element iterate(int i) {
        Element current;
        if (i > (size() - 1) || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + " Max: " + (size() - 1) + " Min: 0");
        } else if (i < size() / 2) {
            current = first;
            for (int j = 1; j <= i; j++) {
                current = current.getNext();
            }
        } else {
            current = last;
            for (int j = size() - 1; j > i; j--) {
                current = current.getPrev();
            }
        }
        return current;
    }

    @Override
    public void add(int i, E e) {
        Element element = new Element(e);
        if (i == size()) {
            add(e);
        } else if (i == 0) {
            element.setNext(first);
            first.setPrev(element);
            first = element;
        } else {
            Element current = iterate(i);
            insertElement(element, current);
        }
        size++;
    }

    private void insertElement(Element<E> e, Element<E> current) {
        current.getPrev().setNext(e);
        e.setPrev(current.getPrev());
        e.setNext(current);
        current.setPrev(e);
    }

    @Override
    public E get(int i) {
        Element<E> current = iterate(i);
        /*if (i < size() / 2) {
            current = first;
            for (int j = 0; j <= i; j++) {
                current = current.getNext();
            }
        } else {
            current = last;
            for (int j = size() - 1; j >= i; j--) {
                current = current.getPrev();
            }
        }*/
        return current.getVal();
    }

    @Override
    public E remove(int i) {
        Element current = iterate(i);
        removeElement(current);
        size--;
        return (E) current.getVal();
    }

    private Element removeFirst() {
        Element current = first;
        first = current.getNext();
        first.setPrev(null);
        return current;
    }

    private void removeElement(Element current) {
        if (current.equals(first)) {
            removeFirst();
        } else if (current.equals(last)) {
            removeLast();
        } else {
            current.getPrev().setNext(current.getNext());
            current.getNext().setPrev(current.getPrev());
        }
        removeRefs(current);
    }

    private Element removeLast() {
        Element current = last;
        last = current.getPrev();
        current.getPrev().setNext(null);
        removeRefs(current);
        return current;
    }

    private void removeRefs(Element current) {
        current.setPrev(null);
        current.setNext(null);
    }

    @Override
    public int remove(E e) {
        Element<E> current = first;
        int i;
        for (i = 0; i < size(); i++) {
            if (current.equals(e)) {
                removeElement(current);
            }
            current = current.getNext();
        }
        size--;
        return i;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int indexOf(E e) {
        Element<E> current = first;
        for (int i = 0; i < size(); i++) {
            if (current.equals(e)) {
                return i;
            }
            current = current.getNext();
        }
        return -1;
    }

    @Override
    public boolean contains(E e) {
        Element<E> current = first;
        for (int i = 0; i < size(); i++) {
            if (current.equals(e)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void set(int i, E e) {
        Element current = (Element) get(i);
        Element element = (Element) e;
        element.setNext(current.getNext());
        element.setPrev(current.getPrev());
        current.setNext(null);
        current.setPrev(null);
    }
}
