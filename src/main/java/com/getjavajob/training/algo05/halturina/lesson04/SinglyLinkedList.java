package com.getjavajob.training.algo05.halturina.lesson04;

import com.getjavajob.training.algo05.halturina.lesson03.GjjList;

/**
 * Created by halturin_a on 07.04.2015.
 */
public class SinglyLinkedList<V> implements GjjList<V> {

    public String reverseNodes() {
        Node current;
        for (int i = size() - 1; i >= 0; i--) {
            current = iterate(i);
            if (i == 0) {
                first = last;
                last = current;
            } else {
                current.setNext(iterate(i - 1));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            sb.append(get(i) + " ");
        }
        return sb.toString();
    }

    @Override
    public int add(V v) {
        Node<V> element = new Node<V>(null, v);
        if (isNull()) {
            first = element;
            last = element;
        } else {
            last.setNext(element);
            last = element;
        }
        return size++;
    }

    private boolean isNull() {
        return size == 0;
    }

    private Node iterate(int i) {
        Node current = first;
        if (i > (size() - 1) || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + " Max: " + (size() - 1) + " Min: 0");
        } else {
            for (int j = 1; j <= i; j++) {
                current = current.getNext();
            }
        }

        return current;
    }

    @Override
    public void add(int i, V v) {
        Node node = new Node(null, v);
        Node current = iterate(i);
        Node previous = iterate(i - 1);
        previous.setNext(node);
        node.setNext(current);

    }

    @Override
    public V get(int i) {

        return (V) iterate(i).getVal();
    }

    @Override
    public V remove(int i) {
        Node current = iterate(i);
        Node previous = iterate(i - 1);
        previous.setNext(current.getNext());
        return (V) current.getVal();
    }

    @Override
    public int remove(V v) {
        Node current = first;
        int i = 0;
        for (; i < size(); i++) {
            if (v.equals(current)) {
                Node previous = iterate(i - 1);
                previous.setNext(current.getNext());
            }
            current = current.getNext();
        }
        return i;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int indexOf(V v) {
        Node current = first;
        for (int i = 1; i < size(); i++) {
            if (current.equals(v)) {
                return i;
            }
            current = current.getNext();
        }
        return -1;
    }

    @Override
    public boolean contains(V v) {
        Node current = first;
        for (int i = 1; i < size(); i++) {
            if (current.equals(v)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    @Override
    public void set(int i, V v) {
        Node current = iterate(i);
        Node node = new Node(v);
        Node previous = iterate(i - 1);
        previous.setNext(node);
        node.setNext(current.getNext());
        current.setNext(null);
    }

    private Node<V> first;
    private Node<V> last;
    private int size;
}
