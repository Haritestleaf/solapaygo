package runner;

import io.cucumber.testng.CucumberOptions;
import steps.Baseclass;

@CucumberOptions(features = "src/test/java/features/Solapaygo.feature", glue = "steps", monochrome = true)

public class CucumberRunner extends Baseclass {

}
