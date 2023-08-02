package com.ericagudelo.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class InfoPersonPage {

    public static final Target FIRST_NAME = Target.the("Nombre")
            .located(MobileBy.id("bstage1_contact_firstname_value"));
    public static final Target LAST_NAME= the("Apellido")
            .located(MobileBy.id("bstage1_contact_lastname_value"));
    public static final Target EMAIL_ADDRESS= the("Direccion:")
            .located(MobileBy.id("bstage1_contact_email_value"));
    public static final Target COUNTYR= the("Pais")
            .located(MobileBy.id("bstage1_contact_country_value"));
    public static final Target PHONE_NUMBER= the("Telefono celular")
            .located(MobileBy.id("bstage1_contact_telephone_value"));
    public static final Target BTN_NEXT_STEP= the("Boton siguiente paso")
            .located(MobileBy.id("action_button"));

}
