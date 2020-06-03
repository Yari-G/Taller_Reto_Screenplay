package com.choucair.reto01.screenplay.tasks;

import com.choucair.reto01.screenplay.userinterface.AutomationDemoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task{
    AutomationDemoPage automationDemoPage;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(automationDemoPage));
    }
}
