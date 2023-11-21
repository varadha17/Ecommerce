package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import sauce.base.driverFactory;

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
