package PageTest;

import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.annotations.Test;
import Utility.commonMethods;
import hooksTest.Hooks;


public class LoginPageTest extends Hooks{
	
	
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
	


}
