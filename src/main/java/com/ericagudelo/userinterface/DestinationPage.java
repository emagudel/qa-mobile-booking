package com.ericagudelo.userinterface;

import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class DestinationPage {

    public static final Target LBL_CITY = the("Seleccionar City").locatedBy("//android.widget.TextView[@text='City in Cusco, Peru']");

}
