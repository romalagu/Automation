package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features"},
                  glue = {"stepDefinitions"},
                  tags={"@Post"},
             format = { "pretty","json:target/cucumber.json" }
         )
public class TestRunner {
}
