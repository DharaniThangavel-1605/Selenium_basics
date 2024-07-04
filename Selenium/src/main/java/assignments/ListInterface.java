package assignments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListInterface {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//label[contains(@class,'facet-linkname-Men')])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//label[contains(@class,'facet-linkname-Men - Fashion Bags')])[1]")).click();
		Thread.sleep(4000);
		String text = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("Count of Bags:"+text);
		List<WebElement> brand = driver.findElements(By.xpath("//div[@class='brand']/strong"));
		for (int i = 0; i < brand.size(); i++) 
		{
			System.out.println(brand.get(i).getText());
		}
		List<WebElement> bagName = driver.findElements(By.xpath("//div[@class='nameCls']"));
		for (int i = 0; i < brand.size(); i++) 
		{
			System.out.println(bagName.get(i).getText());
		}
	}

}
