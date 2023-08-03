package com.ericagudelo.stepdefinitions;

import com.ericagudelo.tasks.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.ericagudelo.userinterface.BookingConfirmation.TXT_CONFIRMED;
import static com.ericagudelo.userinterface.BookingConfirmation.TXT_PRICE_FINAL;
import static com.ericagudelo.util.ConstantManager.TEXTO_CONFIRMACION;
import static com.ericagudelo.util.ConstantManager.VALOR_DE_RESERVA;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SearchHotelStepDefinition {
    @Given("que {string} opens the booking app to navigate and enters the destination city {string}")
    public void que_Usuario_se_encuentra_en_la_pagina_para_seleccionar_destino(String actor, String destination) {
        theActorCalled(actor).attemptsTo(
                Search.searchDestination(destination)
        );
    }

    @And("select the stay date is from {string} to {string}")
    public void la_fecha_de_estadia(String start, String end) {
        theActorInTheSpotlight().attemptsTo(
                SearchDates.available(start, end)
        );
    }

    @And("selecting {string} room or rooms {string} adult or adults and {string} child or children {string}")
    public void selecciona_el_numero_de_habitacion_el_numero_adultos(String rooms, String adults, String children, String old) {
        theActorInTheSpotlight().attemptsTo(
                SearchRoomAndPerson.apply(rooms, adults, children, old)
        );
    }

    @When("choose your room and make your reservation")
    public void eligeLaHabitacion_y_realizaLaReserva() {
        theActorInTheSpotlight().attemptsTo(
                ChooseRoom.inApp()
        );
    }


    @Then("the user should be able to make the reservation successfully")
    public void el_usuario_deberia_poder_realizar_la_reserva_exitosamente() {
        theActorInTheSpotlight().attemptsTo(
                AddInformation.inApp()
        );
        theActorInTheSpotlight().attemptsTo(Ensure.that(TXT_CONFIRMED).text().contains(TEXTO_CONFIRMACION));
        theActorInTheSpotlight().attemptsTo(Ensure.that(TXT_PRICE_FINAL).text().contains(VALOR_DE_RESERVA));

    }
}
