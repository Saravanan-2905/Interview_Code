package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"src/test/java/features/login.feature"},
		dryRun = !true,
		glue = "steps",
		snippets = SnippetType.CAMELCASE,
		monochrome = true,
		plugin = {
				"pretty",
				"html:reports",
				"json:reports/result.json",
				"junit:reports/result.xml"
		
		}
		
		)
public class Runner extends AbstractTestNGCucumberTests{
	
	

}
