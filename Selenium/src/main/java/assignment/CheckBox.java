package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;



public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Basic']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		//Thread.sleep(4000);
		//driver.findElement(By.xpath("//div[contains(@class,'ui-chkbox-icon ui-c')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[contains(@class,'ui-toggleswitch-slider')]")).click();
		boolean enabled = driver.findElement(By.xpath("//div[contains(@class,'ui-helper-hidden')]/input[@disabled='disabled']")).isEnabled();
		System.out.println("Checkbox Enabled-true or false:"+enabled);
		driver.findElement(By.xpath("//div[@role='combobox']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//input[@value='Miami']")));
		//driver.findElement(By.xpath("//input[@value='Miami']")).click();
		driver.findElement(By.xpath("//li[@data-item-value='Paris']")).click();
		driver.findElement(By.xpath("//li[@data-item-value='Berlin']")).click();
	}
}
