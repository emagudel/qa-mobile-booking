package com.ericagudelo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static com.ericagudelo.userinterface.SearchPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectionRoomAndPerson implements Interaction {

    private String rooms, adults, children, old;

    public SelectionRoomAndPerson(String rooms, String adults, String children, String old) {
        this.rooms = rooms;
        this.adults = adults;
        this.children = children;
        this.old = old;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int num_room_default = Integer.parseInt(NUM_ROOMS.resolveFor(actor).getText());
        int num_adult_default = Integer.parseInt(NUM_ADULTS.resolveFor(actor).getText());
        int num_child_default = Integer.parseInt(NUM_CHILDREN.resolveFor(actor).getText());
        int num_room = Integer.parseInt(rooms) - num_room_default;
        int num_adults = Integer.parseInt(adults) - num_adult_default;
        int num_children = Integer.parseInt(children) - num_child_default;

        if (num_room_default != 1) {
            for (int numRooms = 0; numRooms < num_room; numRooms++) {
                actor.attemptsTo(
                        Click.on(SELECT_NUM_ROOMS_AND_PERSONS.of("rooms"))
                );
            }
        }
        if (num_room_default != 2) {
            for (int numAdults = 0; numAdults < num_adults; numAdults++) {
                actor.attemptsTo(
                        Click.on(SELECT_NUM_ROOMS_AND_PERSONS.of("adults"))
                );
            }
        }
        for (int numChildren = 0; numChildren < num_children; numChildren++) {
            actor.attemptsTo(
                    Click.on(SELECT_NUM_ROOMS_AND_PERSONS.of("children")),
                    SelectNumberPicker.on(old),
                    Click.on(BTN_OK),
                    Click.on(BTN_APPLY)
            );

        }
    }

    public static SelectionRoomAndPerson enterParameter(String rooms, String adults, String children, String old) {
        return instrumented(SelectionRoomAndPerson.class, rooms, adults, children, old);
    }

}