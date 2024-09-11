package com.amazon.questions;

import com.amazon.userinterface.CartUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.Text.of;

import net.serenitybdd.screenplay.waits.WaitUntil;

public class CartWithTwoItemsQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(CartUI.cart_products, isVisible()).forNoMoreThan(100).seconds());
        String text = of(CartUI.cart_products).answeredBy(actor);

        if ("2".equals(text)) {
            return true;
        } else {

            throw new AssertionError("Expected value '2' but found '" + text + "'");
        }
    }

    public static CartWithTwoItemsQuestion ProductsCart() {
        return new CartWithTwoItemsQuestion();
    }
}
