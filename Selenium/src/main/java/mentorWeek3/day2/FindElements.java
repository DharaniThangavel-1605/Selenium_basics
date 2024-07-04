package mentorWeek3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		List<WebElement> findElements = driver.findElements(By.tagName("a"));
		for (int i = 0; i < findElements.size(); i++) 
		{
			System.out.println(findElements.get(i).getText());
		}
	}
}
