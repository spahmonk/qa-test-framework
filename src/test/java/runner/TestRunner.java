package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"/Users/ilitvinov/Desktop/Builds/qa-test-framework/src/test/resources/features/"},
        glue = {"com.steps"},
        tags={"@All"},
        plugin = {"pretty", "html:target/cucumber-htmlreport", "junit:target/junit-report/junit-report.xml"}
)
public class TestRunner {
}
