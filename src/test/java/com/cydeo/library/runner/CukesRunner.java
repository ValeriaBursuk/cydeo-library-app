package com.cydeo.library.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/report.html", //html report
                "rerun:target/rerun.txt",
                "junit:target/junit/junit-report.xml",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber", //cucumber report
                "json:target/cucumber.json"}, //for report with jenkins
        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions"
        //tags = "@link"
)
public class CukesRunner {


}
