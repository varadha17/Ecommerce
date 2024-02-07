package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "@output/rerun.txt", 
		glue= {"stepDef","AppHooks"}
		)

public class TestRunnerForFailedScenarios extends AbstractTestNGCucumberTests{

}
