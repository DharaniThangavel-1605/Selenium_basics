package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("8344721804");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("Dharuvkv@1605");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();		
		Thread.sleep(3000);
		String title=driver.getTitle();
		System.out.println(title);
		//driver.close();
	}

}
