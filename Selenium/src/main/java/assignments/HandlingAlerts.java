package assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//div[@class='product-image']/a)[1]")).click();
		driver.findElement(By.xpath("//input[@id='wk_zipcode']")).sendKeys("638012");
		driver.findElement(By.xpath("//div[@class='wk_zipfinder_btn']/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='add']")).click();
		//driver.findElement(By.xpath("//button[@class='btn harman_btn4']")).click();
		//driver.findElement(By.xpath("(//div[@class='top-cart'])[1]")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//div[@class='view-cart']")));
		//driver.findElement(By.xpath("//div[@class='view-cart']")).click();
		driver.findElement(By.xpath("//input[@id='checkout']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		//simple alert
		alert.accept();
	}

}
