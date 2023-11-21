package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/main/java/sauce/feature",
		glue={"hooks","stepDef"},
		tags="@menu",
		dryRun=false
		
		)
public class driverRunner extends AbstractTestNGCucumberTests{

}
