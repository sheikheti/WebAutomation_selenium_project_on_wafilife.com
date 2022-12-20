package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import Drivers.PageDriver;
import utilities.GetScreenShot;
import utilities.commonMethods;

public class addressAndinfo extends commonMethods {
	
	ExtentTest test;
	
	public addressAndinfo(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	
	@FindAll({
		
		@FindBy(xpath="//input[@id='billing_first_name']"),
		
	})
	WebElement billing_first_name;
	
	@FindAll({
		@FindBy(xpath="//input[@id='billing_phone']"),
		
	})
	WebElement billing_phone;
	
	
	@FindAll({
		@FindBy(xpath="//input[@id='billing_email']"),
		
	})
	WebElement billing_email;
	
	@FindAll({
		@FindBy(xpath="//select[@id='billing_state']"),
		
	})
	WebElement clickDropdown;
	
	@FindAll({
		@FindBy(xpath="//select[@id='billing_area']"),
		
	})
	WebElement billing_area;
	
	
	@FindAll({
		
		//@FindBy(xpath = "//div[@id='uniform-days']"),
		@FindBy(xpath = "//*[@id=\"billing_area\"]/option[88]"),
		
    })
	WebElement billing_area_select;
	
	@FindAll({
		
		@FindBy(xpath = "//textarea[@id='billing_address_1']"),
		
    })
	WebElement billing_address_1;
	
	
	@FindAll({
		
		@FindBy(xpath = "//textarea[@id='order_comments']"),
	
     })
	WebElement order_comments;
	
	@FindAll({
		
		@FindBy(xpath = "//*[@id=\"shipping_method\"]/li[2]/label"),
		
    })
	WebElement shipping_method;
	
	
	@FindAll({
		
		@FindBy(xpath = "//*[@id=\"payment\"]/ul/li[2]"),
		
	})
	WebElement payment;
	

	

	
	

	
	
	//...................methods.........................
	
	public void fillUpInformation() throws IOException {
	
	
	   //...........billing_first_name.................
	   try {
			test.info(" Enter Billing first Name");
			if (billing_first_name.isDisplayed()) {
				sendText( billing_first_name, firstNameGenerate());
				test.pass("<p style=\"color:green; font-size:13px\"><b>Billing first Name Entered.</b></p>");
				timeOut(2000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "billingfirstnamePass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "billingfirstnamePass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
			
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Billing First Name Not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "billingfirstnameFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "billingfirstnameFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(billing_first_name.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	   
	   
	 
	   
		
	   //.............billing_phone.............
	   try {
			test.info("Enter Billing Phone Number ");
			if (billing_phone.isDisplayed()) {
				sendText(billing_phone, phoneNumberGenerate());
				test.pass("<p style=\"color:green; font-size:13px\"><b>Billing Phone Entered.</b></p>");
				timeOut(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "billingphonePass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "billingphonePass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Billing Phone Number Not locateable</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "billingphoneNumberFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "billingphoneNumberFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(billing_phone.isDisplayed());
			PageDriver.getCurrentDriver().quit();
			
		}
	   
	   //.............billing_email.......................
	   try {
			test.info("Enter Billing Email ");
			if (billing_email.isDisplayed()) {
				sendText(billing_email, emailGenerate());
				test.pass("<p style=\"color:green; font-size:13px\"><b>Billing Email Entered.</b></p>");
				timeOut();
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "BillingEmailPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "BillingEmailPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Billing Email not locateable</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "BillingEmailFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "BillingEmailFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(billing_email.isDisplayed());
			PageDriver.getCurrentDriver().quit();
			
		}
	   //..............clickDropdown.............
	   try {
			test.info("click Dropdown and area select ");
			if (clickDropdown.isDisplayed()) {
				selectItemByIndex(clickDropdown, 5);
				test.pass("<p style=\"color:green; font-size:13px\"><b>Click Dropdown And Area Selected.</b></p>");
				timeOut();
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "clickDropdownPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickDropdownPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Click Dropdown Not locateable</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "clickDropdownFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickDropdownFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(clickDropdown.isDisplayed());
			PageDriver.getCurrentDriver().quit();
			
		}
	   
	   
	   //................billing_area_select...................
	   try {
			test.info(" Select Billing Area  ");
			if (billing_area.isDisplayed()) {
				//billing_area.click();
				selectItemByIndex(billing_area, 6);
				test.pass("<p style=\"color:green; font-size:13px\"><b>Billing Area Selected.</b></p>");
				timeOut();
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "billingareaPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "billingareaPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Billing Area Not locateable</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "billing_areaFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "billing_areaFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(billing_area.isDisplayed());
			PageDriver.getCurrentDriver().quit();
			
		}
	   
	   timeOut(2000);
	   
	  
	  
	   //................billing_address_1...................
	   
	   try {
			test.info("Enter Billing Address_1 ");
			if ( billing_address_1.isDisplayed()) {
			
				sendText(billing_address_1, "dhaka ,mirpur ");
				

				test.pass("<p style=\"color:green; font-size:13px\"><b> Billing Address_1  Entered.</b></p>");
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "billing_address_1Pass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "billing_address_1Pass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Billing Address_1 not locateable</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "billing_address_1Fail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "billing_address_1Fail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue( billing_address_1.isDisplayed());
			PageDriver.getCurrentDriver().quit();
			
		}
	  
	   timeOut(2000);

	   //................order_comments...................
	   
	   try {
			test.info("Enter Your Order Comments ");
			if ( order_comments.isDisplayed()) {
				sendText(order_comments, "comment mirpur ");
				
//	            Select selectItems = new Select(dayforDOB);
//		        selectItems.selectByValue("4");
		    
				test.pass("<p style=\"color:green; font-size:13px\"><b> Order comments showed .</b></p>");
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "order_commentsPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "order_commentsPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Order Comments not locateable</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "order_commentsBFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "order_commentsFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue( order_comments.isDisplayed());
			PageDriver.getCurrentDriver().quit();
			
		}
	   timeOut(2000);
	   //............shipping_method...............

	 
	   
	   try {
			test.info(" Select Shipping Method ");
			if ( shipping_method.isDisplayed()) {
				shipping_method.click();
		     
				test.pass("<p style=\"color:green; font-size:13px\"><b>Shipping Method Selected.</b></p>");
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "shipping_methodPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "shipping_methodPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Shipping Method Not locateable</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "shipping_methodFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "shipping_methodFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue( shipping_method.isDisplayed());
			PageDriver.getCurrentDriver().quit();
			
		}
	   
	   timeOut(2000);
	   //............payment..............
	   try {
			test.info(" Select Payment Method");
			if (payment.isDisplayed()) {
				payment.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Payment Method Selected.</b></p>");
				timeOut();
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "paymentPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "paymentPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Payment Method not locateable</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "paymentFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "paymentFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(payment.isDisplayed());
			PageDriver.getCurrentDriver().quit();
			
		}
	   
	   timeOut(2000);
	  
//	   
//	   
//	   //............paginate..............
//	  
//	   try {
//			test.info("Click Next Page");
//			
//			if (paginate.isDisplayed()) {
//				
//				Actions action = new Actions(PageDriver.getCurrentDriver());
//				action.scrollToElement(paginate).perform();
//				paginate.click();
//				test.pass("<p style=\"color:green; font-size:13px\"><b>Next Page clicked.</b></p>");
//				timeOut(2000);
//				@SuppressWarnings("unused")
//				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "paginatePass");
//				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "paginatePass.png";
//				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
//			}
//		} catch (Exception e) {
//			test.fail("<p style=\"color:red; font-size:13px\"><b>Next Page Location  Not locateable</b></p>");
//			Throwable t = new InterruptedException("Exception");
//			test.fail(t);
//			@SuppressWarnings("unused")
//			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "paymentFail");
//			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "paymentFail.png";
//			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
//			Assert.assertTrue(paginate.isDisplayed());
//			PageDriver.getCurrentDriver().quit();
//			
//		}
//	   
//	   timeOut(2000);
	   
	}
	

	}
	
	
	
	
	
	
	
	
	


