package com.choucair.reto02.screenplay.tasks;

import com.choucair.reto02.screenplay.model.RegistroData;
import com.choucair.reto02.screenplay.userinterface.RegistrarCitaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class RegistroCita implements Task {

    private List<RegistroData> registroData;

    public RegistroCita(List<RegistroData> registroData) {
        this.registroData = registroData;
    }
    public static RegistroCita onThePage(List<RegistroData> registroData) {
        return Tasks.instrumented(RegistroCita.class, registroData);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegistrarCitaPage.SELECT_MENU),
                Enter.theValue(registroData.get(0).getDiaCita()).into(RegistrarCitaPage.INPUT_DATE),
                Enter.theValue(registroData.get(0).getIdPaciente()).into(RegistrarCitaPage.INPUT_ID_PACIENTE),
                Enter.theValue(registroData.get(0).getIdDoctor()).into(RegistrarCitaPage.INPUT_ID_DOCTOR),
                Enter.theValue(registroData.get(0).getObservaciones()).into(RegistrarCitaPage.INPUT_OBSERVACIONES),
                Click.on(RegistrarCitaPage.BUTTON_GUARDAR)
        );
    }
}