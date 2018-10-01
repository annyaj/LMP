package ru.imit.october;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringProcessorTest extends IllegalArgumentException {

    String src=new String("word");

    @Test
    public void copyStrTrue() {
        assertTrue("wordwordword".equals(StringProcessor.copyStr(src,3)));
    }

    @Test(expected = Exception.class)
    public void copyStrExeption()throws IllegalArgumentException{
        StringProcessor.copyStr(src,-7);
        fail();
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


    String st = new String("onenoyesthree");
    @Test
    public void changeNumsIntoChar() {
        assertTrue(st.equals(StringProcessor.numsIntoChars("1noyes3")));
    }

    StringBuilder rem = new StringBuilder("isisis");
    @Test
    public void removeEven() {
        StringProcessor.removeEven(rem);
        assertTrue("sss".equals(rem.toString()));
    }


    StringBuilder origin = new StringBuilder("  Hello my dear friend ");
    StringBuilder statement = new StringBuilder("I love Mathematics");
    String swap = new String("  friend my dear Hello ");
    String statSwap = new String("Mathematics love I");
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


    String hex = new String("It is 0x00000021");
    String h = new String("0x00000151 is more than 0x00000101");
    String trash = new String("0x00000151666ghh0xdf0x000001010xdkdfk");
    @Test
    public void hexadecimalToDecimalThirtyThree() {
        assertTrue("It is 33".equals(StringProcessor.hexadecimalToDecimal(hex)));
    }

    @Test
    public void hexadecimalToDecimalTwoNums() {
        assertTrue("337 is more than 257".equals(StringProcessor.hexadecimalToDecimal(h)));
    }

    @Test
    public void hexadecimalToDecimalTwoNumsInTrashString() {
        assertTrue("337666ghh0xdf2570xdkdfk".equals(StringProcessor.exchangeNums(trash)));
    }
}