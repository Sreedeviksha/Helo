package com.testng.concepts;

import org.testng.annotations.Test;

public class InvocationTest {

	
	@Test(invocationCount=4)
	private void mobileSearch() {
		System.out.println("Mobile Test");
	}
	
	@Test
	private void laptopSearch() {
		System.out.println("Laptop Test");
	}
}
