package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/test/resources/Feature/",
        glue ="stepdefinition",
        dryRun = false,
        plugin ={"pretty","html:target/cucumber-reports.html"},
        tags ="@xyz"

)

public class TestRunner extends AbstractTestNGCucumberTests {

}
