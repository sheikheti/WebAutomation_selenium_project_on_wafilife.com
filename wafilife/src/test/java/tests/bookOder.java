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

public class bookOder extends BaseDriver {
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;

	@BeforeClass
	public void startUrl() {
		
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>Book order</b></p>")
						.assignAuthor("QA TEAM").assignDevice("Windows"); 
		 PageDriver.getCurrentDriver().get(baseUrl);
		 PageDriver.getCurrentDriver().manage().window().maximize();
		 
	}
	
	@Test
	public void bookOrder() throws IOException {
		
		 childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Book order process</b></p>");
		 homePage homepage = new homePage(childTest);
	     homepage.clickOnAuthor();
	     homepage.selectBookWritter();
		 homepage.ViewBookDetails();
		 homepage.readMore();
		 homepage.readMoreCross();
		 homepage.OrderNow();
		 homepage.popUpCross();
		 homepage.clickCardIcon();
		 homepage.orderNowDetails();
		 
		 
		 
		 
		 
//		 createAnAccount createAnAccount = new createAnAccount();
//		 createAnAccount.fillPersonalInformation();
//		 createAnAccount.yourAdress();
		 
		 
	}
	
	@AfterClass
	public void afterClass() {
		report.flush();
	}

}
