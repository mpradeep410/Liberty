package com.valuemomentum.xyz.module1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.glass.events.KeyEvent;

public class Chrome
{

	public static void main(String[] args) throws InterruptedException, Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Rajasekhar\\chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();
	
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	/*	System.setProperty("webdriver.gecko.driver", "D:\\Tools\\Selenium 3.8.1\\geckodriver.exe");	
		FirefoxDriver driver = new FirefoxDriver();
	*/	
		driver.manage().window().maximize();
	/*	driver.get("http://www.toolsqa.com");
		System.out.println("Browser is opened");
		
		Thread.sleep(8000);

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("(//span[text()='Tutorial'])[1]"))).build().perform();
		Thread.sleep(2000);

		act.moveToElement(driver.findElement(By.xpath("(//span[text()='Web Automation Tools'])[1]"))).build().perform();
		
		act.moveToElement(driver.findElement(By.xpath("(//span[text()='Selenium in Java'])[1]"))).click().build().perform();

		
		
		Thread.sleep(8000);
		
		String title=driver.findElement(By.xpath("(//span[contains(text(),'Selenium Tutorial ')])[1]")).getText();
		System.out.println(title);

	//	act.moveToElement(driver.findElement(By.xpath("(//span[contains(text(),'Selenium Tutorial ')])[1]"))).contextClick().build().perform();
		
		
		//act.dragAndDrop(driver.findElement(By.xpath("(//span[contains(text(),'Selenium Tutorial ')])[1]")), driver.findElement(By.xpath("(//span[contains(text(),'Selenium Tutorial ')])[1]"))).build().perform();
		int x=driver.findElement(By.xpath("(//span[contains(text(),'Selenium Tutorial ')])[1]")).getLocation().getX();
		System.out.println(x);
		
		int y=driver.findElement(By.xpath("(//span[contains(text(),'Selenium Tutorial ')])[1]")).getLocation().getY();
		System.out.println(y);
		
		*/
	/*	
		driver.get("file:///C:/Users/Lenovo/Desktop/alert.html");
		
		
		driver.findElement(By.xpath("//input[@value='Click Me']")).click();
		Thread.sleep(4000);
		
		
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		
		
		a.accept();*/
		
		
	/*	
	 * *************************************************** 06/01/2019*********************
	 * driver.get("file:///C:/Users/Lenovo/Desktop/fileupload.html");
		
		driver.findElement(By.xpath("//input[@id='fileToUpload']")).click();
		Thread.sleep(4000);
		
		Thread.sleep(4000);
		
		StringSelection sel = new StringSelection("D:\\Rajasekhar\\upload.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);

		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(4000);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		*/
	/*	
		driver.get("https://www.irctc.co.in");
		Thread.sleep(8000);
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@title='3rd party ad content'])[3]")));
		driver.findElement(By.xpath("(//a[@id='aw0']/amp-img)[1]")).click();
	*/	
	/*	driver.navigate().to("http://www.google.co.in");
		System.out.println("Navigated to Google Page");
		
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		
		driver.get("http://www.naukri.com");
		
		driver.quit();*/
		
/*		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		String account=driver.findElement(By.xpath("//span[text()='Create an account']")).getText();
		System.out.println(account);
		
		String req_account = "XYZ";
		
		if(req_account.equals(account))
		{
			System.out.println("PASS");
		}else
		{
			System.out.println("FAIL");
		}
		
		System.out.println("**********************");
		
		if(req_account.equalsIgnoreCase(account))
		{
			System.out.println("PASS");
		}else
		{
			System.out.println("FAIL");
		}
		System.out.println("**********************");

		
		if(req_account.contains(account))
		{
			System.out.println("PASS");
		}else
		{
			System.out.println("FAIL");
		}
		
		System.out.println("**********************");

		
		if(req_account.equals(account.trim()))
		{
			System.out.println("PASS");
		}else if(req_account.equalsIgnoreCase(account))
		{
			System.out.println("PASS");
		}else if(account.contains("XY"))
		{
			System.out.println("PASS");
		}else
		{
			System.out.println("FAIL");
		}
		
		
		System.out.println(account.length());
		
		
		
		String a = " Rajasekhar        ";
		System.out.println(a);
		
		System.out.println(a.trim());
		
		System.out.println(a.length());
		System.out.println(a.trim().length());
		
		*/
		
		driver.get("http://www.facebook.com");
		Thread.sleep(8000);
	
		String name=driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("aria-label");
		System.out.println(name);
		
		System.out.println(name+ " is displayed in Firstname field");
		
		String kannada=driver.findElement(By.xpath("//a[@title='Kannada']")).getText();
		System.out.println(kannada);
		Thread.sleep(6000);
		
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@aria-label='First name']"))));
		
		
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Rajasekhar");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Selenium");
		
		driver.findElement(By.xpath("(//input[contains(@aria-label,'email')])[1]")).sendKeys("9090909090");


		
		driver.findElement(By.xpath("//label[text()='Female']/preceding-sibling::input")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//label[text()='Male']/preceding-sibling::input")).click();

		driver.findElement(By.xpath("//input[@name='lastname']")).clear();
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Hyderabad");
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		
		
		
		String find=driver.findElement(By.xpath("(//h2[text()='Find Your Account'])[2]")).getText();
		System.out.println(find);
		
		
		if(find.trim().equalsIgnoreCase("Find Your Account"))
		{
			System.out.println("PASS");
			System.out.println(find + " is displayed in Forgot account page");
		}else
		{
			System.out.println("FAIL");
			System.out.println(find + " is not displayed in Forgot account page");

		}
		
		/*	// if the tag is select 
		WebElement month = driver.findElement(By.xpath("//select[contains(@aria-label,'Month')]"));
		Select sel = new Select(month);
		sel.selectByIndex(5);
		
		Thread.sleep(6000);
		
		sel.selectByValue("8");
		
		Thread.sleep(6000);

		sel.selectByVisibleText("Nov");
		
		
		Thread.sleep(6000);
		
		
		// if the tag is any other except select
		driver.findElement(By.xpath("//ul[contains(@aria-label,'Month')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Aug']")).click();
		
		
		boolean image = driver.findElement(By.xpath("//div[contains(text(),'Facebook helps')]/following-sibling::img")).isDisplayed();
		System.out.println(image);
		
		
		if(image)
		{
			System.out.println("Facebook Image is displayed --- PASS");
		}else
		{
			System.out.println("Facebook Image is not displayed --- FAIL");
	
		}

		
		boolean nameval=driver.findElement(By.xpath("//input[@name='firstname']")).isEnabled();
		System.out.println(nameval);
		
		if(nameval)
		{
			System.out.println("First name Texbox  is displayed --- PASS");
			driver.findElement(By.xpath("//input[@name='firstname']")).clear();
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Pradeep");
			
		}else
		{
			System.out.println("First name is not enabled --- FAIL");
	
		}
		
		boolean maleradio = driver.findElement(By.xpath("//label[text()='Male']/preceding-sibling::input")).isSelected();
		System.out.println(maleradio);
		
		if(maleradio)
		{
			System.out.println("Radio button male is clicked --- PASS");
				
		}else
		{
			System.out.println("Radio button male is not clicked --- FAIL");
	
		}
		
		boolean femaleradio = driver.findElement(By.xpath("//label[text()='Female']/preceding-sibling::input")).isSelected();
		System.out.println(femaleradio);
		
		if(femaleradio)
		{
			System.out.println("Radio button Female is clicked --- PASS");
				
		}else
		{
			System.out.println("Radio button Female is not clicked --- FAIL");
	
		}*/
		
		
		
	}

}
