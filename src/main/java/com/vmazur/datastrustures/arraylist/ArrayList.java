package com.vmazur.datastrustures.arraylist;

public class ArrayList implements List {
    private int size;
    private Object[] array;

    public ArrayList(int initialCapacity){
        array = new Object[initialCapacity];
    }

    @Override
    public void add(Object value) {
        array[this.size] = value;
        this.size++;
    }
    @Override
    public void add(Object value, int index) {
        if (index <= this.size) {
            for (int i = this.size; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = value;
            this.size++;
        }
        else {
            throw new IndexOutOfBoundsException("List is out of bounds !");
        }
    }
    @Override
    public Object remove(int index) {
        Object value = array[index];
        if (index <= this.size - 1) {
            for (int i = index; i <= this.size - 2; i++) {
                array[i] = array[i + 1];
            }
        this.size--;
        }
        else {
            throw new IndexOutOfBoundsException("List is out of bounds !");
        }
        return value;
    }

    @Override
    public Object get(int index) {
        if (index <= this.size - 1) {
            return array[index];
        }
        else {
            throw new IndexOutOfBoundsException("List is out of bounds !");
        }
    }

    @Override
    public Object set(Object value, int index) {
        if (index <= this.size - 1) {
            return array[index] = value;
        }
        else {
            throw new IndexOutOfBoundsException("List is out of bounds !");
        }
    }

    @Override
    public void clear() {
        this.size = 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object value) {
        for (int i = 0; i < this.size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(Object value) {
        int firstIndexOf = 0;
        for (int i = 0; i < this.size; i++) {
            if (array[i] == value) {
                firstIndexOf = i;
                break;
            }
        }
        return firstIndexOf;
    }

    @Override
    public int lastIndexOf(Object value) {
        int IndexOfLastOccurrence = 0;
        for (int i = this.size - 1; i >= 0; i--) {
            if (array[i] == value) {
                IndexOfLastOccurrence = i;
                break;
            }
        }
        return IndexOfLastOccurrence;
    }
    @Override
    public String toString(){
        StringBuilder listContents = new StringBuilder();
        for (int i = 0; i < this.size; i++) {
            listContents.append("| " + array[i] + " " + "|" + " ");
        }
        return String.valueOf(listContents);
    }
}