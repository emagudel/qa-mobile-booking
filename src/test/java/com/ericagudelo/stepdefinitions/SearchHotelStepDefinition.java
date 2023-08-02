package com.ericagudelo.stepdefinitions;

import com.ericagudelo.tasks.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SearchHotelStepDefinition {
    @Given("que {string} abre la app de booking para navegar e ingrese la ciudad destino {string}")
    public void que_Usuario_se_encuentra_en_la_pagina_para_seleccionar_destino(String actor, String destination) {
        theActorCalled(actor).attemptsTo(
                Search.searchDestination(destination)
        );
    }

    @And("selecciona la fecha de estadia es del {string} al {string}")
    public void la_fecha_de_estadia(String start, String end) {
        theActorInTheSpotlight().attemptsTo(
                SearchDates.available(start, end)
        );
    }

    @And("al seleccionar {string} habitacion o habitaciones {string} adulto o adultos y {string} niño o niños")
    public void selecciona_el_numero_de_habitacion_el_numero_adultos(String rooms, String adults, String children) {
        theActorInTheSpotlight().attemptsTo(
                SearchRoomAndPerson.apply(rooms, adults, children)
        );
    }

    @When("elige la habitacion y realiza la reserva")
    public void eligeLaHabitacion_y_realizaLaReserva() {
        theActorInTheSpotlight().attemptsTo(
                ChooseRoom.inApp()
        );
    }


    @Then("el usuario deberia poder realizar la reserva exitosamente")
    public void el_usuario_deberia_poder_realizar_la_reserva_exitosamente() {
        theActorInTheSpotlight().attemptsTo(
                AddInformation.inApp()
        );

    }
}
