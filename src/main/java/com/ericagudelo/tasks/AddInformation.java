package com.ericagudelo.tasks;

import com.ericagudelo.interactions.AddTextField;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.ericagudelo.userinterface.BookingConfirmation.*;
import static com.ericagudelo.util.ConstantManager.NO_NECESITA_TARJETA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddInformation implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                AddTextField.enterParameter(),
                Click.on(BTN_ADD_MISSING_OR_NEXT_STEP_OR_FINAL_STEP),
                Click.on(BTN_ADD_MISSING_OR_NEXT_STEP_OR_FINAL_STEP)
        );
        if(NO_NECESITA_TARJETA.equals("No credit card needed")){
            actor.attemptsTo(
                    Click.on(BTN_BOOK_NOW_OR_STEP_NEXT)
            );
        }else{
            //actor.attemptsTo(
           //         Click.on(BTN_BOOK_NOW_OR_STEP_NEXT)
          //  );
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
