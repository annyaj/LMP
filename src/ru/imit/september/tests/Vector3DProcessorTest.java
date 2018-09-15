package ru.imit.september.tests;

import org.junit.Test;
import ru.imit.september.simpleclass.Vector3D;
import ru.imit.september.simpleclass.Vector3DProcessor;

import static org.junit.Assert.*;

public class Vector3DProcessorTest {
    Vector3D a=new Vector3D(1,4,6);
    Vector3D c=new Vector3D(1,4,6);
    Vector3D b=new Vector3D(2,5,6);
    @Test
    public void sum() {
        Vector3D sum=new Vector3D();
        sum=Vector3DProcessor.sum(a,b);
        assertEquals(3,sum.getX(),0);
        assertEquals(9,sum.getY(),0);
        assertEquals(12,sum.getZ(),0);
    }

    @Test
    public void difference() {
        Vector3D dif=new Vector3D();
        dif=Vector3DProcessor.difference(b,a);
        assertEquals(1,dif.getX(),0);
        assertEquals(1,dif.getY(),0);
        assertEquals(0,dif.getZ(),0);
    }

    @Test
    public void scalarProduct() {
       assertEquals(58,Vector3DProcessor.scalarProduct(a,b),0);
    }

    @Test
    public void vectorProduct() {
        Vector3D vect=new Vector3D();
        vect=Vector3DProcessor.vectorProduct(a,b);
        assertEquals(-6,vect.getX(),0);
        assertEquals(-6,vect.getY(),0);
        assertEquals(-3,vect.getZ(),0);
    }

    @Test
    public void isCollinear() {
        assertFalse(Vector3DProcessor.isCollinear(a,b));
    }

    @Test
    public void length(){
        assertEquals(8.06,b.length(),0.005);
    }
    @Test
    public void isEqualsVectors(){
        assertTrue(a.isEqualVectors(c));
    }
}