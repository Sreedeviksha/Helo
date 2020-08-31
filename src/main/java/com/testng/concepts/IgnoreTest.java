package com.testng.concepts;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {
	
	
	@Test
	private void mobileSearch() {
		System.out.println("Mobile Test");
	}
	
	@Test
	private void laptopSearch() {
		System.out.println("Laptop Test");
	}

}
