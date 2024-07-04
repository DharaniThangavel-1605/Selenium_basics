package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Dharani");
		
		//Web Driver methods
		//to get title of the page
		String title = driver.getTitle();
		System.out.println("Title of the page:"+title);
		
		//to get current URL 
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL:"+currentUrl);
		
		//to get the text of webpage
		
		String text = driver.findElement(By.className("_58mt")).getText();
		System.out.println("Getting text from webpage"+text);
		
	}

}
