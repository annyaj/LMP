package ru.imit.september.tests;

import org.junit.Test;
import ru.imit.september.simpleclass.Point3D;
import ru.imit.september.simpleclass.Vector3D;
import ru.imit.september.simpleclass.Vector3DArray;

import static org.junit.Assert.*;

public class Vector3DArrayTest {

    Vector3DArray obj=new Vector3DArray(4);
    Vector3D a=new Vector3D(1,2,3);
    Vector3D b=new Vector3D(0,1,5);
    Vector3D c=new Vector3D(2,0,2);
    Vector3D d=new Vector3D(1,2,1);
    Vector3D sum=new Vector3D(4,5,11);
    Vector3D linnearComb=new Vector3D(3,7,12);
    double[] array={2,1,0,1};
    Point3D p=new Point3D(0,1,0);


    @Test
    public void lengthArray() {
        assertEquals(4,obj.lengthArray());
    }

    @Test
    public void findVectorIndex() {
        obj.changeElem(a,0);
        obj.changeElem(c,1);
        obj.changeElem(c,2);
        assertEquals(1,obj.findVector(c));
    }
    @Test
    public void findVectorNotInclude() {
        obj.changeElem(a,0);
        obj.changeElem(c,1);
        obj.changeElem(c,2);
        assertEquals(-1,obj.findVector(d));
    }


    @Test
    public void sumAllVectors() {
        obj.changeElem(a,0);
        obj.changeElem(b,1);
        obj.changeElem(c,2);
        obj.changeElem(d,3);
        assertEquals(sum.getX(),obj.sumAllVectors().getX(),0.0001);
        assertEquals(sum.getY(),obj.sumAllVectors().getY(),0.0001);
        assertEquals(sum.getZ(),obj.sumAllVectors().getZ(),0.0001);
    }

    @Test
    public void maxLength() {
        obj.changeElem(a,0);
        obj.changeElem(b,1);
        obj.changeElem(c,2);
        obj.changeElem(d,3);
        assertEquals(5.099,obj.maxLength(),0.0001);
    }

    @Test
    public void linearCombination() {
        obj.changeElem(a,0);
        obj.changeElem(b,1);
        obj.changeElem(c,2);
        obj.changeElem(d,3);
        assertEquals(linnearComb.getX(),obj.linearCombination(array).getX(),0.0001);
        assertEquals(linnearComb.getY(),obj.linearCombination(array).getY(),0.0001);
        assertEquals(linnearComb.getZ(),obj.linearCombination(array).getZ(),0.0001);

    }

    @Test
    public void arrayPoints() {
        obj.changeElem(a,0);
        obj.changeElem(b,1);
        assertEquals(1,obj.arrayPoints(p)[0].getX(),0.001);
        assertEquals(0,obj.arrayPoints(p)[1].getX(),0.001);
        assertEquals(3,obj.arrayPoints(p)[0].getY(),0.001);
        assertEquals(2,obj.arrayPoints(p)[1].getY(),0.001);
        assertEquals(3,obj.arrayPoints(p)[0].getZ(),0.001);
        assertEquals(5,obj.arrayPoints(p)[1].getZ(),0.001);
    }
}