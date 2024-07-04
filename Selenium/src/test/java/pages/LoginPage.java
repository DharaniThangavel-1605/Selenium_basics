package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class LoginPage extends BaseClass {

	
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	//step -1 create intput agrs in method
	public LoginPage enterUserName(String uname) {
		//step2- repalce hardcoded values to input agrs
		driver.findElement(By.id("username")).sendKeys(uname);

		//m1
		//LoginPage lp=new LoginPage();
		//return lp;
		
		//m2
		return this;
	}
	
	public LoginPage enterPassword(String passwd) {
		driver.findElement(By.id("password")).sendKeys(passwd);
		return this;
	}
	
	public HomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
//m1 
		//HomePage hp=new HomePage();
		//return hp;
		
		//m2- return new Nextpage -ClassName()
		return new HomePage(driver);
		
	}
	
}
