package com.amazon.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class PageUi {

    public static final Target btn_amor = Target.the("click a amor").locatedBy("//*[@id=\"primary-menu\"]/li[3]");


    public static final Target btn_firstitem = Target.the("click a item").locatedBy("//a[@class='product-image image-loaded']");


    public static final Target btn_add_cart = Target.the("Add to cart").locatedBy("//button[@name='add-to-cart']");


    public static final Target add_second_item = Target.the("second item").locatedBy("//a[contains(.,'{0}')]");




}
