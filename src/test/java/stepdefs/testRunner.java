package stepdefs;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        plugin = {"pretty"},
        features = "src/test/java/features",
        glue = "stepdefs",
        tags = {"@US_1001"}
)
public class testRunner
{

}

//Run AS > JUnit Test
