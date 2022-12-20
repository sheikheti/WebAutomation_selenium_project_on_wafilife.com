package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import Drivers.PageDriver;
import utilities.GetScreenShot;
import utilities.commonMethods;

public class homePage extends commonMethods {
	
	ExtentTest test;
	
	public homePage (ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
		
		
		//pageRefresh();
	}
	//.............. Locations....................
	
	@FindAll({
		  @FindBy(xpath ="//button[contains(text(),'X')]"),
		  
		  })
	     WebElement opnePopUpCross;
	
	
	@FindAll({
			  @FindBy(xpath ="//*[@id=\"menu-main-menu-1\"]/li[5]/a"),
			  //@FindBy(xpath ="//*[@id=\"menu-main-menu-1\"]/li[5]/a"),
			
			 })
		     WebElement clickAuthor;
	
	@FindAll({
			@FindBy(xpath="//*[@id=\"main_content\"]/div/div/ul/li[1]/a[2]"),
			
    })
		WebElement selectBookWritter;
	  
	@FindAll({
		@FindBy(xpath= "//a[contains(text(),'Medi English (For Medical And Admission Test)')]"),
	
	})
	WebElement ViewBookDetails ;
	
	
	@FindAll({
		@FindBy(xpath= "//*[@id=\"product-202348\"]/div[2]/form/div[2]/button[3]"),
	
	})
	WebElement readMore ;
	
	
	@FindAll({
		@FindBy(xpath= "//body/div[@id='myModal']/a[1]/i[1]"),
	
	})
	WebElement readMoreCross ;
	
	@FindAll({
		@FindBy(xpath= "//*[@id=\"product-202348\"]/div[2]/form/div[2]/button[2]"),
	
	})
	WebElement OrderNow ;
	
	
	@FindAll({
		@FindBy(xpath= "//body/div[@id='extra-add-product-popup']/div[1]/div[1]/div[1]/button[1]/span[1]"),
	
	})
	WebElement popUpCross ;
	
	@FindAll({
		@FindBy(xpath= "/html/body/div[2]/a"),
	
	})
	WebElement clickCardIcon ;
	
	@FindAll({
		@FindBy(xpath= "/html/body/div[2]/div/div/p[2]/a[2]"),
	
	})
	WebElement orderNowDetails ;
	
	
    // ........... Methods.....................
	
	
	//..............clickOnMenu............
	
	 public void clickOnAuthor() throws IOException {
		
		
		 

			try {
				timeOut(3000);
				pageRefresh();
				test.info("Click on Author");
				if (clickAuthor.isDisplayed()) {
					clickAuthor.click();
					test.pass("<p style=\"color:green; font-size:13px\"><b>Author Clicked.</b></p>");
					timeOut();
					
					@SuppressWarnings("unused")
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "clickAuthorPass");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickAuthorPass.png";
					test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>clic kAuthor location not avialble.</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "clickAuthorFail");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickAuthorFail.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(clickAuthor.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
		}

	 
	 //................selectBookWritter..................
	 
	 public void selectBookWritter() throws IOException {
		
		 
		 test.info("select Book Writter");
			try {
				if (selectBookWritter.isDisplayed()) {
					selectBookWritter.click();
					test.pass("<p style=\"color:green; font-size:13px\"><b>Book Writter Selected.</b></p>");
					timeOut(2000);
					
					@SuppressWarnings("unused")
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "selectBookWritterPass");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "selectBookWritterPass.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>Book Writter not locateable</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "selectBookWritterFail");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "selectBookWritterFail.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(selectBookWritter.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
		 timeOut(3000);
	 }
	 
	 //..................ViewBookDetails................
	 
	  public void ViewBookDetails() throws IOException {
			 
			 
			 test.info("Click On View Book Details");
				try {
					if (ViewBookDetails.isDisplayed()) {
						ViewBookDetails.click();
						test.pass("<p style=\"color:green; font-size:13px\"><b>Account Button Clicked.</b></p>");
						timeOut(2000);
						@SuppressWarnings("unused")
						String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ViewBookDetailsPass");
						String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ViewBookDetailsPass.png";
						test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					}
				} catch (Exception e) {
					test.fail("<p style=\"color:red; font-size:13px\"><b>View Book Details not locateable</b></p>");
					Throwable t = new InterruptedException("Exception");
					test.fail(t);
					@SuppressWarnings("unused")
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ViewBookDetailsFail");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ViewBookDetailsFail.png";
					test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					Assert.assertTrue(ViewBookDetails.isDisplayed());
					PageDriver.getCurrentDriver().quit();
				}
			 timeOut(3000);
		 }
	  
	  //............................readMore..........................
		 
		 public void readMore() throws IOException {
			 
			 
			 test.info("Click On readMore");
				try {
					if (readMore.isDisplayed()) {
						readMore.click();
						
						test.pass("<p style=\"color:green; font-size:13px\"><b>readMore Clicked.</b></p>");
						timeOut(2000);
						@SuppressWarnings("unused")
						String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "readMorePass");
						String dest = System.getProperty("user.dir") + "\\screenshots\\" + "readMorePass.png";
						test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					}
				} catch (Exception e) {
					test.fail("<p style=\"color:red; font-size:13px\"><b>read More not locateable</b></p>");
					Throwable t = new InterruptedException("Exception");
					test.fail(t);
					@SuppressWarnings("unused")
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "readMoreFail");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "readMoreFail.png";
					test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					Assert.assertTrue(readMore.isDisplayed());
					PageDriver.getCurrentDriver().quit();
				}
			 timeOut(3000);
		 }
		 
		 //............................readMoreCross..........................
		 
		 public void readMoreCross() throws IOException {
			 
			 
			 test.info("Click On readMoreCross");
				try {
					if (readMoreCross.isDisplayed()) {
						readMoreCross.click();
						
						test.pass("<p style=\"color:green; font-size:13px\"><b>read More Cross Clicked.</b></p>");
						timeOut(2000);
						@SuppressWarnings("unused")
						String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "readMoreCrossPass");
						String dest = System.getProperty("user.dir") + "\\screenshots\\" + "readMoreCrossPass.png";
						test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					}
				} catch (Exception e) {
					test.fail("<p style=\"color:red; font-size:13px\"><b>read More Cross not locateable</b></p>");
					Throwable t = new InterruptedException("Exception");
					test.fail(t);
					@SuppressWarnings("unused")
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "readMoreCrossFail");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "readMoreCrossFail.png";
					test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					Assert.assertTrue(readMoreCross.isDisplayed());
					PageDriver.getCurrentDriver().quit();
				}
			 timeOut(2000);
		 }
	 
	  //............................OrderNow..........................
	 
	 public void OrderNow() throws IOException {
		 
		 
		 test.info("Click On Order Now");
			try {
				if (OrderNow.isDisplayed()) {
					OrderNow.click();
					
					test.pass("<p style=\"color:green; font-size:13px\"><b>Order Now Clicked.</b></p>");
					timeOut(2000);
					@SuppressWarnings("unused")
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "OrderNowPass");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "OrderNowPass.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>View Book Details not locateable</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "OrderNowFail");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "OrderNowFail.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(OrderNow.isDisplayed());
				PageDriver.getCurrentDriver().quit();
			}
		 timeOut(3000);
	 }
	 
	 
	//............................popUpCross..........................
	 
		 public void popUpCross() throws IOException {
			 
			 
			 test.info("Click On popUpCross");
				try {
					if (popUpCross.isDisplayed()) {
						
						popUpCross.click();
						test.pass("<p style=\"color:green; font-size:13px\"><b>popUpCross Clicked.</b></p>");
						timeOut(2000);
						@SuppressWarnings("unused")
						String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "popUpCrossPass");
						String dest = System.getProperty("user.dir") + "\\screenshots\\" + "popUpCrossPass.png";
						test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					}
				} catch (Exception e) {
					test.fail("<p style=\"color:red; font-size:13px\"><b>popUpCross not locateable</b></p>");
					Throwable t = new InterruptedException("Exception");
					test.fail(t);
					@SuppressWarnings("unused")
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "popUpCrossFail");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "popUpCrossFail.png";
					test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					Assert.assertTrue(popUpCross.isDisplayed());
					PageDriver.getCurrentDriver().quit();
				}
			 timeOut(3000);
		 }
		 
		 
		//............................clickCardIcon..........................
		 
		 public void clickCardIcon() throws IOException {
			 
			 
			 test.info("Click On CardIcon");
				try {
					if (clickCardIcon.isDisplayed()) {
						
						clickCardIcon.click();
						test.pass("<p style=\"color:green; font-size:13px\"><b>clickCardIcon Clicked.</b></p>");
						timeOut(2000);
						@SuppressWarnings("unused")
						String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "clickCardIconPass");
						String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickCardIconPass.png";
						test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					}
				} catch (Exception e) {
					test.fail("<p style=\"color:red; font-size:13px\"><b>clickCardIcon not locateable</b></p>");
					Throwable t = new InterruptedException("Exception");
					test.fail(t);
					@SuppressWarnings("unused")
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "clickCardIconFail");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickCardIconFail.png";
					test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					Assert.assertTrue(clickCardIcon.isDisplayed());
					PageDriver.getCurrentDriver().quit();
				}
			 timeOut(3000);
		 }
		 
		 
		//............................popUpCross..........................
		 
		 public void orderNowDetails() throws IOException {
			 
			 
			 test.info("Click On orderNowDetails");
				try {
					if (orderNowDetails.isDisplayed()) {
						
						orderNowDetails.click();
						test.pass("<p style=\"color:green; font-size:13px\"><b>orderNowDetails Clicked.</b></p>");
						timeOut(2000);
						@SuppressWarnings("unused")
						String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "orderNowDetailsPass");
						String dest = System.getProperty("user.dir") + "\\screenshots\\" + "orderNowDetailsPass.png";
						test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					}
				} catch (Exception e) {
					test.fail("<p style=\"color:red; font-size:13px\"><b>orderNowDetails not locateable</b></p>");
					Throwable t = new InterruptedException("Exception");
					test.fail(t);
					@SuppressWarnings("unused")
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "orderNowDetailsFail");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "orderNowDetailsFail.png";
					test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					Assert.assertTrue(orderNowDetails.isDisplayed());
					PageDriver.getCurrentDriver().quit();
				}
			 timeOut(4000);
		 }
	 
	 
      
	 
	
   }


