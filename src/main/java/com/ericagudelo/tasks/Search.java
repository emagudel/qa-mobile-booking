package com.ericagudelo.tasks;

import com.ericagudelo.userinterface.NavigatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.ericagudelo.userinterface.DestinationPage.LBL_CITY;
import static com.ericagudelo.userinterface.SearchPage.BTN_SEARDESTINO;
import static com.ericagudelo.userinterface.SearchPage.INPUT_SEARCH;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Search implements Task {

    private String destination;

    public Search(String destination) {
        this.destination = destination;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NavigatePage.BTN_CLOSE),
                Click.on(BTN_SEARDESTINO),
                Click.on(INPUT_SEARCH),
                Enter.theValue(destination).into(INPUT_SEARCH),
                Click.on(LBL_CITY)
        );
    }
    
    public static Search searchDestination(String destination){
        return instrumented(Search.class, destination);
    }
}
