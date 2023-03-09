package com.vmazur.datastructures.arraylist;

import com.vmazur.datastrustures.arraylist.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {
    @Test
    @DisplayName("Insert value to the end of the list")
    public void testAddValue(){
        ArrayList arrayList = new ArrayList(3);
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        assertEquals("B", arrayList.get(arrayList.size() - 2));
        assertEquals("C", arrayList.get(arrayList.size() - 1));
    }
    @Test
    @DisplayName("Insert value by index with additional shift of the list elements to the right")
    public void testInsertValue(){
        ArrayList arrayList = new ArrayList(4);
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D", 1);
        assertEquals("D", arrayList.get(1));
        assertEquals("C", arrayList.get(3));
        assertThrows(IndexOutOfBoundsException.class, () -> arrayList.add("E", 5));
    }
    @Test
    @DisplayName("Remove value by index with additional shift of the list elements to the left")
    public void testRemoveValue(){
        ArrayList arrayList = new ArrayList(4);
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.remove(1);
        assertEquals("C", arrayList.get(1));
        assertEquals("D", arrayList.get(2));
        assertEquals("A", arrayList.remove(0));
        assertThrows(IndexOutOfBoundsException.class, () -> arrayList.remove(4));
    }
    @Test
    @DisplayName("Get value from the list by index")
    public void testGetValue(){
        ArrayList arrayList = new ArrayList(3);
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        assertEquals("B", arrayList.get(1));
        assertThrows(IndexOutOfBoundsException.class, () -> arrayList.get(3));
    }
    @Test
    @DisplayName("Update value in the list by index")
    public void testSetValue(){
        ArrayList arrayList = new ArrayList(3);
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.set("D", 2);
        assertEquals("D", arrayList.get(2));
        assertThrows(IndexOutOfBoundsException.class, () -> arrayList.get(3));
    }
    @Test
    @DisplayName("Clearing the list")
    public void testClearList(){
        ArrayList arrayList = new ArrayList(2);
        arrayList.add("A");
        arrayList.add("B");
        arrayList.clear();
        assertTrue(arrayList.isEmpty());
    }
    @Test
    @DisplayName("Find first occurrence of the value in the list")
    public void testIsValueContains(){
        ArrayList arrayList = new ArrayList(3);
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        assertTrue(arrayList.contains("B"));
        assertFalse(arrayList.contains("D"));
    }
    @Test
    @DisplayName("Get index of the value first occurrence in the list")
    public void testIndexOfFirstValueOccurrence(){
        ArrayList arrayList = new ArrayList(4);
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("C");
        assertEquals(2, arrayList.indexOf("C"));
        assertEquals(0, arrayList.indexOf("D"));
    }
    @Test
    @DisplayName("Get index of the value last occurrence in the list")
    public void testIndexOfLastValueOccurrence(){
        ArrayList arrayList = new ArrayList(4);
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("C");
        assertEquals(3, arrayList.lastIndexOf("C"));
        assertEquals(0, arrayList.lastIndexOf("D"));
    }
    @Test
    @DisplayName("Printing info about the list")
    public void testPrintListContents(){
        ArrayList arrayList = new ArrayList(5);
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("D");
        System.out.print(arrayList.toString());
    }
}
