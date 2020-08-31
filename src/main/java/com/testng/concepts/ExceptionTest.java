package com.testng.concepts;

import org.testng.annotations.Test;

public class ExceptionTest {
	
	@Test(expectedExceptions=ArithmeticException.class)
	private void divide() {
		int number=10;
		System.out.println(10/0);
	}
}
