package com.ericagudelo.tasks;

import com.ericagudelo.interactions.ScrollDown;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.ericagudelo.userinterface.ResultSearchPage.*;
import static com.ericagudelo.util.ConstantManager.NO_NECESITA_TARJETA;
import static com.ericagudelo.util.ConstantManager.VALOR_DE_RESERVA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ChooseRoom implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_LIST)
        );
        actor.attemptsTo(
                Click.on(BTN_CHOOSE_ROOM)
        );
        if(RESERVE_THESE_OPTIONS.resolveFor(actor).isVisible()){
            actor.attemptsTo(
                    ScrollDown.on()
            );
        }
        NO_NECESITA_TARJETA = NOT_CREDIT_CARD.resolveFor(actor).getText().trim();
        VALOR_DE_RESERVA = PRICE_ROOM.resolveFor(actor).getText()
                .replace("US$","").replace("US$","").trim();
        actor.attemptsTo(
                Click.on(SELECT_ROOM)
        );
        actor.attemptsTo(
                Click.on(BTN_RESERVA)
        );
    }

    public static ChooseRoom inApp() {
        return instrumented(ChooseRoom.class);
    }
}
