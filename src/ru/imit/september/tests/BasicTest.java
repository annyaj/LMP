package ru.imit.september.tests;

import org.junit.Test;
import ru.imit.september.simpleclass.Basic;

import static org.junit.Assert.*;

public class BasicTest extends OutputTest {
    double[] array = {};
    double[] array2 = {-2,-3};
    double[] arr={-2};
    double[] array3={1,0.5};
    double[] arr2={0,0};


    @Test
    public void helloWorld(){
        Basic.helloWorld();
        assertEquals("Hello,World",out.toString());
    }

    @Test
    public void tabulation() {
        Basic.tabulation(1,6,0.5);
        String exp="   0,8   1,0   0,9   0,6   0,1  -0,4  -0,8  -1,0  -1,0  -0,7";
        assertEquals(exp,out.toString());
    }

    @Test
    public void testSolutionSystemEquationsRootsAreZero() {
        assertArrayEquals(arr2,Basic.solutionSystemEquations(0,0,0,8,8,0),0.001);
    }
    @Test
    public void testSolutionSystemEquationsTwoRoots(){
        assertArrayEquals(array3,Basic.solutionSystemEquations(1,2,2,2,6,5),0.001);
    }
    @Test
    public void testSolutionSystemEquationsInfinitRoots(){
        assertEquals(null,Basic.solutionSystemEquations(0,0,0,0,0,0));
    }
    @Test
    public void testSolutionSystemEquationsNoRoots() {
        assertArrayEquals(array,Basic.solutionSystemEquations(0,0,5,8,8,0),0.001);
    }
    @Test
    public void testInfiniteRootsNoZeroConf(){
        assertEquals(null,Basic.solutionSystemEquations(1,1,1,-1,-1,-1));
    }


    @Test
    public void decompose() {
        double answ=Basic.decomposeExp(2,0.000001);
        assertEquals(7.389,answ,0.001);
    }
    @Test
    public void decomposeExpZero() {
        double answ=Basic.decomposeExp(0,0.0001);
        assertEquals(1,answ,0.001);
    }
    @Test
    public void decomposeNegativeArg() {
        double answ=Basic.decomposeExp(-1,0.0001);
        assertEquals(0.3678,answ,0.001);
    }

    @Test
    public void rootSearch(){
        assertArrayEquals(array2, Basic.rootSearch(1,5,6),0.001);
        assertArrayEquals(arr, Basic.rootSearch(1,4,4),0.001);
        assertArrayEquals(array, Basic.rootSearch(0,0,5),0.001);
        assertArrayEquals(array, Basic.rootSearch(5,2,5),0.001);
        assertEquals(null,Basic.rootSearch(0,0,0));


    }
    @Test
    public void testRootSearchFirstCoeffNotZero(){
        assertArrayEquals(array3, Basic.rootSearch(2,-3,1),0.001);
    }
}