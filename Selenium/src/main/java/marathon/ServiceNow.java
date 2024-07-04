package marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://dev213815.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("gCBhi4q^GP1^");
		driver.findElement(By.id("sysverb_login")).click();
		Thread.sleep(10000);
		Shadow dom = new Shadow(driver);
		dom.findElementByXPath("//div[text()='All']").click();
		Thread.sleep(3000);
		dom.findElementByXPath("//span[text()='Service Catalog']").click();
		WebElement frame1 = dom.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//div[@class='drag_section']/table/tbody/tr/td/a[text()='Mobiles']")).click();
		//driver.executScript("arguments[0].click();", WebElement);
		driver.findElement(By.xpath("//a/h2/strong[text()='Apple iPhone 13']")).click();
		driver.findElement(By.xpath("//span/label[text()='Yes']")).click();
		driver.findElement(By.xpath("(//input[contains(@class,'cat_item_option')])[4]")).sendKeys("99");
		WebElement dataallow = dom.findElementByXPath("//select[@class='form-control cat_item_option ']");
		Select sc=new Select(dataallow);
		sc.selectByIndex(2);
		driver.findElement(By.xpath("//label[text()='Blue']")).click();
		driver.findElement(By.xpath("//label[text()='512 GB [add $300.00]']")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//span[text()='Order Now']")));
		//driver.findElement(By.xpath("//span[text()='Order Now']")).click();
		String reqNum = driver.findElement(By.xpath("//a[@id='requesturl']/b")).getText();
		System.out.println("Request num:"+reqNum);
		File snapShot= driver.getScreenshotAs(OutputType.FILE);
        File location=new File("./snap/shot2.png");
        FileUtils.copyFile(snapShot, location);
		
		
		
	}

}
