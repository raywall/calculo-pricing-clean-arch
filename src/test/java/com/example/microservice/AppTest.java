package com.example.microservice;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AppTest extends TestCase 
{

    public AppTest(String testName) 
    {
        super( testName );
    }

    public static Test suite() 
    {
        return new TestSuite( AppTest.class );
    }

    public void testApp() 
    {
        assertTrue( true );
    }
}