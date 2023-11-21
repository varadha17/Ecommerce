package sauce.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class productScreen_addToCartComponent extends baseComponent{
	
	@FindBy(xpath="//*[@class='shopping_cart_link']") private WebElement shoppingCart;
	
	public productScreen_addToCartComponent() {
		super();
	}

	@Override
	public boolean isElementDisplayed() {
		wait.until(ExpectedConditions.visibilityOf(shoppingCart));
		return shoppingCart.isDisplayed();
	}
	
	public void goToShoppingCartPage() {
		shoppingCart.click();
	}	

}
