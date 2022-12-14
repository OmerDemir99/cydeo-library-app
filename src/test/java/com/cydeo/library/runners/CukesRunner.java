package com.cydeo.library.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "pretty"
        },
        features = "src/test/resources/features",
        glue = "com/cydeo/library/step_definitions",
        dryRun = false,
        tags = "@Regression"
)
public class CukesRunner {
}
