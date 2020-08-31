package com.testng.concepts;

import org.testng.annotations.Test;

public class DependancyTest {

	@Test
	private void browserLaunch() {
		System.out.println("Browser Launch");
	}

	@Test//(dependsOnMethods = "browserLaunch")
	private void logOut() {
		System.out.println("Enter url");
	}

	@Test(dependsOnMethods = "logOut")
	private void mobileSearch() {
		System.out.println("Mobile Search");
	}

}
