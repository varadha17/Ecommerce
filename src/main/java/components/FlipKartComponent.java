package components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlipKartComponent{
	
	@FindBy(xpath="//span[text()='Login']") private WebElement loginBtn;
	@FindBy(css="._2IX_2-.VJZDxU") private WebElement user;
	@FindBy(css="._2IX_2-._3umUoc.VJZDxU") private WebElement getUserValue;
	
	public FlipKartComponent() {
		super();
	}
	
	public void clickLoginButton() { loginBtn.click();}
	public void setUsername(String userName) {user.sendKeys(userName);}
	public String getUserName() { return getUserValue.getAttribute("value");}
	
	

	
}
