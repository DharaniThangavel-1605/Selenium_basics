package assignments;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAmazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='nav-search-field ']/input")).sendKeys("oneplus 9 pro");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[text()='oneplus 9 pro'])[1]")).click();
		String firstPrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("Price of first phone:"+firstPrice);
		String firstRating = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
		System.out.println("Rating of first product:"+firstRating);
		Actions ac= new Actions(driver);
		WebElement firstPhone = driver.findElement(By.xpath("(//span[contains(@class,'a-text-normal')])[1]"));
		ac.click(firstPhone).perform();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> allLink =new ArrayList<String>(windowHandles);
		driver.switchTo().window(allLink.get(1));	
		Thread.sleep(3000);
		File snapShot= driver.getScreenshotAs(OutputType.FILE);
        File location=new File("./snap/shot1.png");
        FileUtils.copyFile(snapShot, location);
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",driver.findElement(By.id("add-to-cart-button")));
        String cartTotal = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
        if(firstPrice.equals(cartTotal))
        {
        	System.out.println("Price is correct");
        }
        else
        {
        	System.out.println("Price is incorrect");
        }
        driver.switchTo().window(allLink.get(1)).close();
       driver.switchTo().window(allLink.get(0)).close();
        
	}

}
