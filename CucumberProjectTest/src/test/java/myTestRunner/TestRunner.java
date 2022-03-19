package myTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions( 

		features="features"	,
		glue="stepDefinitions",
		plugin= {"pretty","html:target/cucumber-html-report","json:target/cucumber-json-report.json","junit:target/cucumber-junit-report.xml"},
		monochrome=true
		//strict=false
	//	dryRun=false
		)

public class TestRunner {

}
