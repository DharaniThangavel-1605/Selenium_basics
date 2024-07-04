package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class Leads_TC002 extends BaseClass{

	//step 7- excel prgm
	@BeforeTest
	public void setdata() {
		//this will go excel prg and pass excel file name(./data/Login.xlsx)
		filedata="Login";
	}
	
	
	//step5 -excel prgm
	@Test(dataProvider = "getName")
	//step 6-excel prgm
	public void leads(String uname,String pwd) {
		
		
		LoginPage lp = new LoginPage(driver);
		System.out.println(driver +" :leads_tc002");
		lp.enterUserName(uname)
		.enterPassword(pwd).clickLoginButton()
		.clickLogout();
		
		
		//.clickOnCrmsfa()
		//.clickAccounts().clickCreateAccount();
		
		//clickMyLeads().clickCreateLead();
	}
	
}
