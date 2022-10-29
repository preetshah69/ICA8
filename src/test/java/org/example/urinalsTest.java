package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {

    urinals ur=new urinals();

    @Test
    void goodString() {
        System.out.println("====== Preet Shah == TEST ONE EXECUTED =======");
        assertEquals(false,ur.goodString("01011"));
    }

    @Test
    void countUrinals() {
        System.out.println("====== Preet Shah == TEST TWO EXECUTED =======");
        assertEquals(1,ur.countUrinals("0100"));
    }

    @Test
    void openFile() {
        System.out.println("====== Preet Shah == TEST THREE EXECUTED =======");
    }

    @Test
    void outputToFile() {
        System.out.println("====== Preet Shah == TEST FOUR EXECUTED =======");
    }

}