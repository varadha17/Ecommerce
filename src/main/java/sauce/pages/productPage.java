package sauce.pages;

import org.openqa.selenium.support.PageFactory;

import sauce.base.driverFactory;
import sauce.components.MenuComponent;
import sauce.components.productScreenComponent;
import sauce.components.productScreen_addToCartComponent;

public class productPage extends driverFactory{
	
	private productScreenComponent product;
	private productScreen_addToCartComponent shoppingCart;
	private MenuComponent menu;

	public productPage() {
		super();
		this.product = PageFactory.initElements(getDriver(), productScreenComponent.class);
		this.shoppingCart = PageFactory.initElements(getDriver(), productScreen_addToCartComponent.class);
		this.menu = PageFactory.initElements(getDriver(), MenuComponent.class);
	}

	public productScreenComponent getProduct() {
		return product;
	}
	
	public productScreen_addToCartComponent getShoppingCart() {
		return shoppingCart;
	}
	
	public MenuComponent getMenu() {
		return menu;
	}

}
