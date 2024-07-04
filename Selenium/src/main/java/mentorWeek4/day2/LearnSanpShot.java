package mentorWeek4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSanpShot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");
		
		WebElement mouseOver = driver.findElement(By.linkText("MEN"));

		//step1 -takeshapshot of the page
		//File scr = driver.getScreenshotAs(OutputType.FILE);
		
		//take particular element 
		File scr = mouseOver.getScreenshotAs(OutputType.FILE);
		
		//step 2-create folder for attched the snapshot
		File des=new File("./snaps/snap1.png");
		
		//step3-merge file
		FileUtils.copyFile(scr, des);
		

	}

}
