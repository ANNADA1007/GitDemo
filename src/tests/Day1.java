package tests;

import org.testng.Assert;
import org.testng.annotations.*;

public class Day1 {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Execute before suite tag in xml");
		System.out.println("Added a new statement");
		System.out.println("Good luck on site guy figuring this out");
	}
	
	@Test
	public void Demo() {
		System.out.println("Hello");
	}
	
	@Test
	public void secondTest() {
		System.out.println("Bye");
		Assert.assertTrue(false);
	}
	
	@Test(groups = {"Smoke"})
	public void thirdTest() {
		System.out.println("World");
	}
	
	
}
