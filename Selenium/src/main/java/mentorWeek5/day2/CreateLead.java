package mentorWeek5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import addExcel.BaseClass;

public class CreateLead extends BaseClass {

	@DataProvider(name="getName")
	public String[][] fetchdata(){
		//3-set data  4-value
		String[][] data=new String[3][4];
		
		data[0][0]="TestLeaf";
		data[0][1]="Gokul";
		data[0][2]="S";
		data[0][3]="98";
		
		data[1][0]="TestLeaf";
		data[1][1]="Vinoth";
		data[1][2]="S";
		data[1][3]="99";
		
		data[2][0]="TestLeaf";
		data[2][1]="Dilip";
		data[2][2]="V R";
		data[2][3]="97";
		
		return data;
		
	}
	
	
	
	@Test(dataProvider = "getName")
	public  void runCreateLead(String cName,String fName,String lName,String ph) {

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(ph);
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
