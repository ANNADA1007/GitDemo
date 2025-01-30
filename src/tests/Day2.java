package tests;

import org.testng.annotations.*;

public class Day2 {
	
	
	
	@Test(groups = {"Smoke"})
	public void ploan() {
		System.out.println("Personal Loan");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before test tag in xml");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After test tag in xml");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("Execute after suite tag in xml");
	}
}
