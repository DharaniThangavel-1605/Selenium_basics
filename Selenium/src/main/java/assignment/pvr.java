package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pvr {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//img[@alt='Chennai']")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//div[@class='nav-icon']")) );
		//driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[text()='Movie Library']")) );
		//driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		WebElement selec = driver.findElement(By.xpath("//select[@name='genre']"));
		Select genre=new Select(selec);
		genre.selectByIndex(3);
		Select lang=new Select(driver.findElement(By.xpath("//select[@name='lang']")));
		lang.selectByIndex(1);
		driver.findElement(By.xpath("//button[contains(@class,'btn-submit btn-primary')]")).click();
		Thread.sleep(4000);
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click();",driver.findElement(By.xpath("//div[text()='Paw Patrol']")) );
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		Thread.sleep(4000);
		Select cinema=new Select(driver.findElement(By.xpath("//select[@name='cinemaName']")));
		cinema.selectByIndex(1);
		Select time=new Select(driver.findElement(By.xpath("//select[@name='timings']")));
		time.selectByVisibleText("09:00 AM - 12:00 PM");
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Dharani");
		driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("dharani@gmail.com");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("8344721804");
		Select food=new Select(driver.findElement(By.xpath("//select[@name='food']")));
		food.selectByValue("Yes");
		driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("nothing");
		JavascriptExecutor js3 = (JavascriptExecutor)driver;
		js3.executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@name='copySelf']")) );
		//driver.findElement(By.xpath("//input[@name='copySelf']")).click();
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[@class='cancel-btn text-center']/button[text()='CANCEL']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='×']")).click();
	}
}
