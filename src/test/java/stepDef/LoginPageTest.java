package stepDef;

import java.util.List;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import sauce.base.driverFactory;
import sauce.pages.LoginPage;

public class LoginPageTest extends driverFactory{
	
	public LoginPage login = new LoginPage();

	@Given("user enters valid username and valid password")
	public void user_enters_valid_username_and_valid_password(io.cucumber.datatable.DataTable dataTable) {
		Assert.assertEquals(login.getLoginComponent().isElementDisplayed(), true);
		List<List<String>> li = dataTable.asLists();
	    login.getLoginComponent().setUsername(li.get(0).get(0));
	    login.getLoginComponent().setPassword(li.get(0).get(1));
	}
	@Then("click on sigin button")
	public void click_on_sigin_button() {
	    login.getLoginComponent().clickButton();
	}
	@Then("user should be landed into products page")
	public void user_should_be_landed_into_products_page() {
	    Assert.assertEquals(getDriver().getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
	}


}
