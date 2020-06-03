package com.choucair.reto02.screenplay.stepdefinitions;

import com.choucair.reto02.screenplay.model.RegistroData;
import com.choucair.reto02.screenplay.questions.Answer;
import com.choucair.reto02.screenplay.tasks.OpenUp;
import com.choucair.reto02.screenplay.tasks.RegistroCita;
import com.choucair.reto02.screenplay.tasks.RegistroDoctor;
import com.choucair.reto02.screenplay.tasks.RegistroPaciente;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class AutomatizacionWebStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    //SCENARIO 1
    @Given("^than Carlos needs to register a new doctor$")
    public void thanCarlosNeedsToRegisterANewDoctor() {
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());
    }
    @When("^he registers it in the Hospital Administration application$")
    public void heRegistersItInTheHospitalAdministrationApplication(List<RegistroData> registroData) {
        OnStage.theActorCalled("Carlos").wasAbleTo(RegistroDoctor.onThePage(registroData));
    }



    //SCENARIO 2
    @Given("^than Carlos needs to register a new patient$")
    public void thanCarlosNeedsToRegisterANewPatient() {
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());
    }
    @When("^he registers it in the Hospitals Administration application$")
    public void heRegistersItInTheHospitalsAdministrationApplication(List<RegistroData> registroData) {
        OnStage.theActorCalled("Carlos").wasAbleTo(RegistroPaciente.onThePage(registroData));
    }



    //SCENARIO 3
    @Given("^than Carlos needs to go to the doctor$")
    public void thanCarlosNeedsToGoToTheDoctor() {
        OnStage.theActorCalled("Carlos").wasAbleTo(OpenUp.thePage());
    }
    @When("^he registers an appointment$")
    public void heRegistersAnAppointment(List<RegistroData> registroData) {
        OnStage.theActorCalled("Carlos").wasAbleTo(RegistroCita.onThePage(registroData));
    }


    //SCENARIO 1, 2, 3 - Verificación de registro Exitoso
    @Then("^he verifies that it displayed on the screen the message (.*)$")
    public void heVerifiesThatItDisplayedOnTheScreenTheMessageDatosGuardadosCorrectamente(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }

}
