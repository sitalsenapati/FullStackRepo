package com.nt.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	@Test
    public void testWithPositiveValues() {
    	App app=new App();
    	int expected=300;
    	int actual=app.sum(100,200);
    	assertEquals(expected,actual);
    }
	
	@Test
    public void testWithNegativeValues() {
    	App app=new App();
    	int expected=-300;
    	int actual=app.sum(-100,-200);
    	assertEquals(expected,actual);
    }
	
	@Test
    public void testWithMixedValues() {
    	App app=new App();
    	int expected=100;
    	int actual=app.sum(-100,200);
    	assertEquals(expected,actual);
    }
}
