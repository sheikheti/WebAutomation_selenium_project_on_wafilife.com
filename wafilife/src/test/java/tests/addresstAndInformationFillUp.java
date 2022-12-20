package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Drivers.BaseDriver;
import Drivers.PageDriver;
import pages.addressAndinfo;
import pages.homePage;
import utilities.ExtentFactory;

public class addresstAndInformationFillUp extends BaseDriver {
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;

	@BeforeClass
	public void startUrl() {
		
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>Personal Information</b></p>")
						.assignAuthor("QA TEAM").assignDevice("Windows"); 
		// PageDriver.getCurrentDriver().get(baseUrl);
		 PageDriver.getCurrentDriver().manage().window().maximize();
	}
	
	@Test (priority = 0)
	public void information() throws IOException {
		
		 childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Fill Up Information</b></p>");
		 
 
		 addressAndinfo information = new addressAndinfo(childTest);
		 information.fillUpInformation();
		// createAnAccount.yourAdress();
		 
		 
	}
	
	@AfterClass
	public void afterClass() {
		report.flush();
	}

}
