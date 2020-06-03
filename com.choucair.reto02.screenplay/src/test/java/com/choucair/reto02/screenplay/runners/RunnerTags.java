package com.choucair.reto02.screenplay.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/automatizacionWeb.feature",
        tags = "@stories",
        glue = "com.choucair.reto02.screenplay.stepdefinitions",
        snippets = SnippetType.CAMELCASE )
public class RunnerTags {
}
