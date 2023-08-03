package com.ericagudelo.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class ResultSearchPage {

    public static final Target SELECT_LIST= the("Seleccionar Lista")
            .located(MobileBy.id("com.booking:id/results_list_facet"));
    public static final Target SELECT_DOS= the("Select Dos")
            .located(MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]"));
    public static final Target BTN_CHOOSE_ROOM= the("Boton elegir habitacion")
            .located(MobileBy.xpath("//android.widget.Button[@text='Select rooms' or @text='See your options' or @text='See availability']"));
    public static final Target RESERVE_THESE_OPTIONS = the("Boton elegir habitacion")
            .located(MobileBy.xpath("//android.widget.Button[@text='Reserve these options']"));
    public static final Target SELECT_ROOM= the("Boton elegir habitacion")
            .located(MobileBy.xpath("//android.widget.TextView[@text='SELECT']"));
    public static final Target BTN_RESERVA = the("Realizar Reserva")
            .located(MobileBy.xpath("//android.widget.Button[@text='Reserve']"));
    public static final Target NOT_CREDIT_CARD = the("No necesita tarjeta de credito")
            .located(MobileBy.id("com.booking:id/transactional_policies_info_item_text"));
    public static final Target PRICE_ROOM = the("Precio de la reserva")
            .located(MobileBy.id("com.booking:id/price_view_price"));
    public static final Target PRICE_ROOM_RECOMENDATION = the("Precio de la reserva recomendado")
            .located(MobileBy.id("com.booking:id/recommended_block_subtotal_price_view"));
}
