package assignment;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhibus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//a[text()='Tomorrow']")).click();
		String text = driver.findElement(By.xpath("//h5[text()='Orange Tours and Travels']")).getText();
		System.out.println("Name of the bus:"+text);
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		driver.findElement(By.xpath("//button[text()='Show Seats']")).click();
		driver.findElement(By.xpath("//span[text()='U3']")).click();
		driver.findElement(By.xpath("//p[contains(text(),'sholinganallur max')]")).click();
		driver.findElement(By.xpath("//p[contains(text(),'Hosur- OPP BUS')]")).click();
		String seat = driver.findElement(By.xpath("(//span[@class='text-primary'])[1]")).getText();
		String fare = driver.findElement(By.xpath("(//span[@class='text-primary'])[2]")).getText();
		System.out.println("Seat selected:"+seat+"\n"+"Bus fare:"+fare);
		String title = driver.getTitle();
		System.out.println("Title of the page:"+title);
		//driver.close();
	}

}
