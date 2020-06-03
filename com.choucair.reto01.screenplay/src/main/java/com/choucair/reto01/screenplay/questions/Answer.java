package com.choucair.reto01.screenplay.questions;

import com.choucair.reto01.screenplay.userinterface.RegistroDataPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer (String question){
        this.question = question;
    }
    public static Answer toThe(String question){
        return new Answer(question);
    }
    @Override
    public Boolean answeredBy(Actor actor){
        boolean result;
        String nameReference= Text.of(RegistroDataPage.NAME_REFERENCE).viewedBy(actor).asString();
        if (question.equals(nameReference)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
