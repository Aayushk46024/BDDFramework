package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (
                features = {"C:/Users/AayushKhandelwal/BDDFramework/src/main/java/FeatureFiles"},
                glue = {"StepDefinitions"},
                //dryRun = true,
                monochrome = false,
                plugin = {"pretty", "json:/Report/Cucumber.json",
                                "junit:Report/XMLReport.xml",
                                        "html:Report/cucumberReport.html"
                }
        )

public class TestRunner {
}
