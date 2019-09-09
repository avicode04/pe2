package com.stackroute;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class p27Test {
    public static p27 p27;
    @Before
    public void setUp() throws Exception {
        p27 = new p27();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testcase1(){
        String expected="Avinash Chandrakar";
        Assert.assertEquals(expected,p27.getfullname("Avinash","Chandrakar",23,1000.0));
    }

    @Test
    public void testcase2(){
        String expected="Avinash Chdrakar";
        Assert.assertNotEquals(expected,p27.getfullname("Avinash","Chandrakar",23,1000.0));
    }



}