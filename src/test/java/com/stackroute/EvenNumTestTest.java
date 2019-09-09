package com.stackroute;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {
    private static EvenNumTest e;
    @Before
    public void setUp() throws Exception {
        e = new EvenNumTest();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testcase1(){
        int n=1;
        Assert.assertFalse(e.isEven(n));
        System.out.println("Odd");
    }

    @Test
    public void testcase2(){
        int n=4;
        Assert.assertTrue(e.isEven(n));
        System.out.println("Even");
    }

    @Test
    public void testcase3(){
        int n=0;
        Assert.assertTrue(e.isEven(n));
        System.out.println("Even");
    }
}