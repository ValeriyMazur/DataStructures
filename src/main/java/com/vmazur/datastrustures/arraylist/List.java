package com.vmazur.datastrustures.arraylist;

public interface List {
    // add new value to the end of the list with additional size expanding
    void add (Object value);
    // insert new value in the list by index with additional shift of list elements to the right
    void add (Object value, int index);
    // remove value from the list by index with additional shift of list elements to the left
    Object remove(int index);
    // get value from the list by index
    Object get(int index);
    // update value in the list by index
    Object set(Object value, int index);
    // clearing the list
    void clear();
    // getting list size (quantity of values)
    int size();
    // checking the list for any values present
    boolean isEmpty();
    // checking value present in the list
    boolean contains(Object value);
    // getting value index in the list (first occurrence in the list)
    int indexOf(Object value);
    // getting value index in the list (last occurrence in the list)
    int lastIndexOf(Object value);
    // printing info about the list
    String toString();
}
