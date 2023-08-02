package com.ericagudelo.tasks;

import com.ericagudelo.interactions.SelectionRoomAndPerson;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.ericagudelo.userinterface.SearchPage.BTN_SEARCHDATA;
import static com.ericagudelo.userinterface.SearchPage.BTN_SEARCH_ROOM;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchRoomAndPerson implements Task {

    private String rooms, adults, children;

    public SearchRoomAndPerson(String rooms, String adults, String children) {
        this.rooms = rooms;
        this.adults = adults;
        this.children = children;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_SEARCH_ROOM),
                SelectionRoomAndPerson.enterParameter(rooms,adults,children)
        );
        actor.attemptsTo(
                Click.on(BTN_SEARCHDATA)
        );

    }

    public static SearchRoomAndPerson apply(String rooms, String adults, String children) {
        return instrumented(SearchRoomAndPerson.class, rooms, adults, children);
    }
}
