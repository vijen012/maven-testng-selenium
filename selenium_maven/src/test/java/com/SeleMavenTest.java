package com;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleMavenTest 
{
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	
	@Test
	public void testLaunchURL() 
	{
		System.out.println("Launced URL => http://www.google.com");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test");
	}
}
