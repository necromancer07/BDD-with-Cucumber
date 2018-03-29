package cucumberTest;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features"
		,glue = {"cucumberTest"},
		plugin = {"pretty","html:AutomationPractice/Report/cucumber-reports"},
		monochrome = true
		)
public class TestRunner {

	
	}

