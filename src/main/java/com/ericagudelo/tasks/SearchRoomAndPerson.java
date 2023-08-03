package com.ericagudelo.tasks;

import com.ericagudelo.interactions.SelectionRoomAndPerson;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.ericagudelo.userinterface.SearchPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchRoomAndPerson implements Task {

    private String rooms, adults, children, old;

    public SearchRoomAndPerson(String rooms, String adults, String children, String old) {
        this.rooms = rooms;
        this.adults = adults;
        this.children = children;
        this.old = old;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SEARCH_ROOM)
        );
        actor.attemptsTo(
                SelectionRoomAndPerson.enterParameter(rooms, adults, children, old)
        );
        actor.attemptsTo(
                Click.on(BTN_SEARCHDATA)
        );

    }

    public static SearchRoomAndPerson apply(String rooms, String adults, String children, String old) {
        return instrumented(SearchRoomAndPerson.class, rooms, adults, children, old);
    }
}
