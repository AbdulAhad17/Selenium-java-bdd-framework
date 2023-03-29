package com.example.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(tags = "", features = {"src/test/resources/features/My_Test2.feature"}, glue = {"com.example.definitions"},
        plugin = { "pretty", "html:target/cucumber-reports.html" }
                 )

public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

}
