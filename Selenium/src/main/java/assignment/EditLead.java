package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//p/input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//p/input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//p/input[@value='Login']")).click();
		driver.findElement(By.xpath("//div/a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//td/input[@name='companyName']")).sendKeys("Test Leaf");
		driver.findElement(By.xpath("//td/input[@name='firstName']")).sendKeys("Dharani");
		driver.findElement(By.xpath("//td/input[@name='lastName']")).sendKeys("Thangavel");
		driver.findElement(By.xpath("//td/input[@name='firstNameLocal']")).sendKeys("Dharu");
		driver.findElement(By.xpath("//td/input[@name='departmentName']")).sendKeys("Dharu");
	}

}
