package com.ericagudelo.tasks;

import com.ericagudelo.userinterface.NavigatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NavigatePage.BTN_CLOSE)
        );
    }

    public static Performable inSwaglabs(){
        return instrumented(Login.class);
    }
}
