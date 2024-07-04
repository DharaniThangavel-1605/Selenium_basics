package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ExcelwithTC;



public class BaseClass {
	
	
	//static -common reference to all -seq execution
		//public static ChromeDriver driver;
	
	//parallel execution
	public ChromeDriver driver;
	
	//step3-excel prgm
		 public String filedata;
		 
		@BeforeMethod
		public void preCondition() {
			 driver  = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			}
		
		
		
		@AfterMethod
		public void postCondition() {
			driver.close();
		}
		
	
		//step4-excel prgm
				@DataProvider(name="getName")
				public String[][] fetchdata() throws IOException{
					String[][] excelData = ExcelwithTC.excelData(filedata);
					return excelData;
					
				}


}
