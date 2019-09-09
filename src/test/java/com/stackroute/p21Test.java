package com.stackroute;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.util.SortedSet;

import static org.junit.Assert.*;

public class p21Test {
    private static p21 p21;
    @Before
    public void setUp() throws Exception {
        p21 = new p21();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testcase1(){
        int expected=54321;
        int actual = p21.reverse(12345);
        Assert.assertEquals(expected,actual);
        System.out.println("12345 has a reverse = "+expected);
    }

    @Test
    public void testcase2(){
        int expected=12321;
        Assert.assertEquals(expected,p21.reverse(expected));
        System.out.println(expected +" is a palindrome.");
    }

    @Test
    public void testcase3(){
        int expected=123;
        Assert.assertNotNull(p21.reverse(expected));
        System.out.println(expected +" reverse is not a null");
    }





}