package com.choucair.reto01.screenplay.tasks;

import com.choucair.reto01.screenplay.interactions.SeleccionarLista;
import com.choucair.reto01.screenplay.interactions.OpcionLista;
import com.choucair.reto01.screenplay.model.RegistroData;
import com.choucair.reto01.screenplay.userinterface.RegistroDataPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Registro implements Task {
    private List<RegistroData> registroData;

    public Registro(List<RegistroData> registroData) {
        this.registroData = registroData;
    }

    public static Registro onThePage(List<RegistroData> registroData) {
        return Tasks.instrumented(Registro.class, registroData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(registroData.get(0).getFirstName()).into(RegistroDataPage.INPUT_FISRTNAME),
                Enter.theValue(registroData.get(0).getLastName()).into(RegistroDataPage.INPUT_LASTNAME),
                Enter.theValue(registroData.get(0).getAddress()).into(RegistroDataPage.INPUT_ADDRESS),
                Enter.theValue(registroData.get(0).getEmail()).into(RegistroDataPage.INPUT_EMAIL),
                Enter.theValue(registroData.get(0).getPhone()).into(RegistroDataPage.INPUT_PHONE),
                Click.on(RegistroDataPage.SELECT_GENDER_FEMALE),
                Click.on(RegistroDataPage.SELECT_HOBBIES_MOVIES),

                Click.on(RegistroDataPage.SELECT_LANGUAGES),
                SeleccionarLista.laLista(RegistroDataPage.LIST_LANGUAGES,registroData.get(0).getLanguages()),

                OpcionLista.laLista(RegistroDataPage.LIST_SKILLS,registroData.get(0).getSkills()),
                OpcionLista.laLista(RegistroDataPage.LIST_COUNTRY,registroData.get(0).getCountry()),
                OpcionLista.laLista(RegistroDataPage.LIST_COUNTRY2,registroData.get(0).getsCountry()),
                OpcionLista.laLista(RegistroDataPage.LIST_YEAR,registroData.get(0).getYear()),
                OpcionLista.laLista(RegistroDataPage.LIST_MONTH,registroData.get(0).getMonth()),
                OpcionLista.laLista(RegistroDataPage.LIST_DAY,registroData.get(0).getDay()),

                Enter.theValue(registroData.get(0).getPassword1()).into(RegistroDataPage.INPUT_PASSWORD1),
                Enter.theValue(registroData.get(0).getPassword2()).into(RegistroDataPage.INPUT_PASSWORD2),
                Click.on(RegistroDataPage.BUTTON_SUBMIT)

        );
    }
}
