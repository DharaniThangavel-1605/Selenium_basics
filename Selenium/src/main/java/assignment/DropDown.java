package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[contains(@class,'deco')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dharani");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thangavel");
		WebElement selec = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select source=new Select(selec);
		source.selectByIndex(4);
		Select market=new Select(driver.findElement(By.id("createLeadForm_marketingCampaignId")));
		market.selectByVisibleText("Automobile");
		Select owner=new Select(driver.findElement(By.id("createLeadForm_ownershipEnumId")));
		owner.selectByValue("OWN_CCORP");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}
}
