package com.example.app.page;

import com.example.app.base.BasePageObject;
import com.sun.org.apache.xpath.internal.operations.And;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import static com.example.app.drivers.AndroidDriverInit.driver;

public class LoginPage extends BasePageObject {

    private By loginIcon = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");

    private By fieldEmail = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");

    private By fieldPassword = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");

    private By loginBtn = By.xpath("//android.widget.Button[@content-desc=\"Login\"]");

    private By errorMsg = By.xpath("//android.view.View[@content-desc=\"email can not empty\"]");

    private By dashboardHdr = By.xpath("//android.view.View[@content-desc=\"Products\"]");

    private By errorMsg2 = By.xpath("//android.view.View[@content-desc=\"password can not empty\"]");

    private By errorinvalid = By.xpath("//android.view.View[@content-desc=\"Email atau password tidak valid.\"]");


    public void DashboardHdrdisplayed(){ isDisplayed(dashboardHdr);
    }

    public void LoginIcon(){click(loginIcon);
    }

    public void inputEmail(String email){
        click(fieldEmail);
        inputText(fieldEmail, email);
    }

    public void inputPassword(String password){
        click(fieldPassword);
        inputText(fieldPassword, password);
    }

    public void clickLogin(){click(loginBtn);
    }

    public void errMessage(){isDisplayed(errorMsg);
    }

    public void errMessage2(){isDisplayed(errorMsg2);}

    public void setErrorinvalid(){isDisplayed(errorinvalid);}

    public void successLogin(){}
}
