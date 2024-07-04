package mentorWeek6.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {

	/*
	 * //indices index value start from '0'
	 * 
	 * @DataProvider(name="getName",indices= {1,2}) 
	 * public String[][] fetchdata() throws IOException{
	 * //static-without creating object i can use that method
	 * //classname.methodname();
	 * 
	 * //step5 String[][] excelData = ExcelwithTC.excelData(); return excelData;
	 * 
	 * }
	 */
	
	//step5-
	
	@BeforeTest
	public void setData() {
		
		filedata="Createlead1";
		
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
		if (text.contains("TestLeaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		


	}

	
}
