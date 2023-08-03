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
    public static final Target NUM_ROOMS = the("Numero de la habitacion")
            .located(MobileBy.xpath("//android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.TextView[@resource-id='com.booking:id/bui_input_stepper_value']"));
    public static final Target NUM_ADULTS = the("Numero de los adultos")
            .located(MobileBy.xpath("//android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.TextView[@resource-id='com.booking:id/bui_input_stepper_value']"));
    public static final Target NUM_CHILDREN = the("Numero de los niños")
            .located(MobileBy.xpath("//android.view.ViewGroup[3]/android.widget.LinearLayout/android.widget.TextView[@resource-id='com.booking:id/bui_input_stepper_value']"));
    public static final Target SELECT_NUM_ROOMS_AND_PERSONS = Target.the("Seleccionar cantidades")
            .locatedBy("//android.view.ViewGroup[@resource-id='com.booking:id/group_config_{0}_count']//android.widget.Button[@resource-id='com.booking:id/bui_input_stepper_add_button']");
    public static final Target BTN_OK = the("CLIK en Boton OK")
            .located(MobileBy.id("android:id/button1"));
    public static final Target BTN_APPLY = the("CLIK Boton Aplicar")
            .located(MobileBy.id("com.booking:id/group_config_apply_button"));
    public static final Target LIST_YEAR_OLD = the("//android.widget.FrameLayout//android.widget.NumberPicker//android.widget.EditText")
            .located(MobileBy.id("android:id/button1"));


}