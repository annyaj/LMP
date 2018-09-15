package ru.imit.september.tests;

import org.junit.Test;
import ru.imit.september.simpleclass.Basic;

import static org.junit.Assert.*;

public class BasicTest extends OutputTest {


    @Test
    public void helloWorld(){
        Basic.helloWorld();
        assertEquals("Hello,World",out.toString());
    }
    //@Test
    public void rootSearch() {
    }

    @Test
    public void tabulation() {
        Basic.tabulation(1,6,0.5);
        String exp="   0,8   1,0   0,9   0,6   0,1  -0,4  -0,8  -1,0  -1,0  -0,7";
        assertEquals(exp,out.toString());
    }

    @Test
    public void solutionSystemEquat() {
        Basic.solutionSystemEquat(0,0,0,8,8,0);
        assertEquals("x=0 and y=0",out.toString());
    }

    @Test
    public void decompose() {
        double answ=Basic.decompose(2,0.6);
        assertEquals(7.26666,answ,0.001);
    }
}