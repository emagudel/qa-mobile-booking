package com.ericagudelo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.ericagudelo.userinterface.BookingConfirmation.BTN_BOOK_NOW_OR_STEP_NEXT;
import static com.ericagudelo.userinterface.BookingConfirmation.POPUP_ALERT;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class AddTextField implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        if(POPUP_ALERT.resolveFor(actor).isVisible()){
            actor.attemptsTo(
                    Click.on(POPUP_ALERT)
            );
        }
        WebDriver driver = getProxiedDriver();
        try {
            List<WebElement> formsPartI = driver.findElements(By.className("//android.widget.EditText"));
            List<WebElement> autoCompleteView = driver.findElements(By.className("//android.widget.AutoCompleteTextView"));
            if (formsPartI.size()==5) {
                formsPartI.get(0).sendKeys("Erik");
                formsPartI.get(1).sendKeys("Agudelo");
                autoCompleteView.get(0).sendKeys("e@e.com");
                formsPartI.get(3).sendKeys("Calle 75");
                formsPartI.get(2).sendKeys("05513");
                formsPartI.get(4).sendKeys("Medellin");
                autoCompleteView.get(1).clear();
                autoCompleteView.get(1).sendKeys("Colombia");
                formsPartI.get(2).sendKeys("300300300");
            }else if(formsPartI.size()==4) {
                formsPartI.get(0).sendKeys("Erik");
                formsPartI.get(1).sendKeys("Agudelo");
                autoCompleteView.get(0).sendKeys("e@e.com");
                formsPartI.get(2).sendKeys("Calle 75");
                formsPartI.get(3).sendKeys("05513");
                formsPartI.get(3).sendKeys("Medellin");
                autoCompleteView.get(1).clear();
                autoCompleteView.get(1).sendKeys("Colombia");
                formsPartI.get(2).sendKeys("300300300");
            }else if(formsPartI.size()==3) {
                formsPartI.get(0).sendKeys("Erik");
                formsPartI.get(1).sendKeys("Agudelo");
                autoCompleteView.get(0).sendKeys("e@e.com");
                autoCompleteView.get(1).clear();
                autoCompleteView.get(1).sendKeys("Colombia");
                formsPartI.get(2).sendKeys("300300300");
            }
        } catch (Exception ignored) {
        }
    }

    public static AddTextField enterParameter() {
        return instrumented(AddTextField.class);
    }

}