package com.valuemomentum.xyz.module1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class objectrepositry 
{
	
	
	
	
	public static void main(String[] args) throws Exception
	{/*
		
		
		FileInputStream fis = new FileInputStream("D:\\Rajasekhar\\Selenium\\src\\com\\valuemomentun\\xyz\\properties\\objectrepository.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		
		
		FileInputStream config = new FileInputStream("D:\\Rajasekhar\\Selenium\\src\\com\\valuemomentun\\xyz\\properties\\config.properties");
		Properties configuration = new Properties();
		configuration.load(config);
		
		System.out.println(configuration.getProperty("Facebook_Dev"));
		System.out.println(configuration.getProperty("Facebook_SIT"));
		System.out.println(configuration.getProperty("Facebook_PROD"));

		
		System.out.println(prop.getProperty("Login_firstname"));
		

		System.setProperty("webdriver.chrome.driver", "D:\\Rajasekhar\\chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
	
		System.setProperty("webdriver.gecko.driver", "D:\\Tools\\Selenium 3.8.1\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
	
		driver.get(configuration.getProperty("Facebook_SIT"));
		Thread.sleep(8000);
	
		String name=driver.findElement(By.xpath(prop.getProperty("Login_firstname"))).getAttribute("aria-label");
		System.out.println(name);
		
		
		String kannada=driver.findElement(By.xpath("//a[@title='Kannada']")).getText();
		System.out.println(kannada);
		Thread.sleep(6000);
		
		driver.findElement(By.xpath(prop.getProperty("Login_firstname"))).sendKeys("Rajasekhar");
		driver.findElement(By.xpath(prop.getProperty("Login_lastname"))).sendKeys("Selenium");
		
		driver.findElement(By.xpath("(//input[contains(@aria-label,'email')])[1]")).sendKeys("9090909090");


		
		driver.findElement(By.xpath("//label[text()='Female']/preceding-sibling::input")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//label[text()='Male']/preceding-sibling::input")).click();

		driver.findElement(By.xpath(prop.getProperty("Login_lastname"))).clear();
		
		driver.findElement(By.xpath(prop.getProperty("Login_lastname"))).sendKeys("Hyderabad");
	
		
		
	*/
		

	System.setProperty("webdriver.chrome.driver", "D:\\Rajasekhar\\chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();

		/*		
		driver.get("http://www.facebook.com");
		Thread.sleep(5000);
		
		
		String a = "Raja";
		String b = "sekhar";
		String c= " ";

		System.out.println(a);
		System.out.println(b);
		//Concatination
		System.out.println(a+b);
		
		System.out.println(a+c+b);
		
		System.out.println(a+" "+b);
		
		
		System.out.println("(//select[@id='month']/option)[1]");
		System.out.println("(//select[@id='month']/option)[");
		System.out.println("1");
		System.out.println("]");
		
		
		System.out.println("(//select[@id='month']/option)["+"1");
		
		
		System.out.println("(//select[@id='month']/option)["+"1"+"]");

		
		
		System.out.println("raja1sekhar");
		
		System.out.println("raja" + "1" + "sekhar");
		
		
		for(int i = 1;i<=10;i++)
		{
			System.out.println(i);
			System.out.println("raja"+i+"sekhar");
		}
		
		
		
		List<WebElement> month = driver.findElements(By.xpath("(//select[@id='month']/option)"));
		System.out.println(month.size());
		
		for(int i =1 ; i<=month.size();i++)
		{
			System.out.println(i);
			//System.out.println("(//select[@id='month']/option)["+i+"]");
			
			String drop = driver.findElement(By.xpath("(//select[@id='month']/option)["+i+"]")).getText();
			System.out.println(drop);
			
				if(drop.equals("Feb"))
				{
					break;
				}
					
			
		}
		
		System.out.println("******************************************************");
		
		List<WebElement> link = driver.findElements(By.xpath("//a"));
		System.out.println(link.size());

		for(int j = 1; j<=link.size(); j++)
		{
			 
			String linkname = driver.findElement(By.xpath("(//a)["+j+"]")).getText();
			
			
		
				if(linkname.equalsIgnoreCase("Log In"))
				{
					System.out.println(linkname + "  link is displayed in Home Page");
					break;
				}else
				{
					System.out.println(linkname);
					System.out.println(linkname + "  link is displayed in Home Page");
				}
		
			
			
			
		}
		*/
		// ***************** 8th Jan 2019 *********************
		String a1 = "raja";
		String b1 = "sekhar";
		if(a1.equalsIgnoreCase("raja")&&b1.equalsIgnoreCase("Sekhar"))
		{
			System.out.println("PASS");
		}else
		{
			System.out.println("FAIL");
		}
		
		
		if(a1.equalsIgnoreCase("raja")&&b1.equalsIgnoreCase("pradeep"))
		{
			System.out.println("PASS");
		}else
		{
			System.out.println("FAIL");
		}
		
		
		if(a1.equalsIgnoreCase("raja")||b1.equalsIgnoreCase("deep"))
		{
			System.out.println("PASS");
			
		}else
		{
			System.out.println("FAIL");
		}
		
		//**************************************************************************
		
/*		driver.get("http://www.naukri.com");
		
		Thread.sleep(5000);
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		String parenttitle = driver.getTitle();
		 System.out.println(driver.getTitle());

		Set<String> wind = driver.getWindowHandles();
		System.out.println("Total no. of windows are : "+wind.size());
		
		for(String x:  wind)
		{
			System.out.println(x);
			
			
			if(!parent.equals(x))
			{
				driver.switchTo().window(x);
				 System.out.println(driver.getTitle());
				 	
				 	if(driver.getTitle().trim().equalsIgnoreCase("Genpact"))
				 	{
				 		driver.findElement(By.xpath("(//a/img)[1]")).click();
				 		System.out.println("Clicked on Apply button for Genpact");
				 	}
				 
			}
			
			 
			
			
		}
		
		
		
		driver.quit();*/
		
		String path = "D:/Rajasekhar/raja.xlsx";
		
		
		if(path.contains(".xlsx"))
		{
			System.out.println("XSSFWorkbook");
		}else
		{
			System.out.println("HSSFWorkbook");
		}
		
		
	/*	String title = driver.getTitle();		
		System.out.println(title);
		
		System.out.println(title + "title is displayed");
		
		System.out.println(title + " title is displayed");

		System.out.println(title + " "+"title is displayed");
*/
		
		
		
	
	
	}

}
