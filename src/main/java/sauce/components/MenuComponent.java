package sauce.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MenuComponent extends baseComponent{
	
	@FindBy(id="react-burger-menu-btn") private WebElement menuBtn;
	@FindBy(id="about_sidebar_link") private WebElement about;

	@Override
	public boolean isElementDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(menuBtn));
		return menuBtn.isDisplayed();
	}
	
	public void clickMenuButton() {
		menuBtn.click();
	}
	
	public void sideBar_About() {
		wait.until(ExpectedConditions.visibilityOf(about));
		about.click();
	}

}
