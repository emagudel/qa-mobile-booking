package com.ericagudelo.tasks;

import com.ericagudelo.userinterface.NavigatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;


import static com.ericagudelo.userinterface.StaysPage.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Search implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(NavigatePage.BTN_CLOSE),
                Click.on(BTN_SEARDESTINO)

        );
    }
    public static Performable searchDestination(){
        return instrumented(Search.class);
    }
}
