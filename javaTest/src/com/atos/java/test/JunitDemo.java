package com.atos.java.test;

import org.junit.Test;

public class JunitDemo {

	@Test(expected=ArithmeticException.class)
	public void test() {
		int i=63;
		System.out.println(i/0);
	}

}
