package com.choucair.reto01.screenplay.stepdefinitions;

import com.choucair.reto01.screenplay.model.RegistroData;
import com.choucair.reto01.screenplay.questions.Answer;
import com.choucair.reto01.screenplay.tasks.OpenUp;
import com.choucair.reto01.screenplay.tasks.Registro;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class AutomationDemoStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Carlos wants to access at the web automation demo site$")
    public void thanCarlosWantsToAccessAtTheWebAutomationDemoSite() {
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());
    }

    @When("^he performs the registration on the page$")
    public void hePerformsTheRegistrationOnThePage(List<RegistroData> registroData) {
        OnStage.theActorCalled("Carlos").wasAbleTo(Registro.onThePage(registroData));
    }

    @Then("^he verifies that the screen loads with text (.*)$")
    public void heVerifiesThatTheScreenLoadsWithTextDoubleClickOnEditIconToEDITTheTableRow(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }
}
