package com.ericagudelo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

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
            List<WebElement> numEditText = driver.findElements(By.className("android.widget.EditText"));
            List<WebElement> numAutoCompleteTextView = driver.findElements(By.className("android.widget.AutoCompleteTextView"));
            if (numEditText.size()==5 || numEditText.size()==4) {
                numEditText.get(0).sendKeys("Erik");
                numEditText.get(1).sendKeys("Agudelo");
                numAutoCompleteTextView.get(0).sendKeys("goku@goku.com");
                numEditText.get(2).sendKeys("Calle 75");
                numEditText.get(3).sendKeys("05513");
                driver.findElement(By.id("com.booking:id/action_button")).click();
                numEditText = driver.findElements(By.xpath("//android.widget.EditText"));
                numEditText.get(2).sendKeys("Medellin");
                numAutoCompleteTextView = driver.findElements(By.xpath("//android.widget.AutoCompleteTextView"));
                numAutoCompleteTextView.get(0).clear();
                numAutoCompleteTextView.get(0).sendKeys("Colombia");
                numEditText.get(3).sendKeys("300300300");
            }else{
                numEditText.get(0).sendKeys("Erik");
                numEditText.get(1).sendKeys("Agudelo");
                numAutoCompleteTextView.get(0).sendKeys("goku@goku.com");
                numAutoCompleteTextView.get(1).clear();
                numAutoCompleteTextView.get(1).sendKeys("Colombia");
                numEditText.get(2).sendKeys("300300300");
            }
        } catch (Exception ignored) {
        }
    }

    public static AddTextField enterParameter() {
        return instrumented(AddTextField.class);
    }

}