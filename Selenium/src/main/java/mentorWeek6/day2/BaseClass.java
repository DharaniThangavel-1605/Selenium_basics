package mentorWeek6.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	
		public RemoteWebDriver driver;
		//step3 -give input args as gobaly
		public String filedata;
		
		@Parameters({"url","username","pass","browser"})
		
		@BeforeMethod
		public void preCondition(String url,String uname,String pword,String browser) {
			if(browser.equalsIgnoreCase("chrome")) {
				driver  = new ChromeDriver();
			}else if(browser.equalsIgnoreCase("edge")) {
				driver=new EdgeDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.id("username")).sendKeys(uname);
			driver.findElement(By.id("password")).sendKeys(pword);
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
		}
		
		@AfterMethod
		public void postCondition() {
			driver.close();
		}
		
		//step1 -move data provider to case
		@DataProvider(name="getName",indices= {1})
		public String[][] fetchdata() throws IOException{
			//step4-pass the variable name in dataprovider
			String[][] excelData = ExcelwithTC.excelData(filedata);
			return excelData;
			
		}


}
