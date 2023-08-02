package com.ericagudelo.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class DataTimePage {

    public static final Target CALENDAR = the("Mes actual")
            .located(MobileBy.xpath("//android.view.View[@content-desc]"));
    public static final Target SELECT_DATES = the("Boton seleccionar fecha")
            .located(MobileBy.id("facet_date_picker_confirm"));
    public static final Target SCROLL_CALENDAR = the("Scroll en el calendario")
            .located(MobileBy.AccessibilityId("14 February 2023"));
}
