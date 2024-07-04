package week7.day2;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) throws IOException {
		

		//step 1-Set path for the report
		ExtentHtmlReporter wb=new ExtentHtmlReporter("./snaps/lead.html");
		
		//to keep previous report also
		wb.setAppendExisting(true);
		
		//step 2 create object for extentreports
		ExtentReports extent=new ExtentReports();
		
		//step 3-attach the data with physical file (combine step1 & step2)
		extent.attachReporter(wb);
		
		
		//step 4-create testcase and adding details 
		ExtentTest test=extent.createTest("Loginpage", "Login with valid credential");
		test.assignAuthor("Dilip");
		test.assignCategory("regression");
		
		//step 5-step level status
		
		test.pass("enter username");
		test.pass("enter password");
		test.fail("login button");
		test.pass("Crmsfa", MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/snap.png").build());
		
		
		
		/*
		 * ExtentTest test1=extent.createTest("CreateLead",
		 * "createlead with valid data"); test1.assignAuthor("Gokul");
		 * test1.assignCategory("smoke");
		 * 
		 * 
		 * 
		 * test1.pass("enter username"); test1.pass("enter password");
		 * test1.pass("login button");
		 * 
		 * 
		 * 
		 * ExtentTest test2=extent.createTest("editlead",
		 * "Login with valid credential"); test2.assignAuthor("Vinoth");
		 * test2.assignCategory("regression");
		 * 
		 * 
		 * 
		 * test2.pass("enter username"); test2.pass("enter password");
		 * test2.fail("login button");
		 */
				
				
				
		//step6 -
		extent.flush();
		System.out.println("successful");
	}

}
