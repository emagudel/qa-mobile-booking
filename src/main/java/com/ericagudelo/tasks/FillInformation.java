package com.ericagudelo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.ericagudelo.userinterface.InfoPersonPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillInformation implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Erik").into(FIRST_NAME)
        );
        actor.attemptsTo(
                Enter.theValue("Agudelo").into(LAST_NAME)
        );
        actor.attemptsTo(
                Enter.theValue("E@E.com").into(EMAIL_ADDRESS)
        );
        actor.attemptsTo(
                Enter.theValue("Colombia").into(COUNTYR)
        );
        actor.attemptsTo(
                Enter.theValue("300300300").into(PHONE_NUMBER)
        );
        actor.attemptsTo(
                Click.on(BTN_NEXT_STEP)
        );
        actor.attemptsTo(
                Click.on(BTN_NEXT_STEP)
        );

    }

    public static FillInformation inApp() {
        return instrumented(FillInformation.class);
    }
}
