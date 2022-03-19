package myTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features="C://Users//sethu//eclipse-workspace//CucumberProjectTest//features//Tagging.feature",
			glue="stepDefinitions",
			plugin= {"pretty","html:target/cucumber-html-report","json:target/cucumber-json-report.json","junit:target/cucumber-junit-report.xml"},
			monochrome=true,
		//	tags= "@smoke and not  @fast"
		//	tags="@smoke or @fast"
			tags="@smoke and @fast"
			
			
			)
	public class TestRunnerTagging {
}
