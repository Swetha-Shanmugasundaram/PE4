package com.stackroute.four;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest {
    Transpose t=new Transpose();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void transposeword() {
        assertEquals("ews doog",t.transposeword("swe good"));
        assertEquals("dog sselb",t.transposeword("god bless"));
    }
    @Test
    public void transposewordFail(){
        assertNotEquals("ewa doog",t.transposeword("ews doog"));
        assertNotEquals("got", t.transposeword("dog"));
    }
}