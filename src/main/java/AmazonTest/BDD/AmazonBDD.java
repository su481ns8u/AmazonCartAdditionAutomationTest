package AmazonTest.BDD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\main\\resources\\" }, glue = {
"AmazonTest.StepDef" }, plugin = { "pretty", "json:target/cucumber-json-report/cucumber.json",
		"json:target/cucumber-json-report/cucumber.json", "html:target/cucumber-html-report/"}, tags = { "@AddToCart" })
public class AmazonBDD extends AbstractTestNGCucumberTests{
}
