package com.stackroute.four;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PresentTest {
    Present p=new Present();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void presentword() {
        assertEquals("Is Harry here? true",p.presentword("Harry is good","Harry"));
    }
    @Test
    public void presentwordFail(){
        assertNotEquals("Is Harry here? false",p.presentword("Harry is good","HARRY"));
    }
}