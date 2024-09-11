package com.amazon.stepdefinitions;

import com.amazon.questions.CartWithoutItemsQuestion;
import com.amazon.tasks.AddAndDelete;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.Is.is;

public class AddAndDeleteStepDefinitions {
    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @When("he wants add product from todays deals and delete")
    public void whenHeWantsAddProductsFrom(){
        theActorInTheSpotlight().attemptsTo(AddAndDelete.Item());
    }

    @Then("he shouldnt see item")
    public void thenHeShouldntSeeItem(){
        theActorInTheSpotlight().should(seeThat(CartWithoutItemsQuestion.ProductsCart(), is(true)));
    }
}
