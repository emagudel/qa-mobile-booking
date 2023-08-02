package com.ericagudelo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.ericagudelo.userinterface.ResultSearchPage.*;
import static com.ericagudelo.util.ConstantManager.VALOR_DE_RESERVA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ChooseRoom implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        VALOR_DE_RESERVA = PRICE_ROOM.resolveFor(actor).getText().replace("US$","");
        actor.attemptsTo(
                Click.on(SELECT_LIST),
                Click.on(BTN_CHOOSE_ROOM),
                Click.on(CONFIRM_ROOM),
                Click.on(BTN_RESERVA)
        );

    }

    public static ChooseRoom inApp() {
        return instrumented(ChooseRoom.class);
    }
}
