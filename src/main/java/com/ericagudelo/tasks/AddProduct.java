package com.ericagudelo.tasks;

import com.ericagudelo.interactions.Scroll;
import com.ericagudelo.userinterface.ProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProduct implements Task {

    private String nameProduct;

    public AddProduct(String nameProduct){
        this.nameProduct = nameProduct;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductsPage.LBL_PRODUCT.of(nameProduct)),
                Scroll.untilVisibleTarget(ProductsPage.BTN_ADD_TO_CART),
                Click.on(ProductsPage.BTN_ADD_TO_CART)
        );
    }

    public static Performable toTheCart(String nameProduct){
        return instrumented(AddProduct.class, nameProduct);
    }
}
