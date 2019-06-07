package View_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Result {


	public static WebDriver driver;
	public static WebElement element;
	
	public static void openBrowser()
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
		
		public static void launchApplication()
		{
			
	    try 
	    {
		driver.get("https://www.amazon.in/");
		}
		catch(Exception d) {
		d.printStackTrace();
		}
	    }

		public static void enterText()
		{
		try
		{
		element =driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		element.sendKeys("Music player");
		
		System.out.println("User able to enter value");
		}
		catch (Exception j)
		{
		j.printStackTrace();
		
		System.out.println("User not able to enter value");
		}
		}

		public static void clickButton()
		{
	    try
	    {
				
        element =driver.findElement(By.xpath("//input[@class='nav-input']"));
		element.click();
		}
		
		catch (Exception h)
		{
		h.printStackTrace();
		}
		
	    }
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