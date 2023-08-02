package com.ericagudelo.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.type.Type;

import java.util.List;

import static com.ericagudelo.userinterface.RoomsGuesPages.SELECT_ROOM_AND_PERSONS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectionRoomAndPerson implements Interaction {

    private String rooms, adults, children;

    public SelectionRoomAndPerson(String rooms, String adults, String children) {
        this.rooms = rooms;
        this.adults = adults;
        this.children = children;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listValue = SELECT_ROOM_AND_PERSONS.resolveAllFor(actor);
        Type.theValue(listValue.get(0).getElement().getText()).into(rooms);
        Type.theValue(listValue.get(0).getElement().getText()).into(adults);
        Type.theValue(listValue.get(2).getElement().getText()).into(children);

        /*
        for (int iterador = 0; iterador < listValue.size(); iterador++) {
            String dateCalendar = listValue.get(iterador).getElement();
            if(dateCalendar.contains(date)){
                SELECT_ROOM_AND_PERSONS.resolveAllFor(actor).get(iterador).click();
                break;
            }
        }
        */
    }

    public static SelectionRoomAndPerson apply(String rooms, String adults, String children){
        return instrumented(SelectionRoomAndPerson.class, rooms, adults, children);
    }

}
