package mentorWeek4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) 
	{

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	
	    Actions ac=new Actions(driver);
	
	     //obj.method
	     //perform()-mandatory
	     //actions it will throw any exception
	     
	     ac.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).perform();
	
	}
}
