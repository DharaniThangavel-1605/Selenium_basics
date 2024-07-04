package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(text(),'Click')]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().to("https://leafground.com/button.xhtml");
		boolean enabled = driver.findElement(By.xpath("//span[contains(text(),'Disabled')]")).isEnabled();
		System.out.println("Disabled button:True or False:"+enabled);
		Point location = driver.findElement(By.xpath("//button[contains(@class,'ui-corner-all ui-button-text-icon-left mr-2')]/span[contains(text(),'Submit')]")).getLocation();
		System.out.println("Position of submit button:"+location);
		String bgcolor = driver.findElement(By.xpath("//span[contains(text(),'Save')]")).getCssValue("background-color");
		System.out.println("Bg color of the Save button is:"+bgcolor);
		Dimension size = driver.findElement(By.xpath("//button[contains(@class,'ui-corner-all ui-button-text-icon-right')]/span[contains(text(),'Submit')]")).getSize();
		System.out.println("Height and width of the submit button:"+size);
		//driver.close();
	}

}
