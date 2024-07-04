package mentorWeek4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.leafground.com/window.xhtml");
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		//get current window/tab id 
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow +" "+driver.getTitle());
	
	
	//methods:
		Set<String> windowHandles = driver.getWindowHandles();
	System.out.println(windowHandles +" :"+ driver.getTitle());
	
	//convert set into list
	//to access any particular windows
	
	List<String> allLink =new ArrayList<String>(windowHandles);
	
	//index -'0'
	//0-parent window value
	//1-child window value
	driver.switchTo().window(allLink.get(1));
	
	driver.findElement(By.id("email")).sendKeys("dilip@testleaf.com");
	
	//close-child window
	driver.close();

	//get control to parent window
	driver.switchTo().window(allLink.get(0));

	driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
	
	//i cannot reuse the old getwindowhandles
	
	Set<String> windowHandles2 = driver.getWindowHandles();
	System.out.println(windowHandles2);
	
	//0-parent window
	//1-1st child window
	//2-2nd child window 
	
	//convert set into list
	//driver.switchTo().window(all.get(2));
	
	//quit-its close all opened window/tab
	driver.quit();
	
	}

}
