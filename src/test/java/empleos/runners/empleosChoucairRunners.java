package empleos.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/empleoChoucair.feature",
        tags = "@tag1",
        glue = "src/test/java/empleos/stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class empleosChoucairRunners {
}
