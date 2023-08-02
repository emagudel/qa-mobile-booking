package com.ericagudelo.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class ResultSearchPage {

    public static final Target SELECT_LIST= the("Seleccionar Lista")
            .located(MobileBy.id("com.booking:id/results_list_facet"));
    public static final Target BTN_CHOOSE_ROOM= the("Boton elegir habitacion")
            .located(MobileBy.id("select_room_cta"));
    public static final Target CONFIRM_ROOM= the("Boton elegir habitacion")
            .located(MobileBy.id("rooms_item_select_layout"));
    public static final Target BTN_RESERVA = the("Realizar Pago")
            .located(MobileBy.xpath("//android.widget.Button[@text='Reserva ahora' or @text='Reserve']"));
    public static final Target PRICE_ROOM = the("Realizar Pago")
            .located(MobileBy.id("price_view_price"));

}
