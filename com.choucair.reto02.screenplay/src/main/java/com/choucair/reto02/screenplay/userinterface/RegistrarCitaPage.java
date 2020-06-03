package com.choucair.reto02.screenplay.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrarCitaPage extends PageObject {

    public static final Target SELECT_MENU = Target
            .the("Seleccionar opcion Agregar Cita en el menu")
            .located(By.xpath("//*[@id='page-wrapper']/div/div[2]/div/div/div/div/div[1]/div/a[6]"));

    public static final Target INPUT_DATE = Target
            .the("Ingresar dia de la cita")
            .located(By.id("datepicker"));

    public static final Target INPUT_ID_PACIENTE = Target
            .the("Ingresar documento de identidad del paciente")
            .located(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/div[2]/input"));

    public static final Target INPUT_ID_DOCTOR = Target
            .the("Ingresar telefono")
            .located(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/div[3]/input"));

    public static final Target INPUT_OBSERVACIONES = Target
            .the("Anotar observaciones")
            .located(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/div[4]/textarea"));

    public static final Target BUTTON_GUARDAR = Target
            .the("Da click al boton guardar")
            .located(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/a"));
}
