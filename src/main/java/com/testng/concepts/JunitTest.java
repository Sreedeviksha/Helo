package com.testng.concepts;

import org.junit.Test;
import org.testng.Assert;

public class JunitTest {

	@Test
	public void sample() {
		System.out.println("Test");

		Assert.assertEquals("A", "A");
	}
}
