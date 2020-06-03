package com.choucair.reto02.screenplay.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroExitosoPage extends PageObject {

    public static final Target SUCCESSFUL_REGISTRATION = Target
            .the("Verifica mensaje: Datos guardados correctamente.")
            .located(By.xpath("//*[@id='page-wrapper']/div/div[2]/div[2]"));
}
