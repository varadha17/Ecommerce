package sauce.components;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import sauce.base.driverFactory;

public abstract class baseComponent extends driverFactory{
	
	public WebDriverWait wait;
	
	public baseComponent() {
		wait = new WebDriverWait(getDriver(),Duration.ofSeconds(30));
		PageFactory.initElements(getDriver(), this);
	}
	
	public abstract boolean isElementDisplayed();

}
