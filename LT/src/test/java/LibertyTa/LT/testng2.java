package com.valuemomentum.xyz.module1;

import org.junit.Assert;
import org.testng.annotations.Test;

public class testng2 
{
	
	@Test(enabled=false)
	public void test1()
	{
		System.out.println("test1");
	}

	@Test(enabled=true,groups="Regression")
	public void test11()
	{
		System.out.println("test1");
	}

	@Test(priority=3,enabled=true,groups={"Smoke","Functional"})
	public void test1123121()
	{
		System.out.println("test1");
	}

/*	@Test(priority=4,enabled=true)
	public void test11311()
	{
		System.out.println("Login");
	Assert.fail("Intentially failing the testcase");
		System.out.println("Step 3");
		System.out.println("Step 4");
	}

	@Test(priority=5,dependsOnMethods="test11311",alwaysRun=true)
	public void test331311()
	{
		System.out.println("HomePage");
	}*/

}
