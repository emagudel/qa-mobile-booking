package com.ericagudelo.tasks;

import com.ericagudelo.interactions.Scroll;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.ericagudelo.userinterface.InfoPersonPage.FIRST_NAME;
import static com.ericagudelo.userinterface.ResultSearchPage.*;
import static com.ericagudelo.util.ConstantManager.NO_NECESITA_TARJETA;
import static com.ericagudelo.util.ConstantManager.VALOR_DE_RESERVA;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ChooseRoom implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_LIST),
                Click.on(BTN_CHOOSE_ROOM)
        );
        actor.attemptsTo(
                WaitUntil.the(CONFIRM_ROOM,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CONFIRM_ROOM)
        );
        NO_NECESITA_TARJETA = NOT_CREDIT_CARD.resolveFor(actor).getText().trim();
        VALOR_DE_RESERVA = PRICE_ROOM.resolveFor(actor).getText().replace("US$","").trim();
        actor.attemptsTo(
                Click.on(BTN_RESERVA)
        );


    }

    public static ChooseRoom inApp() {
        return instrumented(ChooseRoom.class);
    }
}
