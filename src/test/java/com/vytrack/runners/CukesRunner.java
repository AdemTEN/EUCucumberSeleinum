package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //feature files location path
        features = "src/test/resources/features",
        //step definitions class path
        glue = "com/vytrack/step_definitions"

)


//this class generetas codes for step definition
public class CukesRunner {




}
