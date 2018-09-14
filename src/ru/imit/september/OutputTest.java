package ru.imit.september;

import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public abstract class OutputTest{
    protected final ByteArrayOutputStream out=new ByteArrayOutputStream();
    @Before
    public void setUpStreams(){
        System.setOut(new PrintStream(out));
    }
    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}