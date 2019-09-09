package com.stackroute;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class p22Test {
    private static p22 p22;
    @Before
    public void setUp() throws Exception {
        p22=new p22();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testcase1(){
        int n = 64;
        Assert.assertTrue(p22.isPower4(n));
        System.out.println(n+" is power of 4");
    }
    @Test
    public void testcase2(){
        int n = 2;
        Assert.assertFalse(p22.isPower4(n));
        System.out.println(n+" is not power of 4");
    }
    @Test
    public void testcase3(){
        int n = 16;
        Assert.assertTrue(p22.isPower4(n));
        System.out.println(n+" is power of 4");
    }

    @Test
    public void testcase4(){
        int n = 1;
        Assert.assertTrue(p22.isPower4(n));
        System.out.println(n+" is power of 4");
    }

}