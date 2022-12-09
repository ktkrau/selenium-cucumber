//gradle test -Dcucumberoptions="--tags @List" (para listStep)-------- comando para hacerlo desde la terminal
package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import pages.BasePage;



@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "steps",
    plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-reports.json"},
    monochrome = true, //para que mande boques mas limpios en el output
    tags= {"@List"}
)


public class Runner{



}