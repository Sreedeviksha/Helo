package com.testng.concepts;

import org.testng.annotations.Test;

public class SampleTest {

	@Test//(retryAnalyzer=MyRetry.class)
	private void Test1() {
		System.out.println(10/0);
	}
	
	@Test
	private void sTest2() {
		System.out.println(10/0);
	}
	
	@Test
	private void pTest3() {
		System.out.println(10/0);
	}
	
	
}
