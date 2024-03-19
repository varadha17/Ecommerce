package stepDef;

import org.openqa.selenium.WindowType;
import org.testng.Assert;

import Pages.AmazonPage;
import Pages.FlipKartPage;
import Pages.GooglePage;
import Utility.commonMethods;
import base.driverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginPageTest extends driverFactory{
	
	public AmazonPage amazonpage = new AmazonPage();
	public FlipKartPage flipkartpage = new FlipKartPage();
	public GooglePage googlePage = new GooglePage();
	
	
	@Given("user landed into amazon website and clicks signIn")
	public void user_landed_into_amazon_website_and_clicks_sign_in() {
		setURL("https://www.amazon.in/");
		amazonpage.getLoginComponent().clickSignInButton();
	}
	@Then("user enters username for amazon")
	public void enter_username() {
		amazonpage.getLoginComponent().setUsername("varadharajan");
	}
	
	@Then("user opens new tab and navigate to flipkart website and clicks signIn")
	public void user_opens_new_tab_and_navigate_to_flipkart_website_and_clicks_sign_in() {
	    getDriver().switchTo().newWindow(WindowType.TAB);
	    setURL("https://www.flipkart.com/");
	    flipkartpage.getflipkartComponent().clickLoginButton();
	}
	@Then("user enters username for flipkart")
	public void user_enters_username_for_flipkart() {
		flipkartpage.getflipkartComponent().setUsername("rajan");
	}
	@Then("user opens new tab and navigate to google website")
	public void user_opens_new_tab_and_navigate_to_google_website() {
		getDriver().switchTo().newWindow(WindowType.TAB);
	    setURL("https://www.google.com/");
	}
	@Then("user enters text in search box")
	public void enters_text_in_search_box() {
		googlePage.getGoogleComponent().setText("shoes");
	}
	@Then("user validates username for flipkart tab")
	public void user_validates_username_in_each_tab() {
		String getTitleFlipkart="Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com";
	    if(commonMethods.windowhandle(getTitleFlipkart)) {
	    	Assert.assertEquals("rajan",flipkartpage.getflipkartComponent().getUserName());
	    }
	    
	    if(commonMethods.windowhandle("Amazon Sign In")) {
	    	Assert.assertEquals("varadharajan",amazonpage.getLoginComponent().getUserName());
	    	
	    }
	}


}
