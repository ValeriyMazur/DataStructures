package com.vmazur.datastructures.list;

public interface List {
    // get value from the list
    Object get();
    // update value in the list
    Object set(Object value);
    // add new value to the end of the list with additional size expanding
    void add(Object value);
    // remove value from the list with additional shift of values in the list to the left
    Object remove();
    // clearing the list
    void clear();
    // getting quantity of list values
    int size();
    // checking the list for any values present
    boolean isEmpty();
    // checking value present in the list
    boolean contains(Object value);
    // printing info about the list
    String toString();
}
