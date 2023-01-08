package runnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Loginn.feature",glue="stepDefination",monochrome=true,dryRun =false)
public class CucuRunner {

}
