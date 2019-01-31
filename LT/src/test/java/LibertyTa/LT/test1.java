package com.valuemomentum.xyz.module1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 
{
	
	@Test
	public void t1()
	{
		System.out.println("t1");
		System.setProperty("webdriver.chrome.driver", "D:\\Rajasekhar\\chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
		
	}
	@Test
	public void t2()
	{
		System.out.println("t2");
		System.setProperty("webdriver.chrome.driver", "D:\\Rajasekhar\\chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	
	}

	@Test
	public void t3()
	{
		System.out.println("t3");
		System.out.println("t3 step 1");
		System.out.println("t3 step 2");
		System.setProperty("webdriver.chrome.driver", "D:\\Rajasekhar\\chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.toolsqa.com");
	
	}

	
	@Test
	public void t4()
	{
		System.out.println("t4");
		System.setProperty("webdriver.chrome.driver", "D:\\Rajasekhar\\chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");
	
	}

	
	@Test
	public void t5()
	{
		System.out.println("t5");
		System.out.println("t5 step 1");
		System.out.println("t5 step 2");
		System.setProperty("webdriver.chrome.driver", "D:\\Rajasekhar\\chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	
	}

	@Test
	public void t51()
	{
		System.out.println("t5");
		System.out.println("t5 step 1");
		System.out.println("t5 step 2");
		System.setProperty("webdriver.chrome.driver", "D:\\Rajasekhar\\chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	
	}

	
	
}
