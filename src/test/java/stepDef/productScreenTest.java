package stepDef;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import sauce.base.driverFactory;
import sauce.pages.productPage;

public class productScreenTest extends driverFactory{
	
	public productPage product = new productPage();
	
	@Then("Validate product page shows add to cart button")
	public void validate_product_page_shows_add_to_cart_button() {
	    Assert.assertEquals(product.getProduct().isElementDisplayed(), true);
	}
	
	@Then("find the product with minimum price and add to cart")
	public void find_the_product_with_minimum_price_and_add_to_cart() {
		product.getProduct().getitemPrice();
	}
	
	@Then("validate product page shows shoppingCart button")
	public void validate_product_page_shows_shopping_cart_button() {
		Assert.assertEquals(product.getShoppingCart().isElementDisplayed(), true);
	}
	@Then("Click shopping cart button")
	public void click_shopping_cart_button() {
		product.getShoppingCart().goToShoppingCartPage();
		Assert.assertEquals(getDriver().getCurrentUrl(),"https://www.saucedemo.com/cart.html");
	}
	//Scenario 2
	@Then("click on menu button")
	public void click_on_menu_button() {
	   Assert.assertEquals(product.getMenu().isElementDisplayed(), true); 
	   product.getMenu().clickMenuButton();
	}	
	@Then("select about menu")
	public void select_about_menu() {
	    product.getMenu().sideBar_About();
	    Assert.assertEquals(getDriver().getCurrentUrl(), "https://saucelabs.com/");
	}
	@Then("return back to product page")
	public void return_back_to_product_page(){
	    getDriver().navigate().back();
	    Assert.assertEquals(getDriver().getCurrentUrl(), "https://www.saucedemo.com/inventory.htm");
	}

}
