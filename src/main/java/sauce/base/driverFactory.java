package sauce.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driverFactory {
	
	protected static ThreadLocal<WebDriver> tdriver = new ThreadLocal<>();
	
	public static synchronized WebDriver getDriver() {
		return tdriver.get();	
	}
	
	public static WebDriver init_browser(String browser) {
		switch(browser.toLowerCase()) {
			case "chrome":
				tdriver.set(new ChromeDriver());
				break;
			case "firefox":
				tdriver.set(new FirefoxDriver());
				break;
			default:
				throw new IllegalStateException("No Browser Found:: "+browser);
		}
		
		getDriver().manage().window().maximize();
		getDriver().get("https://www.saucedemo.com/");
		
		return getDriver();
	}

}
