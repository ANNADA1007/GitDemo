package tests;

import org.testng.annotations.*;

public class Day3 {
	
	@BeforeMethod
	public void beforeTestMethod() {
		System.out.println("Before every car test method");
	}
	
	@Parameters({"URL"})
	@Test
	public void webLoginCarLoan(String url) {
		//selenium
		System.out.println("URL - " + url);
		System.out.println("Web Login Car");
	}
	
	@Test
	public void mobileLoginCarLoan() {
		//Appium
		System.out.println("Mobile Login Car");
	}
	
	@Test(groups = {"Smoke"},enabled=false)
	public void mobileSignInCarLoan() {
		//Appium
		System.out.println("Mobile Sign In Car");
	}
	
	@Test(dataProvider="getData")
	public void mobileSignOutCarLoan(String username, String password) {
		//Appium
		System.out.println("Mobile Sign Out Car");
		System.out.println("Username = " + username + "Passowrd = " + password);
	}
	
	@Parameters({"URL"})
	@Test(dependsOnMethods = {"webLoginCarLoan"})
	public void APICarLoan(String url) {
		//Rest API Automation
		System.out.println("URL - " + url);
		System.out.println("API Login Car");
	}
	
	@DataProvider
	public Object getData() {
		//1st combination - username, password - good credit history
		//2nd combination - diff - username, password - no credit history
		//3rd combination - diff - username, password - fraudulent credit history
		
		//1st set
		Object[][] data = new Object[3][2];
		data[0][0] = "firstUser";
		data[0][1] = "firstPass";
		
		//2nd set
		data[1][0] = "secondUser";
		data[1][1] = "secondPass";
		
		//3rd set
		data[2][0] = "thirdUser";
		data[2][1] = "thirdPass";
		
		return data;
		
		
	}
	
	
}
