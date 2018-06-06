package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="C:\\Users\\Tanay Chawla\\workspace\\FreeCrmBDDframework\\src\\main\\java\\Features\\hooks.feature"//path of the feature files
		,glue={"stepDefinitions"},//path of step definition files
		
		//plugin={"pretty","html:reports/cucumber-reports"},
		format = {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},//used to generate reporting formats
		monochrome = true, // display the console output in the proper readable format
		dryRun = false,//it will check the mapping b/w step definition and feature file
		strict = true)// it will check if any step is not defined in step definition file
		//tags={"@FunctionalTest"})

		//tags={"~@SmokeTest","~@RegressionTest","~@End2End"})// AND Condition




public class TestRunner {
//OR condition--> tags={"@SmokeTest,@RegressionTest"}
}
