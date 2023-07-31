package com.ericagudelo.tasks;

import com.ericagudelo.interactions.Scroll;
import com.ericagudelo.interactions.SelectNumberPicker;
import com.ericagudelo.interactions.AddReservaPersonal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.ericagudelo.userinterface.DataTimePage.*;
import static com.ericagudelo.userinterface.DestinationPage.LBL_CITY;
import static com.ericagudelo.userinterface.InfoPersonPage.*;
import static com.ericagudelo.userinterface.ResultSearchPage.*;
import static com.ericagudelo.userinterface.RoomsGuesPages.*;
import static com.ericagudelo.userinterface.StaysPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class SearchCountry implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

        Click.on(INPUT_SEARCH),
                Click.on(INPUT_SEARCH),
                Enter.theValue("Cusco").into(INPUT_SEARCH),
                Click.on(LBL_CITY),
                com.ericagudelo.interactions.Scroll.untilVisibleTarget(SELECT_DATE_INIT),
                Click.on(SELECT_DATE_INIT),
                com.ericagudelo.interactions.Scroll.untilVisibleTarget(SELECT_DATEINITS),
                Click.on(SELECT_DATEINITS),
                Click.on(SELECT_DATE),
                Click.on(BTN_SEARCH_ROOM),
                //Click.on(SELECT_ROOM.of("rooms")),
                //Click.on(SELECT_ROOM.of("adults")),
                Click.on(SELECT_ROOM.of("children")),
                SelectNumberPicker.on("5 years old"),
                Click.on(BTN_OK),
                Click.on(BTN_APPLY),
                Click.on(BTN_SEARCHDATA),
                com.ericagudelo.interactions.Scroll.untilVisibleTarget(SELECT_DOS),
                Click.on(SELECT_DOS),
                com.ericagudelo.interactions.Scroll.untilVisibleTarget(BTN_PAGO),
                Click.on(BTN_PAGO),
                Click.on(SELECT_FAMILY_ROOM),
                Scroll.untilVisibleTarget(BTN_RESERVA),
               Click.on(BTN_RESERVA),
                WaitUntil.the(FIRST_NAME,isEnabled()).forNoMoreThan(5).seconds(),
                AddReservaPersonal.enterParameter("DAnny","Barrientos","dannybarrientos@gmail.com","Calle Sol","1530","United States of America","Colombia","32564898500")



         );
    }
    public static Performable searchCountry(){
        return instrumented(SearchCountry.class);
    }
}
