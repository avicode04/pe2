package com.stackroute;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class p26Test {
    private static p26 p26;
    @Before
    public void setUp() throws Exception {
        p26 = new p26();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testcase1(){
        int n=1;
        Assert.assertTrue(p26.factorial(n));
    }
    @Test
    public void testcase2(){
        int n=2;
        Assert.assertTrue(p26.factorial(n));
    }
    @Test
    public void testcase3(){
        int n=3;
        Assert.assertTrue(p26.factorial(n));
    }
    @Test
    public void testcase4(){
        int n=4;
        Assert.assertTrue(p26.factorial(n));
    }
    @Test
    public void testcase5(){
        int n=5;
        Assert.assertTrue(p26.factorial(n));
    }
    @Test
    public void testcase6(){
        int n=6;
        Assert.assertTrue(p26.factorial(n));
    }
    @Test
    public void testcase7(){
        int n=7;
        Assert.assertTrue(p26.factorial(n));
    }
    @Test
    public void testcase8(){
        int n=8;
        Assert.assertTrue(p26.factorial(n));
    }
    @Test
    public void testcase9(){
        int n=9;
        Assert.assertTrue(p26.factorial(n));
    }
    @Test
    public void testcase10(){
        int n=10;
        Assert.assertTrue(p26.factorial(n));
    }
    @Test
    public void testcase11(){
        int n=11;
        Assert.assertTrue(p26.factorial(n));
    }
    @Test
    public void testcase12(){
        int n=12;
        Assert.assertTrue(p26.factorial(n));
    }
    @Test
    public void testcase13(){
        int n=13;
        Assert.assertFalse(p26.factorial(n));
    }
    @Test
    public void testcase14(){
        int n=50;
        Assert.assertFalse(p26.factorial(n));
    }
}