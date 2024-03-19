package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/main/java/feature",
		glue={"hooks","stepDef"},
		tags="@smoke",
		dryRun=false
		
		)
public class driverRunner extends AbstractTestNGCucumberTests{

}
