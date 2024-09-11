package com.amazon.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class AddAndDeleteUi {
    public static final Target btn_cumpleaños = Target.the("click a deals").locatedBy("//*[@id=\"primary-menu\"]/li[4]");

    public static final Target btn_add = Target.the("click add").locatedBy("//a[contains(.,'MDF 00013')]");
    public static final Target btn_go_cart = Target.the("Click go to cart").locatedBy("#cart");
    public static final Target btn_delete_from_cart = Target.the("click a delete item ").locatedBy("//a[@title='Remove this item']");

}
