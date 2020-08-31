package com.testng.retryanalyzer;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {

	@Test(retryAnalyzer=MyRetry.class)
	private void usernameValidation() {
		System.out.println("Validation Testing started");
		Assert.assertEquals("Arun", "Arunkumar");
	}
	
	@Test
	private void homePageValidation() {
		System.out.println("Hp VAlidation Testing started");
		Assert.assertEquals("Amazon", "Amazon.com");
	}
}
