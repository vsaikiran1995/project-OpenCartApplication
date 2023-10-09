package stepDefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun=false,
		monochrome=true,
		features="src/test/java/features",
		plugin ={"pretty","html:target/html-cucumber"},
		glue="stepDefs",
		tags= {"@WIP"}
		
		)
public class TestRunner {

}
