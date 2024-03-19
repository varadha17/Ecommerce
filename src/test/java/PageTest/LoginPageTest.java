package PageTest;

import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.AmazonPage;
import Pages.FlipKartPage;
import Pages.GooglePage;
import Utility.commonMethods;
import base.driverFactory;


public class LoginPageTest extends driverFactory{
	
	public AmazonPage amazonpage;
	public FlipKartPage flipkartpage;
	public GooglePage googlePage;

	@BeforeMethod
	public void setUp() {
		init_browser("chrome");
		amazonpage = new AmazonPage();
		flipkartpage = new FlipKartPage();
		googlePage = new GooglePage();
	}
	
	@Test
	public void user() {
		setURL("https://www.amazon.in/");
		amazonpage.getLoginComponent().clickSignInButton();
		amazonpage.getLoginComponent().setUsername("varadharajan");
		getDriver().switchTo().newWindow(WindowType.TAB);
	    setURL("https://www.flipkart.com/");
	    flipkartpage.getflipkartComponent().clickLoginButton();
	    flipkartpage.getflipkartComponent().setUsername("rajan");
	    getDriver().switchTo().newWindow(WindowType.TAB);
	    setURL("https://www.google.com/");
	    googlePage.getGoogleComponent().setText("shoes");
	    String getTitleFlipkart="Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com";
	    if(commonMethods.windowhandle(getTitleFlipkart)) {
	    	Assert.assertEquals("rajan",flipkartpage.getflipkartComponent().getUserName());
	    }
	    
	    if(commonMethods.windowhandle("Amazon Sign In")) {
	    	Assert.assertEquals("varadharajan",amazonpage.getLoginComponent().getUserName());
	    	
	    }
	}
	
	@AfterMethod
	public void tearDwon() {
		getDriver().quit();
	}


}
