package com.example.steps;

import com.example.app.page.LogoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LogoutStep {
    @Steps
    LogoutPage logoutPage;

    @Given("I am on dashboard")
    public void iAmOnDashboard() {
        logoutPage.setDashboard();
    }

    @When("I click Login icon")
    public void iClickLoginIcon() {
        logoutPage.setLoginikon();
    }

    @And("I Input valid email")
    public void iInputValidEmail() {
        logoutPage.setFieldemaill("yusuffe92@gmail.com");
    }

    @And("I Input valid Password")
    public void iInputValidPassword() {
        logoutPage.setFieldPass("yusuf09876");
    }

    @And("I click Login Button")
    public void iClickLoginButton() {
        logoutPage.setLoginbtnn();
    }

    @And("I click Logout button")
    public void iClickLogoutButton() {
        logoutPage.setLogoutbtn();
    }

    @Then("I success logout")
    public void iSuccessLogout() {
        logoutPage.successLogout();
    }

    @Then("I go to login page")
    public void iGoToLoginPage() {
        logoutPage.setLoginPage();
    }
}
