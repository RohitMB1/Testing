package common_Keywords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

    public class Business_Class {
	
	public static WebDriver driver;
	
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