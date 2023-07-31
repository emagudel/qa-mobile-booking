package com.ericagudelo.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class DataTimePage {
    public static final Target SELECT_DATE_INIT = the("Click En el boton Enter")
            .located(MobileBy.AccessibilityId("14 February 2023"));
    public static final Target SELECT_DATEINITS = the("Click En el boton Enter")
            .located(MobileBy.AccessibilityId("28 February 2023"));
    public static final Target SELECT_DATE = the("Click En el boton SElect Date")
            .located(MobileBy.id("com.booking:id/facet_date_picker_confirm"));
}
