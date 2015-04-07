package com.getjavajob.training.algo05.halturina.lesson04;

/**
 * Created by halturin_a on 07.04.2015.
 */
public class Node<V> {
    private Node<V> next;
    private V val;

    public Node(V val) {
        this.val = val;
    }

    public Node(Node<V> next, V val) {
        this.val = val;
        this.next = next;
    }

    public Node<V> getNext() {
        return next;
    }

    public V getVal() {
        return val;
    }

    public void setNext(Node<V> next) {
        this.next = next;
    }

    public void setVal(V val) {
        this.val = val;
    }
}
