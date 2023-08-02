package com.ericagudelo.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.List;

import static com.ericagudelo.userinterface.DataTimePage.CALENDAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectionDates implements Interaction {

    private String date;

    public SelectionDates(String date) {
        this.date = date;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listValue = CALENDAR.resolveAllFor(actor);
        for (int iterador = 0; iterador < listValue.size(); iterador++) {
            String dateCalendar = listValue.get(iterador).getElement().getTagName();
            if (dateCalendar.contains(date)) {
                CALENDAR.resolveAllFor(actor).get(iterador).click();
                break;
            }
        }
    }

    public static SelectionDates theDate(String date) {
        return instrumented(SelectionDates.class, date);
    }

}
