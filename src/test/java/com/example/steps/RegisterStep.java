package com.example.steps;

import com.example.app.page.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class RegisterStep {

    @Steps
    RegisterPage registerPage;

    @Given("I am on the dashboard page")
    public void iAmonthedashboardpage(){
        registerPage.dashboardpage();

    }
    @When("I click register icon")
    public void iClickRegisterIcon() {
        registerPage.registericon();
    }

    @And("I input null fullname")
    public void iInputNullFullname() {
        registerPage.inputfullname("");
    }

    @And("I input null emaill")
    public void iInputnullEmaill() {
        registerPage.inputemail("");
    }

    @And("I input null passwords")
    public void iInputnullpasswords() {
        registerPage.inputpassword("");
    }

    @And("I click register buttons")
    public void iClickRegisterButtons() {
        registerPage.regButton();
    }

    @Then("I get error message fullname,email and password is required")
    public void iGetErrorMessageFullnameEmailAndPasswordIsRequired() {
        registerPage.errmessage();
    }

    @When("I click login Icon")
    public void iClickLoginIcon() {
        registerPage.lginIcon();
    }

    @And("I input valid fullname")
    public void iInputValidFullname() {
        registerPage.inputfullname("yusuf");
    }

    @Then("I get error message email empty")
    public void iGetErrorMessageEmailEmpty() {
        registerPage.errmessage2();
    }

    @And("I input valid Email")
    public void iInputValidEmail() {
        registerPage.inputemail("yefendi901@gmail.com");
    }

    @Then("I get error message paswords is required")
    public void iGetErrorMessagePaswordsIsRequired() {
        registerPage.errmessage3();
    }

    @And("I input valid passwords")
    public void iInputValidPasswords() {
        registerPage.inputpassword("yusuf12345");
    }

    @Then("I success create account")
    public void iSuccessCreateAccount() {
        registerPage.succesCreate();
    }

    @Then("I get error message fullname is required")
    public void iGetErrorMessageFullnameIsRequired() {
        registerPage.errmessage();
    }
}
