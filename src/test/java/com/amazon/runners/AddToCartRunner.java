package com.amazon.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"com/amazon/stepdefinitions"},
        features = {"src/test/resources/features/addtocart.feature"}
)
public class AddToCartRunner {
}
