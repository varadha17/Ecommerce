package hooksTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Pages.AmazonPage;
import Pages.FlipKartPage;
import Pages.GooglePage;
import base.driverFactory;

public class Hooks extends driverFactory{
	
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
	
	@AfterMethod
	public void tearDwon() {
		getDriver().quit();
	}

}
