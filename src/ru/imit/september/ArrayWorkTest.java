package ru.imit.september;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;


public class ArrayWorkTest extends OutputTest {

    int[] array={1,4,6,7,5,4};
    @Test
    public void outputToConsole(){
        String exp="146754";
        ArrayWork.outputToConsole(array);
        assertEquals("1 4 6 7 5 4 ",out.toString());
    }

    @Test
    public void sumOfElem() {
       int sum=ArrayWork.sumOfElem(array);
       assertEquals(27,sum);
    }

    @Test
    public void quantityEvenNumb() {
        int quant=ArrayWork.quantityEvenNumb(array);
        assertEquals(3,quant);
    }

    @Test
    public void quantityIncludingNumb() {
        int inc=ArrayWork.quantityIncludingNumb(array,5,3);
        assertEquals(3,inc);
    }

    @Test
    public void isPositive() {
        assertTrue(ArrayWork.isPositive(array));
    }

    @Test
    public void reverseArray() {
        ArrayWork.outputToConsole(ArrayWork.reverseArray(array));
        assertEquals("4 5 7 6 4 1 ",out.toString());

    }
}