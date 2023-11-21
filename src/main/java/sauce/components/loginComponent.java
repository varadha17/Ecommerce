package sauce.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class loginComponent extends baseComponent{
	
	@FindBy(id="login-button") private WebElement button;
	@FindBy(id="user-name") private WebElement username;
	@FindBy(id="password") private WebElement password;
	
	public loginComponent() {
		super();
	}
	
	@Override
	public boolean isElementDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(button));
		return button.isDisplayed();
	}
	
	public void setUsername(String user) { username.sendKeys(user); }
	
	public void setPassword(String userPassword) { password.sendKeys(userPassword); }
	
	public void clickButton() { button.click(); }	

}
