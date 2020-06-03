package com.choucair.reto01.screenplay.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/automationDemo.feature",
        tags = "@stories",
        glue = "com.choucair.reto01.screenplay.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
