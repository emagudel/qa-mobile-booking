package com.ericagudelo.stepdefinitions;
import com.ericagudelo.tasks.Search;
import com.ericagudelo.tasks.SearchCountry;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SearchHotelStepDefinition {
    @Given("que {string} se encuentra en la pagina")
    public void  que_Usuario_se_encuentra_en_la_pagina(String actor) {
        theActorCalled(actor).attemptsTo(
                Search.searchDestination()
        );
     }

    @When("el usuario ingrese la ciudad destino {string}")
    public void el_usuario_ingrese_la_ciudad_destino(String destino) {

       theActorInTheSpotlight().attemptsTo(
                SearchCountry.searchCountry()

        );
    }

    @When("la fecha de estadia {string} a {string} del 2023")
    public void la_fecha_de_estadia(String ini, String fin) {throw new io.cucumber.java.PendingException();

    }

    @When("selecciona el numero de habitacion {string} el numero adultos {string}")
    public void selecciona_el_numero_de_habitacion_el_numero_adultos(String habitacion, String nroAdultos) {
        throw new io.cucumber.java.PendingException();
    }

    @When("la edad de los niños {string} años y {string} niño")
    public void la_edad_de_los_niños() {
        throw new io.cucumber.java.PendingException();
    }

    @Then("el usuario deberia poder realizar la reserva del alojamiento")
    public void el_usuario_deberia_poder_realizar_la_reserva_del_alojamiento() {
        throw new io.cucumber.java.PendingException();
    }
}
