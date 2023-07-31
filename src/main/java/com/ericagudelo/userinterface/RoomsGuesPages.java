package com.ericagudelo.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class RoomsGuesPages {

    public static final Target BTN_OK = the("CLIK en Boton OK")
            .located(MobileBy.id("android:id/button1"));

    public static final Target BTN_APPLY= the("CLIK Boton Aplicar")
            .located(MobileBy.id("com.booking:id/group_config_apply_button"));

    public static final Target SELECT_ROOM = Target.the("Seleccionar cantidades")
            .locatedBy("//android.view.ViewGroup[@resource-id='com.booking:id/group_config_{0}_count']//android.widget.Button[@resource-id='com.booking:id/bui_input_stepper_add_button']");


}
