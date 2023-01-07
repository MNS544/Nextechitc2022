package TestRunnerTombile;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/sources/java/Features"},
                           plugin = {"json:target/cucumber.json"},
                           glue= "StepdefTmobile",
                           tags= {"@Tmobile"})


public class TmobileTestRunner extends AbstractTestNGCucumberTests{

}
