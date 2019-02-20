package com.stackroute.four;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleTest {
    Multiple u=new Multiple();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void multipleFunction() {
        String[] output={"Found at: 4 - 6","Found at: 10 - 12","Found at: 27 - 29"};
        assertArrayEquals(output,u.multipleFunction("She sells seashells by the seashore","se"));
     }

    @Test
    public void multipleFunctionFail() {
        String[] output = {"Found at: 5 - 6", "Found at: 8 - 12", "Found at: 27 - 29"};
        assertNotEquals(output, u.multipleFunction("She sells seashells by the seashore", "se"));
    }
}