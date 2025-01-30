package tests;

import org.testng.annotations.*;

public class Day4 {
	
	@Test(groups = {"Smoke"})
	public void webLoginHomeLoan() {
		//selenium
		System.out.println("Web Login Home");
	}
	
	@Test
	public void mobileLoginHomeLoan() {
		//Appium
		System.out.println("Mobile Login Home");
	}
	
	@Parameters({"URL","APIKey/username"})
	@Test
	public void loginAPIHomeLoan(String url, String APIKey_username) {
		//Rest API Automation
		System.out.println("URL - " + url + " ,API Key / username - " + APIKey_username);
		System.out.println("API Login Home");
	}
	
	@AfterMethod
	public void afterTestMethod() {
		System.out.println("After every home loan class method");
	}
	
	
}
