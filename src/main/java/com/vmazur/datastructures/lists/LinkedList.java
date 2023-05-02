package com.vmazur.datastructures.list;

public class LinkedList implements List{
    private Node head;
    private Node tail;
    private int size;

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void add(Object value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = newNode;
        }
        else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            newNode.prev = current;
            current.next = tail = newNode;
        }
        size++;
    }

    @Override
    public void add(Object value, int index) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(Object value, int index) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object value) {
        return false;
    }

    @Override
    public int indexOf(Object value) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object value) {
        return 0;
    }
}
