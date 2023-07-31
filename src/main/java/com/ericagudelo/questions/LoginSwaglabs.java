package com.ericagudelo.questions;

import com.ericagudelo.userinterface.ProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class LoginSwaglabs implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return ProductsPage.LBL_PRODUCTS.resolveFor(actor).isVisible();
    }

    public static LoginSwaglabs isSuccesfully(){
        return new LoginSwaglabs();
    }
}
