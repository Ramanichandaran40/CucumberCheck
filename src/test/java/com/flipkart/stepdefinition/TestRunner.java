package com.flipkart.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Ramanichandaran M\\eclipse-workspace\\Cucumber\\src\\test\\resources\\Features",
glue = "com.flipkart.stepdefinition",
plugin ="html:target",
monochrome = true,
dryRun = false,
tags = {"@map"})
public class TestRunner {

}
