package mentorWeek2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		Thread.sleep(3000);
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    Thread.sleep(3000);
	    
	    driver.findElement(By.className("decorativeSubmit")).click();
	    
	    //wait -java wait
	    Thread.sleep(3000);
	    
	    //linktext -it have <a> with Hf link and text
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    Thread.sleep(3000);

	    driver.close();
	}

}
