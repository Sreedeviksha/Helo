package com.testng.concepts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider="MyDataProvider")
	private void login(String username, String Password) {
		System.out.println("Username:  "+username+"  Password:  "+Password);
	}
	
	@DataProvider(name="MyDataProvider")
	private Object[][] loginData() {
		
		return new Object[][] { 
								{"aaaa", "11111"},
								{"bbbb", "22222"},
								{"cccc", "33333"},
								{"dddd", "44444"}
							  };
	}

}
