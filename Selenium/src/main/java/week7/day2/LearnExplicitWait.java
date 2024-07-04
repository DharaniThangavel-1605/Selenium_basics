package week7.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/waits.xhtml;");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		//WebElement waitforVisibility = driver.findElement(By.xpath("//span[text()='I am here']"));
	
	
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
	
		WebElement until = w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='I am here']"))));
	
		String text = until.getText();
		System.out.println(text);
	}

}
