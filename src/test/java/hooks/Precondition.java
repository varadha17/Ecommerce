package hooks;

import base.driverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Precondition extends driverFactory{
	
	@Before
	public void setUp() {
		init_browser("chrome");
	}
	
	@After
	public void tearDown() {
		getDriver().quit();
	}

}
