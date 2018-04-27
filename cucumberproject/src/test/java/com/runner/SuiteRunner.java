package com.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.runtime.model.CucumberFeature;

@CucumberOptions(
monochrome=true,
features="src/test/java/com/testcases/freecrm.feature",
plugin={"pretty","html:target/cucumber-html-report","com.cucumber.listener.ExtentCucumberFormatter:ExtentReports/ExtentReports.html" },
  glue="src/test/java/com/stepdefinations/Stepdefinations.java")
public class SuiteRunner extends AbstractTestNGCucumberTests{

}
