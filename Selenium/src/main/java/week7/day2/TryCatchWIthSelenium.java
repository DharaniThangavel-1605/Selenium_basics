package week7.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryCatchWIthSelenium {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		try {
			driver.findElement(By.id("usernam")).sendKeys("DemoSalesManager");
		} catch (NoSuchElementException e) {
			System.out.println(e);
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		}catch (Exception e) {
			System.out.println(e);
		}
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

	}

}
