package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"classpath:features"},glue = {"stepDefinitions"},
        monochrome = false,dryRun = false, plugin = {"pretty","html:target/cucumber","json:target/report.json"}
)
public class MainRunner extends AbstractTestNGCucumberTests {
}
