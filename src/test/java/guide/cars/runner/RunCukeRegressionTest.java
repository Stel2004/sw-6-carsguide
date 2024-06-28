package guide.cars.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "guide/cars/steps",
        plugin = {
                "html:target/cucumber-reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:target/cucumber-reports/cucumber.json"
        },
        tags = "@regression"

)
public class RunCukeRegressionTest extends AbstractTestNGCucumberTests {

}