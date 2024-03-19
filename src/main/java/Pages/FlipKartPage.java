package Pages;

import org.openqa.selenium.support.PageFactory;

import base.driverFactory;
import components.FlipKartComponent;

public class FlipKartPage extends driverFactory{
	
	private FlipKartComponent flipkart;

	public FlipKartPage() {
		super();
		this.flipkart = PageFactory.initElements(getDriver(), FlipKartComponent.class);
	}

	public FlipKartComponent getflipkartComponent() {
		return flipkart;
	}
	
	

}
