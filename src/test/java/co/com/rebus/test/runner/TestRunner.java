package co.com.rebus.test.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/co/com/rebus/test/features/",
        glue = {"co.com.rebus.test.stepdefinitions", "co.com.rebus.test.set.hook"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true,
        tags = "@RegressionTest"

)
public class TestRunner {
}
