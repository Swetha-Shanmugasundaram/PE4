package com.stackroute.four;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {
    Sort s=new Sort();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sortasc() {
        assertEquals("abcd",s.sortasc("dacb"));
        assertEquals("degoosw", s.sortasc("swe good"));
    }
    @Test
    public void sortascFail(){
        assertNotEquals("acbd",s.sortasc("abcd"));
        assertNotEquals("swe", s.sortasc("swe"));
    }
}