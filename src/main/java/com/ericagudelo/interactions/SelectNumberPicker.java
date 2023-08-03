package com.ericagudelo.interactions;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.WebDriver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class SelectNumberPicker implements Interaction {
    private final String selectYear;

    public SelectNumberPicker(String selectYear) {
        this.selectYear = selectYear;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = getProxiedDriver();
        driver.findElement(MobileBy.AndroidUIAutomator(String.format("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"%s\"))", selectYear)));
    }

    public static SelectNumberPicker on(String selectYear) {
        return Instrumented.instanceOf(SelectNumberPicker.class).withProperties(selectYear);
    }
}