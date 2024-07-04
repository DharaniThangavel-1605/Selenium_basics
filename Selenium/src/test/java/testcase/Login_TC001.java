package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class Login_TC001 extends BaseClass{

	
	@Test
public void logindata() {
	
		//m1
//	LoginPage lp=new LoginPage();
//	lp.enterUserName()
//	.enterPassword()
//	.clickLoginButton();
	
	//m2
		System.out.println(driver+" :login_tc001");

		//step3-pass that value inside method
	new LoginPage(driver).enterUserName("DemoCSR")
	.enterPassword("crmsfa").clickLoginButton();
}


}
