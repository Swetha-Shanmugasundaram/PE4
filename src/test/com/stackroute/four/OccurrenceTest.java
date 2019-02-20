package com.stackroute.four;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccurrenceTest {
    Occurrence o=new Occurrence();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void characterCount() {
        assertEquals(2,o.characterCount("Java is java again",'v'));
        assertEquals(0,o.characterCount("Java is java again",'z'));
    }
    @Test
    public void charactercountFail(){
        assertNotEquals(4,o.characterCount("Java is java again", 'v'));
        assertNotEquals(0,o.characterCount("Java is java again", 'v'));

    }
}