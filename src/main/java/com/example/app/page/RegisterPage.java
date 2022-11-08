package com.example.app.page;

import com.example.app.base.BasePageObject;
import org.openqa.selenium.By;

public class RegisterPage extends BasePageObject {

    private By dashboardPage = By.xpath("//android.view.View[@content-desc=\"Products\"]");

    private By registerIcon = By.xpath("//android.widget.Button[@content-desc=\"Register\"]");

    private By inputFullname = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");

    private By inputEmail = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");

    private By inputPassword = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]");

    private By registerButton = By.xpath("//android.widget.Button[@content-desc=\"Register\"]");

    private By errmessage = By.xpath("//android.view.View[@content-desc=\"fullname can not empty\"]");

    private By loginIcon = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");

    private By errmessage2 = By.xpath("//android.view.View[@content-desc=\"email can not empty\"]");

    private By errmessage3 = By.xpath("//android.view.View[@content-desc=\"password can not empty\"]");

    public void dashboardpage(){isDisplayed(dashboardPage);}

    public void registericon(){click(registerIcon);}

    public void inputfullname(String fullname){
        click(inputFullname);
        inputText(inputFullname, fullname);
    }

    public void inputemail(String email){
        click(inputEmail);
        inputText(inputEmail, email);
    }

    public void inputpassword(String password){
        click(inputPassword);
        inputText(inputPassword, password);
    }

    public void regButton(){click(registerButton);}

    public void errmessage(){isDisplayed(errmessage);}

    public void errmessage2(){isDisplayed(errmessage2);}

    public void errmessage3(){isDisplayed(errmessage3);}

    public void lginIcon(){click(loginIcon);}

    public void succesCreate(){}
}
