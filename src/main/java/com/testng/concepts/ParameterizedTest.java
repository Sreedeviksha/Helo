package com.testng.concepts;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {
	
	@Parameters({"username","password"})
	@Test
	private void login(@Optional("Arun")String username, String Password) {
		
		System.out.println("enter the login details");
		System.out.println("Username:"+username);
		System.out.println("Password:"+Password);
	}
	
}
