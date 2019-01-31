package com.valuemomentum.xyz.module1;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exceptionhandling
{
	
	
	public void test() throws Exception
	{
		
	}
	
	
	public static void main(String[] args) throws WebDriverException
	{
		try
		{
		System.setProperty("webdriver.chrome.driver", "D:\\Rajasekhar\\chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		
			try{
			driver.get("www.fb.com");
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		
		}catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}catch(IllegalStateException ee)
		{
			
		}catch(Exception eee)
		{
			
		}
		
	}
	
	

}
