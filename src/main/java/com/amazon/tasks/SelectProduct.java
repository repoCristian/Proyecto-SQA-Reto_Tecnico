package com.amazon.tasks;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

import static com.amazon.userinterface.PageUi.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class SelectProduct implements Task {

    private DataTable data;


    public SelectProduct(DataTable data) {
        this.data = data;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        List<Map<String, String>> values = data.asMaps(String.class, String.class);


        actor.attemptsTo(
                WaitUntil.the(btn_amor, isVisible()).forNoMoreThan(20).seconds(),
                WaitUntil.the(btn_amor, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(btn_amor),
                WaitUntil.the(btn_firstitem, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(btn_firstitem),
                Click.on(btn_add_cart),
                Click.on(btn_amor),
                Click.on(add_second_item.of(String.valueOf(values.get(0).get("namesecondproduct")))),
                Click.on(btn_add_cart)


//
        );
    }

    public static SelectProduct Form(DataTable data) {
        return Tasks.instrumented(SelectProduct.class, data);
    }
}
