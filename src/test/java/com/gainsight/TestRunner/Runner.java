package com.gainsight.TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = "com.gainsight.SDefinitions", features = "classpath:com.gainsight/FeatureFiles/test.feature")
public class Runner {
}
