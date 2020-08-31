package com.testng.concepts;

import org.testng.annotations.Test;

public class TimeOutTest {
	
	@Test(timeOut=2000)
	private void mobileSearch() throws InterruptedException {
		System.out.println("Mobile Test Started");
		System.out.println("Mobile Test completed");
	}
	
	@Test
	private void ZlaptopSearch() {
		System.out.println("Laptop Test");
	}

}
