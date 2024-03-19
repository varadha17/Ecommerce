package Pages;

import org.openqa.selenium.support.PageFactory;

import base.driverFactory;
import components.GoogleComponent;

public class GooglePage extends driverFactory{
	
	private GoogleComponent google;

	public GooglePage() {
		super();
		this.google = PageFactory.initElements(getDriver(), GoogleComponent.class);
	}

	public GoogleComponent getGoogleComponent() {
		return google;
	}

}
