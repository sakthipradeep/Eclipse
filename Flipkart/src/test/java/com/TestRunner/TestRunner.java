package com.TestRunner;
//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/verifyLogin.feature",glue="com.flipkartStepDefination"
,monochrome=true,publish=false,dryRun=false)
public class TestRunner extends AbstractTestNGCucumberTests {
	
}
