package com.ericagudelo.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class SearchPage {

    public static final Target BTN_SEARCHDATA = the("Click En el boton Enter")
            .located(MobileBy.id("com.booking:id/facet_search_box_cta"));

    public static final Target BTN_SEARDESTINO = the("Click En el boton Destination")
            .located(MobileBy.id("facet_search_box_accommodation_destination"));
    public static final Target INPUT_SEARCH = the("Enter Password")
            .located(MobileBy.id("com.booking:id/facet_with_bui_free_search_booking_header_toolbar_content"));
    public static final Target BTN_SEARCH_ROOM = the("Seleccionar room")
            .located(MobileBy.id("com.booking:id/facet_search_box_accommodation_occupancy"));

}