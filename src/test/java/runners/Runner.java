package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },


        features = {
                "src/test/resources/homepage",
                "src/test/resources/adminpage",
                "src/test/resources/teacherpage",

                "src/test/resources/student_parent_page"},





      
        



        glue = {"stepdefinitions"},


        tags = "@ab",
        dryRun = true



        tags = "@ww",
        dryRun = true


       // glue = "stepdefinitions",









)

public class Runner {
}
