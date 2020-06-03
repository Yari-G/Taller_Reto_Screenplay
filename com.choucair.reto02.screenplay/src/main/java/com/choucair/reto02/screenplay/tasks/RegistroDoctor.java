package com.choucair.reto02.screenplay.tasks;

import com.choucair.reto02.screenplay.interactions.SeleccionarLista;
import com.choucair.reto02.screenplay.model.RegistroData;
import com.choucair.reto02.screenplay.userinterface.RegistrarDoctorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import java.util.List;

public class RegistroDoctor implements Task {

    private List<RegistroData> registroData;

    public RegistroDoctor(List<RegistroData> registroData) {
        this.registroData = registroData;
    }
    public static RegistroDoctor onThePage(List<RegistroData> registroData) {
        return Tasks.instrumented(RegistroDoctor.class, registroData);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegistrarDoctorPage.SELECT_MENU),
                Enter.theValue(registroData.get(0).getNombreCompleto()).into(RegistrarDoctorPage.INPUT_NAME),
                Enter.theValue(registroData.get(0).getApellidos()).into(RegistrarDoctorPage.INPUT_LASTNAME),
                Enter.theValue(registroData.get(0).getTelefono()).into(RegistrarDoctorPage.INPUT_PHONE),
                SeleccionarLista.laLista(RegistrarDoctorPage.SELECT_ID_TYPE,registroData.get(0).getTipoDocumento()),
                Enter.theValue(registroData.get(0).getIdDoctor()).into(RegistrarDoctorPage.INPUT_IDENTIFICATION),
                Click.on(RegistrarDoctorPage.BUTTON_GUARDAR)
        );
    }
}
















