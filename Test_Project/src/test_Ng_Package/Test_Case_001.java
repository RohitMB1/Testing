package test_Ng_Package;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Case_001 {
	
	public static WebDriver driver;
	public static WebElement element;
	
	
	@BeforeTest 
	
	public static   void openBrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\config_Drivers\\chromedriver.exe");
				driver=new ChromeDriver();
				
				System.out.println("We are  able to open browser");
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("We are not able to open browser");
			}
			}
			
	@Test (priority = 0)
	
			public static void launchApplication()
			
			{
		    try 
		    {
		      
		    	
			driver.get("https://www.underarmour.com/en-in?smodal=en_MY");
			
			}
			catch(Exception d) 
		    {
			d.printStackTrace();
			}
		    }
	
	
	@Test (priority = 1)
	
	public static void searchItem()
	{
	try
	{
	
	element =driver.findElement(By.xpath("//input[@class='search-input ua-typeahead-input']"));
	element.sendKeys("BASKETBALL");
	element.click();
	
	
	System.out.println("User able to enter value");
	}
	catch (Exception j)
	{
	j.printStackTrace();
	
	System.out.println("User not able to enter value");
	}
	}
	
	
	
	@Test (priority = 2)
	
	public static void clickButton()
	{
    try
    {
			
    element =driver.findElement(By.xpath("//*[@href='/en-in/mens/tops/basketball/g/39lfy?iid=nav']"));
	element.click();
	}
    
    catch (Exception h)
	{
	h.printStackTrace();
	}
	}
	
	@Test (priority = 3)
    public static void searchResult()
    {
    try
    {
    	element = driver.findElement(By.xpath("//*[@class='tile tile-0']"));
	element.click();
	String h = element.getText();
	System.out.println(h);
	h = element.getAttribute("value");
	System.out.println(h);
	
    }
    catch (Exception z)
	{
	z.printStackTrace();
	}
    }
	
	
	
	@AfterTest
	
	public static void closeBrowser()
    {
	try
	{
		driver.close();
		driver.quit();
		System.out.println("We are  able to close browser");
	}
	catch(Exception a)
	{
		a.printStackTrace();
		System.out.println("We are not able to close browser");
    }

    }
}

	
	
			
	