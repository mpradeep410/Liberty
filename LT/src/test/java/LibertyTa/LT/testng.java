package com.valuemomentum.xyz.module1;

import org.testng.annotations.Test;

public class testng 
{
	
	@Test(groups={"Regression","Functional"})
	public void test1()
	{
		System.out.println("test1");
	}

	@Test(enabled=false)
	public void test11()
	{
		System.out.println("test1");
	}

	@Test(priority=3,enabled=false)
	public void test1123121()
	{
		System.out.println("test1");
	}

	@Test(priority=4,enabled=false)
	public void test11311()
	{
		System.out.println("test1");
	}

	@Test(priority=5,enabled=false)
	public void test331311()
	{
		System.out.println("test1");
	}

}
