package com.ericagudelo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class SelectionRoomAndPerson implements Interaction {

    private String rooms, adults, children;

    public SelectionRoomAndPerson(String rooms, String adults, String children) {
        this.rooms = rooms;
        this.adults = adults;
        this.children = children;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = getProxiedDriver();
        try {
            List<WebElement> fieldsForm = driver.findElements(By.id("com.booking:id/bui_input_stepper_value"));
            if (fieldsForm.size() == 3) {
                fieldsForm.get(0).clear();
                fieldsForm.get(0).sendKeys(rooms);
                fieldsForm.get(1).clear();
                fieldsForm.get(1).sendKeys(adults);
                fieldsForm.get(2).clear();
                fieldsForm.get(2).sendKeys(children);
                driver.findElement(By.id("com.booking:id/group_config_apply_button")).click();
            }
        } catch (Exception ignored) {
        }
    }

    public static SelectionRoomAndPerson enterParameter(String rooms, String adults, String children) {
        return instrumented(SelectionRoomAndPerson.class, rooms, adults, children);
    }

}