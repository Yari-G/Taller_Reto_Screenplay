package com.choucair.reto02.screenplay.tasks;

import com.choucair.reto02.screenplay.interactions.SeleccionarLista;
import com.choucair.reto02.screenplay.model.RegistroData;
import com.choucair.reto02.screenplay.userinterface.RegistrarPacientePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class RegistroPaciente implements Task {

    private List<RegistroData> registroData;

    public RegistroPaciente(List<RegistroData> registroData) {
        this.registroData = registroData;
    }
    public static RegistroPaciente onThePage(List<RegistroData> registroData) {
        return Tasks.instrumented(RegistroPaciente.class, registroData);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegistrarPacientePage.SELECT_MENU),
                Enter.theValue(registroData.get(0).getNombreCompleto()).into(RegistrarPacientePage.INPUT_NAME),
                Enter.theValue(registroData.get(0).getApellidos()).into(RegistrarPacientePage.INPUT_LASTNAME),
                Enter.theValue(registroData.get(0).getTelefono()).into(RegistrarPacientePage.INPUT_PHONE),
                SeleccionarLista.laLista(RegistrarPacientePage.SELECT_ID_TYPE,registroData.get(0).getTipoDocumento()),
                Enter.theValue(registroData.get(0).getIdPaciente()).into(RegistrarPacientePage.INPUT_IDENTIFICATION),
                Click.on(RegistrarPacientePage.CHECK_SALUDPREPAGADA),
                Click.on(RegistrarPacientePage.BUTTON_GUARDAR)
        );
    }
}