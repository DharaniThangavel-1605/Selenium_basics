package testNgDataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
	
	@DataProvider(name="getName")
	public String[][] fetchData()
	{
		String data[][]=new String[2][4];	
		data[0][0]="TestLeaf";
		data[0][1]="Dilip";
		data[0][2]="DK";
		data[0][3]="99";	
		
		data[1][0]="TestLeaf";
		data[1][1]="Gokul";
		data[1][2]="S";
		data[1][3]="98";	
		return data;	
	}

	@Test(dataProvider="getName")
	public void runCreateLead(String cname,String fname,String lname,String pn) {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pn);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
	}

}
