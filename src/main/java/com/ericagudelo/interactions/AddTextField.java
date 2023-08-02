package com.ericagudelo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class AddTextField implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = getProxiedDriver();
        try {
            List<WebElement> formsPartI = driver.findElements(By.xpath("//android.widget.EditText"));
            List<WebElement> autoCompleteView = driver.findElements(By.xpath("//android.widget.AutoCompleteTextView"));
            int fieldFull = formsPartI.size() + autoCompleteView.size();
            if (fieldFull == 5) {
                formsPartI.get(0).sendKeys("Erik");
                formsPartI.get(1).sendKeys("Agudelo");
                autoCompleteView.get(0).sendKeys("e@e.com");
                autoCompleteView.get(1).clear();
                autoCompleteView.get(1).sendKeys("Colombia");
                formsPartI.get(2).sendKeys("300300300");
                driver.findElement(By.id("com.booking:id/action_button")).click();
                driver.wait(5000);
                driver.findElement(By.id("com.booking:id/action_button")).click();
                driver.wait(5000);
            }
        } catch (Exception ignored) {
        }
    }

    public static AddTextField enterParameter() {
        return instrumented(AddTextField.class);
    }

}