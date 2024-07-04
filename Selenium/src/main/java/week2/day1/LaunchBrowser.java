package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		/*
		 * before Selenium 4.6.0v
		 * 
		 * WebDriverManager().chromeDriver().setup(); 
		 * ChromeDriver driver=new ChromeDriver();
		 */
		
		//selenium Manager -4.6.0v
		
		
		//step -1 launch the browser
		EdgeDriver driver=new EdgeDriver();
		
				//step-2 load the Url (object.method())
		
		driver.get("https://www.gmail.com");
		
		//max screen
	driver.manage().window().maximize();
		
		//close browser
	driver.close();
	}

}
