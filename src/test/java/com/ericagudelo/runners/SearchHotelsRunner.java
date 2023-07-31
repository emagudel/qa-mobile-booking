package com.ericagudelo.runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/search_hotels.feature",
        glue = "com.ericagudelo.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class SearchHotelsRunner {
}
