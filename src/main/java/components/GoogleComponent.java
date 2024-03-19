package components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleComponent {
	
	@FindBy(id="APjFqb") WebElement searchBox;
	
	public GoogleComponent() {
		super();
	}
	
	public void setText(String text) { searchBox.sendKeys(text); }

}
