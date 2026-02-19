package com.TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Feature",
    glue = {"com.StepDefiniton", "com.Hooks"}, // Match your specific spelling
    plugin = {"pretty", "html:target/cucumber-reports.html"},
    monochrome = true
)
public class Runner {
}