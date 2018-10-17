package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/features"},
        glue = {"stepDefinitions"}
      //plugin = { "pretty", "html:target/cucumber-reports" },
     //   format={"json:target/cucumber-reports/Cucumber.json","html:target/cucumber-reports"},
        //format = { "pretty", "json:target/cucumber.json" }
        )



public class RunnerAllFeatures {

}
