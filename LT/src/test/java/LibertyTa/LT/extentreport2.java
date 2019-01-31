package com.valuemomentum.xyz.module1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extentreport2 extends commons
{

	
	
	@BeforeSuite
	public void report()
	{
		extent = new ExtentReports(reportpath, true);

	}
	
	
	
	@Test
	public void TC2()
	{
		
		test=extent.startTest("TC2","Login to the Application");
		System.out.println("TC2 is started");
		Reporter.log("TC2 is started");
		test.log(LogStatus.PASS, "TC2 is started and working");
		test.log(LogStatus.PASS, "TC2 is started and working");

		test.log(LogStatus.PASS, "TC2 is started and working");

		test.log(LogStatus.PASS, "TC2 is started and working");

		test.log(LogStatus.PASS, "TC2 is started and working");

		
		extent.endTest(test);
		
		
	}
	
	

	
		@AfterMethod
		public void aftermetod()
		{
			extent.flush();
		}
	
	
	
	
	
}
