package com.valuemomentum.xyz.module1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngbasics2 
{
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Testcase starts ********************* &&&&&&&&&&&&&&&&&&  ************** ");
	}
	
	
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Configuration &&&&&&&&&&&&&&&&&&  ************** ");
	}
	
	
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Browser Open ************** ");
	}
	
	@Test
	public void test1()
	{
		//System.out.println("Browser Open ************** ");
		System.out.println("test1");
	}
	
	@Test
	public void test2()
	{
		//System.out.println("Browser Open ************** ");
		System.out.println("test2");
	}
	
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("Browser close ************** ");
	}
	

	@AfterClass
	public void afterclass()
	{
		System.out.println("Configuration &&&&&&&&&&&&&&&&&&  ************** ");
	}
	
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("Testcase ends ********************* &&&&&&&&&&&&&&&&&&  ************** ");
	}
	
}
