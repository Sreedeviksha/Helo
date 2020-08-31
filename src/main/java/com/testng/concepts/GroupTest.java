package com.testng.concepts;

import org.testng.annotations.Test;

public class GroupTest {

	@Test(groups="Selenium Test")
	private void seleniumTest1() {
		System.out.println("Selenium Test1");
	}
	
	@Test(groups="Selenium Test")
	private void seleniumTest2() {
		System.out.println("Selenium Test2");
	}
	
	@Test(groups="API Test")
	private void APITest1() {
		System.out.println("API Test1");
	}
	
	@Test(groups="Appium Test")
	private void AppiumTest() {
		System.out.println("Appium Test");
	}
	
}
