package com.ericagudelo.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class BookingConfirmation {

    public static final Target NUMBER_CARD = the("Numero de la tarjeta")
            .located(MobileBy.id("com.booking:id/new_credit_card_number_edit"));
    public static final Target TYPE_CARD = the("Tipo de tarjeta")
            .located(MobileBy.id("com.booking:id/new_credit_card_type_containe"));
    public static final Target TITULAR = the("Titular de la reserva")
            .located(MobileBy.id("com.booking:id/new_credit_card_holder_edit"));
    public static final Target EXPEDITION_DATE = the("Fecha de expedicion")
            .located(MobileBy.id("com.booking:id/new_credit_card_expiry_date_edit"));
    public static final Target CVC = the("CVC")
            .located(MobileBy.id("com.booking:id/new_credit_card_cvc_edit_text"));

    public static final Target BTN_BOOK_NOW = the("Boton reservar ahora")
            .located(MobileBy.id("com.booking:id/action_button"));
    public static final Target TXT_PRICE_FINAL = the("Precio final de la reserva")
            .located(MobileBy.id("com.booking:id/pb_reservation_card_total_price"));
    public static final Target TXT_CONFIRMED = the("Label Your booking is confirmed")
            .located(MobileBy.id("com.booking:id/pb_reservation_header_title"));
    public static final Target TXT_CREDIT_CARD_CONFIRMED = the("Label Your booking is confirmed")
            .located(MobileBy.id("com.booking:id/payment_title_with_icons_title"));

    public static final Target BTN_ADD_MISSING_OR_NEXT_STEP_OR_FINAL_STEP = the("Realizar Reserva")
            .located(MobileBy.xpath("//android.widget.Button[@text='Add missing details' or @text='Next step' or @text='Final step']"));
    public static final Target BTN_NEXT_STEP = the("Boton siguiente paso")
            .located(MobileBy.xpath("//android.widget.Button[@text='Next step']"));
    public static final Target BTN_FINAL_STEP = the("Boton siguiente paso")
            .located(MobileBy.xpath("//android.widget.Button[@text='Final step']"));



    public static final Target POPUP_ALERT = the("Popup de alerta para llenar la informacion de la reserva")
            .located(MobileBy.id("com.booking:id/button_positive"));


}
