package com.ericagudelo.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.BaseTarget.the;

public class NavigatePage {

       public static final Target BTN_CLOSE = Target.the("Cerrar Boton")
            .located(MobileBy.AccessibilityId("Navigate up"));
}
