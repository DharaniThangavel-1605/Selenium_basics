package selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.irctc.co.in/");
		driver.findElement(By.xpath("//li[@id='flight']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> allLink =new ArrayList<String>(windowHandles);
		driver.switchTo().window(allLink.get(1));
		System.out.println(windowHandles +" :"+ driver.getTitle());
		driver.switchTo().window(allLink.get(0));
		driver.close();
	}

}
