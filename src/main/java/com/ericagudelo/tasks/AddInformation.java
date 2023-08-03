package com.ericagudelo.tasks;

import com.ericagudelo.interactions.AddTextField;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.ericagudelo.userinterface.BookingConfirmation.*;
import static com.ericagudelo.userinterface.ResultSearchPage.CONFIRM_ROOM;
import static com.ericagudelo.util.ConstantManager.NO_NECESITA_TARJETA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddInformation implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                AddTextField.enterParameter()
        );
        if(NO_NECESITA_TARJETA.equals("No credit card needed")){
            actor.attemptsTo(
                    Click.on(BTN_BOOK_NOW)
            );
        }else{
            actor.attemptsTo(
                    Enter.theValue("4000123456789010").into(NUMBER_CARD)
            );
            actor.attemptsTo(
                    Enter.theValue("Erik Agudelo").into(TITULAR)
            );
            actor.attemptsTo(
                    Enter.theValue("1030").into(EXPEDITION_DATE)
            );
            actor.attemptsTo(
                    Enter.theValue("333").into(CVC)
            );
        }



    }

    public static AddInformation inApp() {
        return instrumented(AddInformation.class);
    }
}
