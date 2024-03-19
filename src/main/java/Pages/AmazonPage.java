package Pages;

import org.openqa.selenium.support.PageFactory;

import base.driverFactory;
import components.AmazonComponent;

public class AmazonPage extends driverFactory{
	
	private AmazonComponent loginComponent;

	public AmazonPage() {
		super();
		this.loginComponent = PageFactory.initElements(getDriver(), AmazonComponent.class);
	}

	public AmazonComponent getLoginComponent() {
		return loginComponent;
	}
	
	
}
