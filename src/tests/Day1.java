package tests;

import org.testng.Assert;
import org.testng.annotations.*;

public class Day1 {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Execute before suite tag in xml");
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
