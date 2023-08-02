package com.ericagudelo.tasks;

import com.ericagudelo.interactions.AddTextField;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddInformation implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                AddTextField.enterParameter()
        );
    }

    public static AddInformation inApp() {
        return instrumented(AddInformation.class);
    }
}
