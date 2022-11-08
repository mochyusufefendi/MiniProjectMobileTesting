package com.example.steps;

import com.example.app.page.AddtoCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CartStep {
    @Steps
    AddtoCartPage addtoCartPage;

    @Given("I am on the product page")
    public void iAmOnTheProductPage() {
        addtoCartPage.setProductPage();
    }

    @When("I click 1 buy button")
    public void iClick1BuyButton() {
        addtoCartPage.setClickBuy();
    }

    @Then("My item added to cart")
    public void myItemAddedToCart() {
        addtoCartPage.setAddCartdisplayed();
    }

    @And("I click 2 buy button")
    public void iClick2BuyButton() {
        addtoCartPage.setClickBuy2();
    }

    @Then("My item 2 added to chart")
    public void myItem2AddedToChart() {
        addtoCartPage.setGetAddCartdisplayed();
    }
}
