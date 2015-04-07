package com.getjavajob.training.algo05.halturina.lesson04;

/**
 * Created by halturin_a on 06.04.2015.
 */
public class Element<E> {
    public Element<E> prev;
    public Element<E> next;
    public E val;

    public Element(E val) {
        this.val = val;
    }

    public Element(Element<E> prev, Element<E> next, E val) {
        this.prev = prev;
        this.next = next;
        this.val = val;
    }

    public void setPrev(Element<E> prev) {
        this.prev = prev;
    }

    public void setNext(Element<E> next) {
        this.next = next;
    }

    public void setVal(E val) {
        this.val = val;
    }

    public Element<E> getPrev() {
        return prev;
    }

    public Element<E> getNext() {
        return next;
    }

    public E getVal() {
        return val;
    }
}
