package com.ericagudelo.tasks;

import com.ericagudelo.interactions.AddTextField;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebDriver;

import static com.ericagudelo.userinterface.BookingConfirmation.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class AddInformation implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                AddTextField.enterParameter()
        );
        if (BTN_ADD_MISSING_OR_NEXT_STEP_OR_FINAL_STEP.resolveFor(actor).isVisible()) {
            actor.attemptsTo(
                    Click.on(BTN_NEXT_STEP),
                    Click.on(BTN_FINAL_STEP)
            );
        }else {
            actor.attemptsTo(
                    Click.on(BTN_BOOK_NOW)
            );
        }
        WaitUntil.the(NUMBER_CARD,isEnabled()).forNoMoreThan(10).seconds();
        if(NUMBER_CARD.resolveFor(actor).isVisible()){
            actor.attemptsTo(
                    Enter.theValue("4000123456789010").into(NUMBER_CARD)
            );
            actor.attemptsTo(
                    Enter.theValue("Erik Agudelo").into(TITULAR)
            );
            actor.attemptsTo(
                    Enter.theValue("1030").into(EXPEDITION_DATE)
            );
            actor.attemptsTo(
                    Enter.theValue("333").into(CVC)
            );
        }
    }

    public static AddInformation inApp() {
        return instrumented(AddInformation.class);
    }
}
