package com.ericagudelo.tasks;

import com.ericagudelo.userinterface.NavigatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.ericagudelo.userinterface.DestinationPage.LBL_CITY;
import static com.ericagudelo.userinterface.InfoPersonPage.FIRST_NAME;
import static com.ericagudelo.userinterface.SearchPage.*;
import static com.ericagudelo.util.ConstantManager.DESTINATION_ERROR_MESSAGE;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

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
                Enter.theValue(destination).into(INPUT_SEARCH)
        );
        if (LBL_CITY.of(destination).resolveFor(actor).isVisible()){
            actor.attemptsTo(
                    Click.on(LBL_CITY.of(destination))
            );
        }else {
            WaitUntil.the(DESTINATION_ERROR,isEnabled()).forNoMoreThan(10).seconds();
            DESTINATION_ERROR_MESSAGE = DESTINATION_ERROR.resolveFor(actor).getText().trim();
        }
    }

    public static Search searchDestination(String destination) {
        return instrumented(Search.class, destination);
    }
}
