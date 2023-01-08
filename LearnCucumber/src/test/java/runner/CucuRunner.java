package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;

/*
@CucumberOptions(features="src/test/java/features/parametrization.feature",glue="steps",monochrome=true,publish=true)

public class CucuRunner extends AbstractTestNGCucumberTests {

}
//features="src/tes@RunWith(Cucumber.class)
*/
@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(features="src/test/java/features/parametrization.feature",glue = "steps" ,publish=true)
public class CucuRunner {
}