package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class p23Test {
    private static p23 p23;
    @Before
    public void setUp() throws Exception {
        p23 = new p23();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testcase1(){
        p23.name="Avinash";
        p23.age=23;
        p23.salary=10000;
        p23.display();
    }

    @Test
    public void testcase2(){
        p23.name="Kunal";
        p23.age=22;
        p23.salary=12000;
        p23.display();
    }

    @Test
    public void testcase3(){
        p23.name="Utkarsh";
        p23.age=24;
        p23.salary=11000;
        p23.display();
    }
}