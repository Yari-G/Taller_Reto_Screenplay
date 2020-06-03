package com.choucair.reto01.screenplay.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroDataPage extends PageObject {
    public static final Target INPUT_FISRTNAME = Target
            .the("Ingresar Nombre")
            .located(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input"));

    public static final Target INPUT_LASTNAME = Target
            .the("Ingresar Apellido")
            .located(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[2]/input"));

    public static final Target INPUT_ADDRESS = Target
            .the("Ingresar direccion")
            .located(By.xpath("//*[@id='basicBootstrapForm']/div[2]/div/textarea"));

    public static final Target INPUT_EMAIL = Target
            .the("Ingresar Email")
            .located(By.xpath("//*[@id='eid']/input"));

    public static final Target INPUT_PHONE = Target
            .the("Ingresar numero de telefono")
            .located(By.xpath("//*[@id='basicBootstrapForm']/div[4]/div/input"));

    public static final Target SELECT_GENDER_FEMALE = Target
            .the("Ingresar Genero - Female")
            .located(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div/label[2]/input"));

    public static final Target SELECT_HOBBIES_MOVIES= Target
            .the("Ingresar pasatiempo - Movies")
            .located(By.id("checkbox2"));


    public static final Target LIST_LANGUAGES = Target
            .the("Cargar lista del campo lenguaje")
           .located(By.xpath("//*[@id='basicBootstrapForm']/div[7]/div/multi-select/div[2]/ul"));

    public static final Target SELECT_LANGUAGES = Target
            .the("Seleccionar lenguaje")
            .located(By.id("msdd"));


    public static final Target LIST_SKILLS = Target
            .the("Cargar lista del campo skills")
            .located(By.xpath("//*[@id='basicBootstrapForm']/div[8]/div"));


    public static final Target LIST_COUNTRY = Target
            .the("Cargar lista del campo Country")
            .located(By.xpath("//*[@id='basicBootstrapForm']/div[9]/div"));


    public static final Target LIST_COUNTRY2 = Target
            .the("Cargar lista del campo Country 2")
            .located(By.xpath("//*[@id='basicBootstrapForm']/div[10]/div"));

    public static final Target LIST_YEAR = Target
            .the("Cargar lista del campo year")
            .located(By.xpath("//*[@id='basicBootstrapForm']/div[11]/div[1]"));


    public static final Target LIST_MONTH = Target
            .the("Cargar lista del campo month")
            .located(By.xpath("//*[@id='basicBootstrapForm']/div[11]/div[2]"));


    public static final Target LIST_DAY = Target
            .the("Cargar lista del campo day")
            .located(By.xpath("//*[@id='basicBootstrapForm']/div[11]/div[3]"));


    public static final Target INPUT_PASSWORD1 = Target
            .the("Ingresar password")
            .located(By.id("firstpassword"));

    public static final Target INPUT_PASSWORD2 = Target
            .the("Ingresar password2")
            .located(By.id("secondpassword"));

    public static final Target BUTTON_SUBMIT = Target
            .the("Da click para enviar formulario")
            .located(By.id("submitbtn"));


    public static final Target NAME_REFERENCE = Target
            .the("Extrae el nombre de la pagina - Double Click on Edit Icon to EDIT the Table Row")
            .located(By.xpath("/html/body/section/div[1]/div/div[2]/h4[1]"));
}
