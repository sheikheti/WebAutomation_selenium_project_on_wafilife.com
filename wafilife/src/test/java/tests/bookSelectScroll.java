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
import pages.bookSelectAndScroll;
import pages.homePage;
import utilities.ExtentFactory;

public class bookSelectScroll extends BaseDriver {
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;

	@BeforeClass
	public void startUrl() {
		
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>Book Select Scroll process</b></p>")
						.assignAuthor("QA TEAM").assignDevice("Windows"); 
		 PageDriver.getCurrentDriver().get(baseUrl);
		 PageDriver.getCurrentDriver().manage().window().maximize();
	}
	
	@Test
	public void bookOrder() throws IOException {
		
		 childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>book Select Scroll </b></p>");
		 bookSelectAndScroll bookselectAndscroll = new bookSelectAndScroll(childTest);
		 //bookselectAndscroll.clickmenubook();
		 bookselectAndscroll.click_lekhok();
		 bookselectAndscroll.paginate();
		 
     	 bookselectAndscroll.clickmenubook();
		 bookselectAndscroll.divForKonnaSontan();
		 bookselectAndscroll.honors();
		 bookselectAndscroll.DivForHishabBiggan();


		 		 
		 
//		 createAnAccount createAnAccount = new createAnAccount();
//		 createAnAccount.fillPersonalInformation();
//		 createAnAccount.yourAdress();
		 
		 
	}
	
	@AfterClass
	public void afterClass() {
		report.flush();
	}

}
