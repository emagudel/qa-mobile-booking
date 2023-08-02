package com.ericagudelo.tasks;

import com.ericagudelo.interactions.SelectionDates;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.ericagudelo.userinterface.DataTimePage.SELECT_DATES;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchDates implements Task {

    private String start, end;

    public SearchDates(String start, String end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectionDates.theDate(start),
                SelectionDates.theDate(end),
                Click.on(SELECT_DATES)
        );

    }

    public static SearchDates available(String start, String end) {
        return instrumented(SearchDates.class, start, end);
    }
}
