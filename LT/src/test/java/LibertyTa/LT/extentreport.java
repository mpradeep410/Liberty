package com.valuemomentum.xyz.module1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extentreport extends commons
{
	
	
	
	@BeforeSuite
	public void report()
	{
		extent = new ExtentReports(reportpath, true);

	}
	
	
	
	@Test
	public void TC1()
	{
		
		test=extent.startTest("TC1","Login to the Application");
		System.out.println("TC1 is started");
		Reporter.log("TC1 is started");
		test.log(LogStatus.PASS, "TC1 is started and working");
		
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Rajasekhar\\chrome.exe");	
			ChromeDriver driver = new ChromeDriver();
			test.log(LogStatus.PASS, "chrome browser is opened");

		}catch(Exception e)
		{
			test.log(LogStatus.FAIL, "TC1 is failed " + e.getMessage());

		}

		test.log(LogStatus.INFO, "TC1 is started and working");

		test.log(LogStatus.WARNING, "TC1 is started and working");

		test.log(LogStatus.PASS, "TC1 is started and working");

		test.log(LogStatus.PASS, "TC1 is started and working");

		test.log(LogStatus.PASS, "TC1 is started and working");

		
		extent.endTest(test);
		
		
	}
	
	

	
		@AfterMethod
		public void aftermetod()
		{
			extent.flush();
		}
	
	
	
	
	
}
