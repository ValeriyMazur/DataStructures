package com.vmazur.datastructures.list;

import java.util.StringJoiner;

public class ArrayList implements List {
    private int size;
    private Object[] array;

    public ArrayList(){
        array = new Object[size];
    }
    public ArrayList(int initialCapacity){
        array = new Object[initialCapacity];
    }

    @Override
    public void add(Object value) {
        if (array.length == size) {
            arrayGrow();
        }
        array[size] = value;
        size++;
    }

    private void arrayGrow() {
        Object [] arrayGrow = new Object [array.length + 1];
        System.arraycopy(array, 0, arrayGrow, 0, array.length);
        array = arrayGrow;
    }

    @Override
    public void add(Object value, int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("List is out of bounds !");
        }
        if (size - index >= 0) {
            System.arraycopy(array, index, array, index + 1, size - index);
        }
        array[index] = value;
        size++;
    }
    @Override
    public Object remove(int index) {
        Object valueToRemove = array[index];
        if (index <= size - 1) {
            for (int i = index; i <= size - 2; i++) {
                array[i] = array[i + 1];
            }
        size--;
        }
        else {
            throw new IndexOutOfBoundsException("List is out of bounds !");
        }
        return valueToRemove;
    }

    @Override
    public Object get(int index) {
        if (index <= size - 1) {
            return array[index];
        }
        else {
            throw new IndexOutOfBoundsException("List is out of bounds !");
        }
    }

    @Override
    public Object set(Object value, int index) {
        if (index <= size - 1) {
            return array[index] = value;
        }
        else {
            throw new IndexOutOfBoundsException("List is out of bounds !");
        }
    }

    @Override
    public void clear() {
        for (int index = 0; index < size; index++) {
            array[index] = null;
        }
        size = 0;
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
        return indexOf(value) != -1;
    }

    @Override
    public int indexOf(Object value) {
        for (int index = 0; index < size; index++) {
            if (array[index].equals(value)) {
                return index;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object value) {
        for (int index = size - 1; index >= 0; index--) {
            if (array[index].equals(value)) {
                return index;
            }
        }
        return -1;
    }
    @Override
    public String toString(){
        StringJoiner result = new StringJoiner(", ", "[", "]");
        for (Object object: array) {
            result.add(String.valueOf(object));
        }
        return result.toString();
    }
}