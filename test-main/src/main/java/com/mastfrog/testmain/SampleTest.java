package com.mastfrog.testmain;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SampleTest {

    @Before
    public void before(){
        System.out.println("before");
    }

    @Test
    public void test(){

        int a = 4_095;
        int b = 0xFFF;

        Assert.assertEquals(a, b);
    }

    @After
    public void after(){
        System.out.println("after");
    }
}
