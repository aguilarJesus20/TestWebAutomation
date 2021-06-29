package co.com.automation.endava.runners;

import io.cucumber.junit.CucumberOptions;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src\\test\\resources\\features\\search_a_trip.feature"},
        glue = {"co.com.automation.endava.stepdefintions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
   )
public class SearchATripRunners {
}
