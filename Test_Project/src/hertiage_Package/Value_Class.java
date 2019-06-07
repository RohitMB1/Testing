package hertiage_Package;

public class Value_Class extends TestCase {

public static void main(String[] args) {   //Sending values at time of execution//
			
			openBrowser();
			launchApplication();
			selectItem("//select[@class='nav-search-dropdown searchSelect']", "Books");
			enterText("//input[@id='twotabsearchtextbox']", "Horror");
			clickButton("//input[@class='nav-input']");
			closeBrowser();
	        
	}
	

}