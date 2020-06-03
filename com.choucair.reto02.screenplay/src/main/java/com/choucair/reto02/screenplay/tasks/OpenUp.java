package com.choucair.reto02.screenplay.tasks;

import com.choucair.reto02.screenplay.userinterface.AutomatizacionWebPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task{

    AutomatizacionWebPage automatizacionWebPage;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(automatizacionWebPage));
    }
}


