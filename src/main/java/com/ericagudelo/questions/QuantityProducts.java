package com.ericagudelo.questions;

import com.ericagudelo.userinterface.CartShoppingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class QuantityProducts implements Question<Boolean> {
    private String cantProd;

    public QuantityProducts(String cantProd){
        this.cantProd = cantProd;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return cantProd.equals(CartShoppingPage.BTN_CART.resolveFor(actor).getText());
    }

    public static QuantityProducts itsEqual(String cantProducts){
        return new QuantityProducts(cantProducts);
    }
}
