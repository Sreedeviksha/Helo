package com.testng.concepts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
	
	//hard assert(Stop)
	/*@Test
	private void sample1() {
		System.out.println("Test1 started");
		Assert.assertEquals("a", "A");
		System.out.println("validation1 completed");
		System.out.println("Test1 completed");
	}

	//soft assert (Only verify)
	@Test
	private void sample2() {
		SoftAssert soft=new SoftAssert();
		System.out.println("Test2 started");
		soft.assertEquals("b", "B");
		System.out.println("validation2 completed");
		System.out.println("Test2 completed");
		soft.assertAll();
	}*/
	
	@Test
	private void test() {
		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
		SoftAssert soft = new SoftAssert();
		soft.assertEquals("Gooogle", driver.getTitle());
		System.out.println("Verification completed");
		//soft.assertAll();
		
	}
	
	
	
	
}
