package com.example.steps;

import com.example.app.page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStep {
    @Steps
    LoginPage loginPage;

    @Given("I am on the dashboard")
    public void iAmOnTheDashboard() {
        loginPage.DashboardHdrdisplayed();
    }

    @When("I click login icon")
    public void iClickLoginIcon() {
        loginPage.LoginIcon();
    }

    @And("I input null email")
    public void iInputNullEmail() {
        loginPage.inputEmail("");
    }

    @And("I input null password")
    public void iInputNullPassword() {
        loginPage.inputPassword("");
    }

    @And("I click login button")
    public void iClickLoginButton() {
        loginPage.clickLogin();
    }


    @Then("I get error message")
    public void iGetErrorMessage() {
        loginPage.errMessage();
    }

    @And("I input valid email")
    public void iInputValidEmail() {
        loginPage.inputEmail("yusuffe92@gmail.com");
    }

    @Then("I get error message password is required")
    public void iGetErrorMessagePasswordIsRequired() {
        loginPage.errMessage2();
    }

    @And("I input valid password")
    public void iInputValidPassword() {
        loginPage.inputPassword("yusuf09876");
    }

    @Then("I get error message email is required")
    public void iGetErrorMessageEmailIsRequired() {
        loginPage.errMessage();
    }

    @Then("I success login")
    public void iSuccessLogin() {
        loginPage.successLogin();
    }

    @And("I input invalid email")
    public void iInputInvalidEmail() {
        loginPage.inputEmail("yusuf@mail");
    }

    @And("I input invalid password")
    public void iInputInvalidPassword() {
        loginPage.inputPassword("yusuf");
    }

    @Then("I get error message email atau password tidak valid")
    public void iGetErrorMessageEmailAtauPasswordTidakValid() {
        loginPage.setErrorinvalid();
    }
}
