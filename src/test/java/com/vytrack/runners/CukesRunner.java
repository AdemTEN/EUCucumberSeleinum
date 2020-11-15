package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"json:target/cucumber.json",
                  "html:target/default-html-reports",
                //how to remember which test cases failed
                "rerun:target/rerun.txt"},// for keep the information about failed test case. which scenario
        //feature files location path
        features = "src/test/resources/features",
        //step definitions class path
        glue = "com/vytrack/step_definitions",
        //it doesnt wait the other steps to get method of step_def.
        dryRun = false,
        tags = "@wip"



        //tags = "@driver and @VYT-123" //===> new version ==>execute same test case
        // tags = "@driver and @VYT-123 and @wip" ==>first one
        //tags = {"@driver", "@VYT-123"} ===> old version

        //tags =  "@driver or @store_manager" ===> execute different scenarios===> new version
        //tags = "@driver, @store_manager" ===> old version

        //how we run all @login but not @wip also @sales_manager
        //tags = @login and not @wip

        // tags = "@Fleet-Vehicle or @Marketing-Campaigns"//execute two different scenario
)


//this class generetas codes for step definition
public class CukesRunner {


}
