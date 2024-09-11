package com.amazon.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Open implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                net.serenitybdd.screenplay.actions.Open.url("https://www.floristeriamundoflor.com/")
        );
    }
    public static Open theUrl(){
        return Tasks.instrumented(Open.class);
    }
}
