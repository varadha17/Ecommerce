package components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.driverFactory;

public class AmazonComponent extends driverFactory{
	
	@FindBy(id="nav-link-accountList") WebElement clickSign;
	@FindBy(id="ap_email") WebElement userName;
	
	public AmazonComponent() {
		super();
	}
	
	public void clickSignInButton() { clickSign.click();}
	public void setUsername(String user) { userName.sendKeys(user); }
	public String getUserName() { 
		return userName.getAttribute("value");
		
	}
		

}
