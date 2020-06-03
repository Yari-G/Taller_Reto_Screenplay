package com.choucair.reto02.screenplay.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrarPacientePage extends PageObject {

    public static final Target SELECT_MENU = Target
            .the("Seleccionar opcion Agregar Paciente en el menu")
            .located(By.xpath("//*[@id='page-wrapper']/div/div[2]/div/div/div/div/div[1]/div/a[2]"));

    public static final Target INPUT_NAME = Target
            .the("Ingresar nombre")
            .located(By.name("name"));

    public static final Target INPUT_LASTNAME = Target
            .the("Ingresar apellidos")
            .located(By.name("last_name"));

    public static final Target INPUT_PHONE = Target
            .the("Ingresar telefono")
            .located(By.name("telephone"));

    public static final Target SELECT_ID_TYPE = Target
            .the("Ingresar tipo de documento de identidad")
            .located(By.name("identification_type"));

    public static final Target INPUT_IDENTIFICATION = Target
            .the("Ingresar documento de identidad")
            .located(By.name("identification"));

    public static final Target CHECK_SALUDPREPAGADA = Target
            .the("Da click al check Salud Prepagada")
            .located(By.name("prepaid"));

    public static final Target BUTTON_GUARDAR = Target
            .the("Da click al boton guardar")
            .located(By.xpath("//*[@id='page-wrapper']/div/div[3]/div/a"));
}
