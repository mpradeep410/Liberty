package com.valuemomentum.xyz.module1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testngbasics 
{
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Report start %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% &&&&&&&&&&&&&&&&&&  ************** ");
	}
	
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("Report end %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% &&&&&&&&&&&&&&&&&&  ************** ");
	}
	
	
	/*
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Testcase starts ********************* &&&&&&&&&&&&&&&&&&  ************** ");
	}
	*/
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Configuration &&&&&&&&&&&&&&&&&&  ************** ");
	}
	
	
	@Parameters({"browser","username","password"})
	@BeforeMethod
	public void beforemethod(String browser, String username, String password)
	{
		System.out.println("Browser Open ************** " + browser + username + password);
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
	
	
/*	@AfterTest
	public void aftertest()
	{
		System.out.println("Testcase ends ********************* &&&&&&&&&&&&&&&&&&  ************** ");
	}*/
	
}
