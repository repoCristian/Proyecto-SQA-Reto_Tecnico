package com.amazon.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class CartUI {
    public static final Target cart_products = Target.the("cart products").locatedBy("//span[@class='mini-cart-items']");
}
