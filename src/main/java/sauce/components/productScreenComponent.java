package sauce.components;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class productScreenComponent extends baseComponent{

	@FindBy(id="add-to-cart-sauce-labs-backpack") private WebElement addToCart;
	@FindBy(xpath="//div[@class='inventory_item_price']") private List<WebElement> itemPrice;
	
	@Override
	public boolean isElementDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(addToCart));
		return addToCart.isDisplayed();
	}
	
	public void getitemPrice() {
		Float min = Float.MAX_VALUE; 
		for(WebElement ele: itemPrice) {
			String price = ele.getText().replace("$", "");
			float convertPrice = Float.parseFloat(price);
			if(min>convertPrice) {
				min = convertPrice;
			}
		}
		getDriver().findElement(By.xpath("//div[text()='"+min+"']/parent::div/button")).click();
		
	}

	
	
	
}
