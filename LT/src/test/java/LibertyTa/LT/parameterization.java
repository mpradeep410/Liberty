package com.valuemomentum.xyz.module1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class parameterization 
{
	@Parameters("browser")
	@Test
	public void TC1(String browser) throws Exception
	{
		try
		{
					System.out.println("TC1");
					
					if(browser.equalsIgnoreCase("chrome"))
					{
						System.out.println(browser + " is opened");
					/*	System.setProperty("webdriver.chrome.driver", "D:\\Rajasekhar\\chrome.exe");	
						ChromeDriver driver = new ChromeDriver();
					*/
					
					}else if(browser.equalsIgnoreCase("firefox"))
					{
						System.out.println(browser + " is opened");
					}else if(browser.equalsIgnoreCase("ie"))
					{
						System.out.println(browser + " is opened");
					}else
					{
						System.out.println(browser + " is not valid");
					}
					
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	

}
