package com.ericagudelo.userinterface;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.targets.Target.the;

public class InfoPersonPage {

    public static final Target FIRST_NAMEs = Target.the("First Name")
            .locatedBy("//android.widget.TextView[@text='First Name *']android.widget.EditText[@resource-id='com.booking:id/bui_input_container_content']");
    public static final Target LAST_NAME= the("Last Name")
            .located(MobileBy.id("com.booking:id/lastname"));

    public static final Target FIRST_NAME= the("Last Name")
            .located(MobileBy.id("com.booking:id/bstage1_contact_firstname_value"));
    public static final Target EMAIL_ADDRESS= the("Email Address:")
            .located(MobileBy.id("com.booking:id/email"));
}
