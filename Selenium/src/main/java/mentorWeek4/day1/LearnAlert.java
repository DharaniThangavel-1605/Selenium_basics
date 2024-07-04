package mentorWeek4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		//alert syntax
		Alert alert = driver.switchTo().alert();
		
		String alertText = alert.getText();
		
		System.out.println(alertText);
		Thread.sleep(3000);

		//simple alert
		alert.accept();
		
		String text = driver.findElement(By.id("simple_result")).getText();
		System.out.println(text);
		
		
		System.out.println(" ");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		
		alert.accept();
		//driver.close();

		
		  //alert.dismiss(); 
		  //exception alert.accept();
		 
	}

}
