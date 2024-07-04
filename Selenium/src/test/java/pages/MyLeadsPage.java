package pages;

import org.openqa.selenium.By;

import base.BaseClass;

public class MyLeadsPage extends BaseClass {
	
	public MyLeadsPage clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
return this;
	}
	
	
	public MyLeadsPage clickFindLeads() {
		driver.findElement(By.linkText("Find Leads")).click();

		return this;
	}
	
	
	public MyLeadsPage clickMergeLead() {
		driver.findElement(By.linkText("Merge Leads")).click();

		return this;
	}
	
public MyLeadsPage clickCreateAccount() {
	
	driver.findElement(By.linkText("Create Account")).click();

	return this;
}
}
