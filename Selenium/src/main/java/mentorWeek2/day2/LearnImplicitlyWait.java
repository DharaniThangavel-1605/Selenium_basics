package mentorWeek2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnImplicitlyWait {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		//implicitly wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/");
		
		
		
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Dilip");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Raju");
		
		
		//webDriver methods
		
		//get title of page
		
		String title = driver.getTitle();
		System.out.println(title+" : title of the page");
		
		//get current url of the page
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl +" : current URL of the page");
		
		//get text from the webpage
		//getText();
		
		String text = driver.findElement(By.className("_58mt")).getText();
		System.out.println(text+" Getting text from Webpage");
		

	}

}
