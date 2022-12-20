package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

public class bookSelectAndScroll extends commonMethods {
	
	ExtentTest test;
	
	public bookSelectAndScroll (ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	//.............. Locations....................
	
    @FindAll({
		
	@FindBy(xpath = "//*[@id=\"menu-main-menu-1\"]/li[2]/a"),
	
    })
    WebElement clickmenubook;
	
	
    @FindAll({
    	
   	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/nav[1]/ul[1]/li[9]/a[1]"),
    	
         })
        WebElement paginate;
	
	@FindAll({
			@FindBy(xpath="//*[@id=\"post-23109\"]/div/div/div[1]/div[2]/div[3]/ul/li[5]"),
			
    })
		WebElement divForKonnaSontan;
	  
	@FindAll({
		@FindBy(xpath= "//div[@id='product_cat_str:হিসাববিজ্ঞান বিভাগ: অনার্স']"),
	
	})
	WebElement DivForHishabBiggan ;
	
	
	@FindAll({
		@FindBy(xpath= "//*[@id=\"wpsolr_section_facets\"]/ul/ul/li[4]"),
	
	})
	WebElement honors ;
	
	
	@FindAll({
		  @FindBy(xpath ="//*[@id=\"popmake-525186\"]/button"),
		
		  })
	     WebElement opnePopUpCross;
	
	@FindAll({
		@FindBy(xpath= "//*[@id=\"menu-main-menu-1\"]/li[6]"),
	
	})
	WebElement click_lekhok ;
	
	
	@FindAll({
		@FindBy(xpath= "//*[@id=\"main_content\"]/div/div/div[3]"),
		//@FindBy(xpath= "//*[@id=\"main_content\"]/div/div/div[3]/nav/ul"),
		
	
	})
	WebElement scroll_Paginate ;
	
	@FindAll({
		@FindBy(xpath= "/html/body/div[2]/a"),
	
	})
	WebElement clickCardIcon ;
	
	@FindAll({
		@FindBy(xpath= "/html/body/div[2]/div/div/p[2]/a[2]"),
	
	})
	WebElement orderNowDetails ;
	
	
    // ........... Methods.....................
	
	
	//..............clickmenubook............
	
	 public void clickmenubook() throws IOException {
		
	
		   try {
				test.info(" Click Menu Book");
				if (clickmenubook.isDisplayed()) {
					clickmenubook.click();
					
					test.pass("<p style=\"color:green; font-size:13px\"><b> Menu Book Clickted.</b></p>");
					timeOut(5000);
					@SuppressWarnings("unused")
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "clickmenubookPass");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickmenubookPass.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>Click Menu Book Not locateable</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "clickmenubookFail");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clickmenubookFail.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(clickmenubook.isDisplayed());
				PageDriver.getCurrentDriver().quit();
				
			}
		   
		   timeOut(2000);
		   
		
		}
	
	 
	//..............divForKonnaSontan............
		
		 public void divForKonnaSontan() throws IOException {
			
			
			   try {
					test.info(" divForKonnaSontan");
					if (divForKonnaSontan.isDisplayed()) {
						
						Actions action = new Actions(PageDriver.getCurrentDriver());
						action.scrollToElement(divForKonnaSontan).perform();
						//divForKonnaSontan.click();
						timeOut(5000);
						test.pass("<p style=\"color:green; font-size:13px\"><b> div For KonnaSontan Clickted.</b></p>");
						timeOut();
						@SuppressWarnings("unused")
						String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "divForKonnaSontanPass");
						String dest = System.getProperty("user.dir") + "\\screenshots\\" + "divForKonnaSontanPass.png";
						test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					}
				} catch (Exception e) {
					test.fail("<p style=\"color:red; font-size:13px\"><b>div For KonnaSontan Not locateable</b></p>");
					Throwable t = new InterruptedException("Exception");
					test.fail(t);
					@SuppressWarnings("unused")
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "divForKonnaSontanFail");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "divForKonnaSontanFail.png";
					test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					Assert.assertTrue(divForKonnaSontan.isDisplayed());
					PageDriver.getCurrentDriver().quit();
					
				}
			   
			   timeOut(5000);
               }
		 
		 
		//..............honors............
			
		 public void honors() throws IOException {
			
			
			   try {
					test.info(" honors");
					if (honors.isDisplayed()) {
						
						Actions action = new Actions(PageDriver.getCurrentDriver());
						action.scrollToElement(DivForHishabBiggan).perform();
						//divForVugolBivag.click();
						timeOut(5000);
						test.pass("<p style=\"color:green; font-size:13px\"><b>honors Scrolled.</b></p>");
						timeOut(5000);
						@SuppressWarnings("unused")
						String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "honorsPass");
						String dest = System.getProperty("user.dir") + "\\screenshots\\" + "honorsPass.png";
						test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					}
				} catch (Exception e) {
					test.fail("<p style=\"color:red; font-size:13px\"><b>honors Not locateable</b></p>");
					Throwable t = new InterruptedException("Exception");
					test.fail(t);
					@SuppressWarnings("unused")
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "honorsFail");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "honorsFail.png";
					test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					Assert.assertTrue(honors.isDisplayed());
					PageDriver.getCurrentDriver().quit();
					
				}
			   
			   timeOut(4000);
               }
		 
		 
			//..............DivForHishabBiggan............
			
		 public void DivForHishabBiggan() throws IOException {
			
			
			   try {
					test.info(" DivForHishabBiggan");
					if (DivForHishabBiggan.isDisplayed()) {
						
						DivForHishabBiggan.click();
						timeOut(4000);
						test.pass("<p style=\"color:green; font-size:13px\"><b> Div For SishabBiggan Clickted.</b></p>");
						timeOut(3000);
						scrollPageUp() ;
						@SuppressWarnings("unused")
						String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "DivForSishabBigganPass");
						String dest = System.getProperty("user.dir") + "\\screenshots\\" + "DivForSishabBigganPass.png";
						test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					}
				} catch (Exception e) {
					test.fail("<p style=\"color:red; font-size:13px\"><b>Div For SishabBiggan Not locateable</b></p>");
					Throwable t = new InterruptedException("Exception");
					test.fail(t);
					@SuppressWarnings("unused")
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "DivForSishabBigganFail");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "DivForSishabBigganFail.png";
					test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					Assert.assertTrue(DivForHishabBiggan.isDisplayed());
					PageDriver.getCurrentDriver().quit();
					
				}
			   
			   timeOut(5000);
               }
		 
		//..............click_lekhok............
		 
		 public void click_lekhok() throws IOException {
				
                 try {
					test.info(" click_lekhok");
					if (click_lekhok.isDisplayed()) {

						click_lekhok.click();
						timeOut(3000);
                        test.pass("<p style=\"color:green; font-size:13px\"><b> lekhok Clickted.</b></p>");
                      
						@SuppressWarnings("unused")
						String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "clicklekhokPass");
						String dest = System.getProperty("user.dir") + "\\screenshots\\" + "clicklekhokPass.png";
						test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					}
				} catch (Exception e) {
					test.fail("<p style=\"color:red; font-size:13px\"><b>click_lekhok Not locateable</b></p>");
					Throwable t = new InterruptedException("Exception");
					test.fail(t);
					@SuppressWarnings("unused")
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "click_lekhokFail");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "click_lekhokFail.png";
					test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
					Assert.assertTrue(click_lekhok.isDisplayed());
					PageDriver.getCurrentDriver().quit();
					
				}
			   
			   timeOut(4000);
			   
             }
		  
 //................paginate..................
	 
	 public void paginate() throws IOException {
				 
		   try {
				test.info("Click Next Page");
				
				if (paginate.isDisplayed()) {
					scrollToElement( paginate);
//					Actions action = new Actions(PageDriver.getCurrentDriver());
//					action.scrollToElement(paginate).perform();
					timeOut(2000);
					paginate.click();
					timeOut(4000);
					test.pass("<p style=\"color:green; font-size:13px\"><b>Next Page clicked.</b></p>");
					
					@SuppressWarnings("unused")
					String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "paginatePass");
					String dest = System.getProperty("user.dir") + "\\screenshots\\" + "paginatePass.png";
					test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				}
			} catch (Exception e) {
				test.fail("<p style=\"color:red; font-size:13px\"><b>Next Page Location  Not locateable</b></p>");
				Throwable t = new InterruptedException("Exception");
				test.fail(t);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "paginateFail");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "paginateFail.png";
				test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
				Assert.assertTrue(paginate.isDisplayed());
				PageDriver.getCurrentDriver().quit();
				
			}
		   
		   timeOut(2000);
		   

	 }
}
	 
	
		 
	


