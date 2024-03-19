package Utility;

import java.util.Set;


import base.driverFactory;

public class commonMethods extends driverFactory{

	public static boolean windowhandle(String title) {
		Set<String> set = getDriver().getWindowHandles();
		
		for(String window: set) {
			getDriver().switchTo().window(window);
			if(getDriver().getTitle().equalsIgnoreCase(title)) {
				return true;
			}
		}
		return false;
	}
	
	
	
}
