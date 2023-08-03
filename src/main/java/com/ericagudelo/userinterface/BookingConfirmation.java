package com.ericagudelo.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class BookingConfirmation {

    public static final Target NUMBER_CARD = the("Numero de la tarjeta")
            .located(MobileBy.id("com.booking:id/new_credit_card_number_input_layout"));
    public static final Target TYPE_CARD = the("Tipo de tarjeta")
            .located(MobileBy.id("com.booking:id/new_credit_card_type_containe"));
    public static final Target TITULAR = the("Titular de la reserva")
            .located(MobileBy.id("com.booking:id/new_credit_card_holder_input_layout"));
    public static final Target EXPEDITION_DATE = the("Fecha de expedicion")
            .located(MobileBy.id(""));
    public static final Target CVC = the("CVC")
            .located(MobileBy.id("com.booking:id/new_credit_card_cvc_input_layout"));
    public static final Target BTN_BOOK_NOW = the("Boton reservar ahora")
            .located(MobileBy.id("com.booking:id/action_button"));
    public static final Target TXT_PRICE_FINAL = the("Precio final de la reserva")
            .located(MobileBy.id("com.booking:id/pb_reservation_card_total_price"));
    public static final Target TXT_CONFIRMED = the("Precio final de la reserva")
            .located(MobileBy.id("com.booking:id/pb_reservation_header_title"));

}
