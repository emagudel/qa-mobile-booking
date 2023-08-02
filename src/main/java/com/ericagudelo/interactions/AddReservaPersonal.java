package com.ericagudelo.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class AddReservaPersonal implements Interaction {
    private final String namePersonal;
    private final String lastNamePersonal;
    private final String emailPersonal;
    private final String addressPersonal;
    private final String zipCodePersonal;
    private final String cityPersonal;
    private final String countryPersonal;
    private final String phoneNumberPersonal;


    public AddReservaPersonal(String namePersonal, String lastNamePersonal, String emailPersonal, String addressPersonal, String zipCodePersonal, String cityPersonal, String countryPersonal, String phoneNumberPersonal) {
        this.namePersonal = namePersonal;
        this.lastNamePersonal = lastNamePersonal;
        this.emailPersonal = emailPersonal;
        this.addressPersonal = addressPersonal;
        this.zipCodePersonal = zipCodePersonal;
        this.cityPersonal = cityPersonal;
        this.countryPersonal = countryPersonal;
        this.phoneNumberPersonal = phoneNumberPersonal;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = getProxiedDriver();
       // driver.findElement(MobileBy.AndroidUIAutomator(String.format("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"%s\"))",selectYear))).click();
        try {
            List<WebElement> formsPartI = driver.findElements(By.xpath("//android.widget.EditText"));
            List<WebElement> autoCompleteView = driver.findElements(By.xpath("//android.widget.AutoCompleteTextView"));
            if(formsPartI.size()==5) {
                formsPartI.get(0).sendKeys(namePersonal);
                formsPartI.get(1).sendKeys(lastNamePersonal);
                autoCompleteView.get(0).sendKeys(emailPersonal);
                formsPartI.get(2).sendKeys(addressPersonal);
                formsPartI.get(3).sendKeys(zipCodePersonal);
                formsPartI.get(4).sendKeys(cityPersonal);
                driver.findElement(By.id("com.booking:id/action_button")).click();
                formsPartI = driver.findElements(By.xpath("//android.widget.EditText"));
                autoCompleteView = driver.findElements(By.xpath("//android.widget.AutoCompleteTextView"));
                autoCompleteView.get(1).clear();
                autoCompleteView.get(1).sendKeys(countryPersonal);
                formsPartI.get(3).sendKeys(phoneNumberPersonal);
                driver.findElement(By.id("com.booking:id/action_button")).click();
            }
            else{
                formsPartI.get(0).sendKeys(namePersonal);
                formsPartI.get(1).sendKeys(lastNamePersonal);
                autoCompleteView.get(0).sendKeys(emailPersonal);
                autoCompleteView.get(1).clear();
                autoCompleteView.get(1).sendKeys(countryPersonal);
                formsPartI.get(2).sendKeys(phoneNumberPersonal);
                driver.findElement(By.id("com.booking:id/action_button")).click();
            }
        } catch (Exception ignored) {}
    }

    public static AddReservaPersonal enterParameter(String namePersonal, String lastNamePersonal, String emailPersonal, String addressPersonal, String zipCodePersonal, String cityPersonal, String countryPersonal, String phoneNumberPersonal){
        return Instrumented.instanceOf(AddReservaPersonal.class).withProperties( namePersonal,  lastNamePersonal,  emailPersonal,  addressPersonal,  zipCodePersonal,  cityPersonal,  countryPersonal,  phoneNumberPersonal);
    }

}