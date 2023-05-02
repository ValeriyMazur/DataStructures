package com.vmazur.datastructures.list;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListTest {
    @Test
    @DisplayName("Insert new Node to the LinkedList")
    public void testAddValue(){
        LinkedList linkedList = new LinkedList();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        assertEquals("A", linkedList.getHead().value);
        assertEquals("C", linkedList.getTail().value);
        assertTrue(linkedList.getHead().prev == null && linkedList.getTail().next == null);
        assertEquals("B", linkedList.getHead().next.value);
        assertEquals("B", linkedList.getTail().prev.value);
        assertEquals(3, linkedList.size());
    }
}
