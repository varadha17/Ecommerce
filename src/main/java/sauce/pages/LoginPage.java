package sauce.pages;

import org.openqa.selenium.support.PageFactory;

import sauce.base.driverFactory;
import sauce.components.loginComponent;

public class LoginPage extends driverFactory{
	
	private loginComponent loginComponent;

	public LoginPage() {
		super();
		this.loginComponent = PageFactory.initElements(getDriver(), loginComponent.class);
	}

	public loginComponent getLoginComponent() {
		return loginComponent;
	}
	
	
}
