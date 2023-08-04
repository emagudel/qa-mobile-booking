package com.ericagudelo.tasks;

import com.ericagudelo.interactions.ScrollDown;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.ericagudelo.userinterface.ResultSearchPage.*;
import static com.ericagudelo.util.ConstantManager.NO_CARD_NEEDED;
import static com.ericagudelo.util.ConstantManager.BOOKING_VALUE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ChooseRoom implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_LIST),
                Click.on(BTN_CHOOSE_ROOM)
        );
        if(RESERVE_THESE_OPTIONS.resolveFor(actor).isVisible()){
            actor.attemptsTo(ScrollDown.on());
        }
        NO_CARD_NEEDED = NOT_CREDIT_CARD.resolveFor(actor).getText().trim();
        BOOKING_VALUE = PRICE_ROOM.resolveFor(actor).getText()
                .replace("US$","").replace("US$","").trim();
        if(!SELECT_ROOM.resolveFor(actor).isVisible()){
            actor.attemptsTo(ScrollDown.on());
        }
        actor.attemptsTo(Click.on(SELECT_ROOM));
        if(BTN_CONFIRM.resolveFor(actor).isVisible()){
            actor.attemptsTo(
                    Click.on(BTN_CONFIRM)
            );
        }
        actor.attemptsTo(Click.on(BTN_RESERVA));
    }

    public static ChooseRoom inApp() {
        return instrumented(ChooseRoom.class);
    }
}
