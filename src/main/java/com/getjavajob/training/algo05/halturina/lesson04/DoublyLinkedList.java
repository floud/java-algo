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
        //Element<E> element = (Element<E>) e;
        if (isNull()) {
            Element<E> element = new Element<E>(null, null, e);
            first = element;
            last = element;
        } else {
            Element<E> element = new Element<E>(last, null, e);
            last.setNext(element);
            element.setPrev(last);
            last = element;
        }
        return size++;
    }

    @Override
    public void add(int i, E e) {
        if (i == size()) {
            add(e);
        } else if (i < size()/2){
            Element<E> current = first;
            for (int j = 0; j < i; j++) {
                current = current.getNext();
            }
            insertElement((Element<E>) e, current);
        } else {
            Element<E> current = last;
            for (int j = size() - 1; j >= i ; j--) {
                current = current.getPrev();
            }
            insertElement((Element<E>) e, current);
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
        Element<E> current;
        if (i < size() / 2) {
            current = first;
            for (int j = 0; j <= i; j++) {
                current = current.getNext();
            }
        } else {
            current = last;
            for (int j = size() - 1 ; j >= i; j--) {
                current = current.getPrev();
            }
        }

        return (E) current;
    }

    @Override
    public E remove(int i) {
        Element current = (Element) get(i);
        removeElement(current);
        size--;
        return (E) current;
    }

    private void removeElement(Element current) {
        current.getPrev().setNext(current.getNext());
        current.getNext().setPrev(current.getPrev());
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
