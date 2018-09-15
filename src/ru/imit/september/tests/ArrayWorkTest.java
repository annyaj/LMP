package ru.imit.september.tests;

import org.junit.Test;
import ru.imit.september.simpleclass.ArrayWork;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class ArrayWorkTest extends OutputTest {

    int[] array={1,4,6,7,5,4};
    int[] revarr={4,5,7,6,4,1};
    int[] totals={1,5,11,18,23,27};
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
        assertArrayEquals(revarr,ArrayWork.reverseArray(array));

    }
    @Test
    public void getTotals(){
        assertArrayEquals(totals,ArrayWork.getTotals(array));
    }
}