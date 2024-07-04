package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsNykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		WebElement brand = driver.findElement(By.xpath("//ul/li/a[text()='brands']"));
		ac.moveToElement(brand).perform();
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='css-150nd8c']/a")).click();
		String title = driver.getTitle();
		driver.findElement(By.className("css-1aucgde")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		String filter = driver.findElement(By.xpath("//span[@class='filter-value']")).getText();
		if(filter.equals("Shampoo"))
		{
			System.out.println("filter is applied correctly."+filter);
		}
	}

}
