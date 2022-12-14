package cucumberRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		publish = true,
		features = "src/test/resources/features/",
		glue = {"stepDefinitions"},
		
		monochrome = true,
		dryRun = false,
		plugin = {"pretty", 
					"html:target/reports/HtmlReport.html"}
		)
public class ShoppingDemoRunner extends AbstractTestNGCucumberTests{

}
