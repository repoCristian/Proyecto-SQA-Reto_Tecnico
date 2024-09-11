package com.amazon.stepdefinitions;

import com.amazon.tasks.SelectProduct;
import com.amazon.tasks.Open;
import com.amazon.questions.CartWithTwoItemsQuestion;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.Is.is;

public class AddToCartStepDefitinions {


    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("that {} has opened website")
    public void  givenThatUserHasOpenedWebsite(String actorName){
        theActorCalled(actorName).wasAbleTo(Open.theUrl());
    }

    @When("he wants add products")
    public void whenHeWantsAddProducts(DataTable data){
        theActorInTheSpotlight().attemptsTo(SelectProduct.Form(data));
    }

    @Then("he should see products")
    public void thenHeShouldSeeProducts(){
    theActorInTheSpotlight().should(seeThat(CartWithTwoItemsQuestion.ProductsCart(), is(true)));
    }

}
