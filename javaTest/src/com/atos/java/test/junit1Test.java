package com.atos.java.test;

import static org.junit.Assert.*;
import org.junit.Test;

public class junit1Test {

	@Test
	public void test() {
		junit1 j=new junit1();
		assertEquals(9,j.lenCal("shivkumar"));
		//assertEquals(11,j.sum(5, 5));
	}
	
	
	

}
