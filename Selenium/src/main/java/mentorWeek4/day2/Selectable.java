package mentorWeek4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/selectable/");
		
		driver.switchTo().frame(0);
		WebElement i2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement i3 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		WebElement i4 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		
		
		Actions ac=new Actions(driver);
		//both keyboard and mouse event
		ac.keyDown(Keys.CONTROL).click(i2).click(i3).click(i4).keyUp(Keys.CONTROL).perform();

		
	}

}
