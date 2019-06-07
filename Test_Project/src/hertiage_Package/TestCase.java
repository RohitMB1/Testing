package hertiage_Package;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

 public class TestCase 
 {
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
	      driver.manage().window().maximize();
	      
	      driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	    	
		driver.get("https://www.amazon.in/");
		Robot r = new Robot(); 
		  
        // It saves screenshot to desired path 
        String path = "C:\\Users\\M B Rohit\\Downloads\\rohit4.jpg"; 

        // Used to get ScreenSize and capture image 
        Rectangle capture =  
        new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()); 
        BufferedImage Image = r.createScreenCapture(capture); 
        ImageIO.write(Image, "jpg", new File(path)); 
        System.out.println("Screenshot saved");
		
		
		}
		catch(Exception d) {
		d.printStackTrace();
		}
	    }
		public static void selectItem(String xpath, String selectvalue)
		{
		try
		{
		element =driver.findElement(By.xpath(xpath));
		Select sel=new Select(element);
		sel.selectByVisibleText(selectvalue);
		
		Robot r = new Robot(); 
		  
        // It saves screenshot to desired path 
        String path = "C:\\Users\\M B Rohit\\Downloads\\rohit2.jpg"; 

        // Used to get ScreenSize and capture image 
        Rectangle capture =  
        new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()); 
        BufferedImage Image = r.createScreenCapture(capture); 
        ImageIO.write(Image, "jpg", new File(path)); 
        System.out.println("Screenshot saved");
		
		System.out.println("User able to enter value");
		}
		catch (Exception j)
		{
		j.printStackTrace();
		
		System.out.println("User not able to enter value");
		}
		}

		public static void enterText(String xpath, String entervalue)
		{
		try
		{
		WebDriverWait wait=new WebDriverWait(driver, 25);
		
		element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
		
		element =driver.findElement(By.xpath(xpath));
		element.sendKeys(entervalue);
		
		Robot r = new Robot(); 
		  
        // It saves screenshot to desired path 
        String path = "C:\\Users\\M B Rohit\\Downloads\\rohit3.jpg"; 

        // Used to get ScreenSize and capture image 
        Rectangle capture =  
        new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()); 
        BufferedImage Image = r.createScreenCapture(capture); 
        ImageIO.write(Image, "jpg", new File(path)); 
        System.out.println("Screenshot saved");
		
		System.out.println("User able to enter value");
		}
		catch (Exception j)
		{
		j.printStackTrace();
		
		System.out.println("User not able to enter value");
		}
		}

		public static void clickButton(String xpath)
		{
	    try
	    {
				
        element =driver.findElement(By.xpath(xpath));
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