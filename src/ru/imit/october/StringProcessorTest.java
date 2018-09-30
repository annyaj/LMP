package ru.imit.october;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringProcessorTest {

    String src=new String("word");
    String st = new String("onenoyesthree");
    StringBuilder rem = new StringBuilder("isisis");
    StringBuilder origin = new StringBuilder("  Hello my dear friend ");
    StringBuilder statement = new StringBuilder("I love Mathematics");
    String swap = new String("  friend my dear Hello ");
    String statSwap = new String("Mathematics love I");
    String hex = new String("It is 0x00000021");
    String h = new String("0x00000151 is more than 0x00000100");

    @Test
    public void copyStrTrue() {
        assertTrue("wordwordword".equals(StringProcessor.copyStr(src,3)));
    }

    @Test
    public void copyStrFalse() {
        assertFalse("wordwordword".equals(StringProcessor.copyStr(src,2)));
    }
    @Test
    public void copyEmptyStr() {
        assertTrue("".equals(StringProcessor.copyStr(src,0)));
    }

    @Test
    public void QuantEntranciesIsTwo() {
        assertEquals(2,StringProcessor.quantEntrancies("heyhegthey","hey"));
    }

    @Test
    public void QuantEntranciesIsZero() {
        assertEquals(0,StringProcessor.quantEntrancies("hefuhthjgk","hey"));
    }

    @Test
    public void changeNumsIntoChar() {
        assertTrue(st.equals(StringProcessor.numsIntoChars("1noyes3")));
    }
    @Test
    public void removeEven() {
        StringProcessor.removeEven(rem);
        assertTrue("sss".equals(rem.toString()));
    }

    @Test
    public void swapWordsWithGapsInBegAndFinOfString() {
        StringProcessor.swapFirstAndFinalWords(origin);
        assertTrue(swap.equals(origin.toString()));
    }

    @Test
    public void swapWordsWithoutGapsInBeginAndFinalOfString() {
        StringProcessor.swapFirstAndFinalWords(statement);
        assertTrue(statSwap.equals(statement.toString()));
    }

    @Test
    public void hexadecimalToDecimalThirtyThree() {
        assertTrue("It is 33".equals(StringProcessor.hexadecimalToDecimal(hex)));
    }

    @Test
    public void hexadecimalToDecimalTwoNums() {
        assertTrue("337 is more than 256".equals(StringProcessor.hexadecimalToDecimal(h)));
    }
}