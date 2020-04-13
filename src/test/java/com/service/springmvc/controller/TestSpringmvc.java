package com.service.springmvc.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestSpringmvc {

        SpringmvcDelegate springmvcDelegate = new SpringmvcDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = springmvcDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}