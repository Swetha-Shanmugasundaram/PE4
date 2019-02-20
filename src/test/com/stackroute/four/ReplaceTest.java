package com.stackroute.four;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceTest {
    Replace r = new Replace();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void replacechar() {
        assertEquals("faity fry",r.replacechar("daily dry",'d','f','l','t'));
        assertEquals("ftat",r.replacechar("dlat",'d','f','l','t'));
    }
    @Test
    public void replacecharFailure() {
        assertNotEquals("faiti fri",r.replacechar("daily dry",'d','f','l','t'));
        assertNotEquals("flat",r.replacechar("daily dry",'d','f','l','t'));

    }
}