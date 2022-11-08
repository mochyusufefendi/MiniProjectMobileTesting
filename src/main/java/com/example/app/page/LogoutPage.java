package com.example.app.page;

import com.example.app.base.BasePageObject;
import org.openqa.selenium.By;

public class LogoutPage extends BasePageObject {

    private By dashboard = By.xpath("//android.view.View[@content-desc=\"Products\"]");

    private By loginikon = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");

    private By fieldemaill = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");

    private By fieldPass = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");

    private By Loginbtnn = By.xpath("//android.widget.Button[@content-desc=\"Login\"]");

    private By Logoutbtn = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");

    private By loginPage = By.xpath("//android.view.View[@content-desc=\"Login\"]");

    public void setDashboard(){isDisplayed(dashboard);}

    public void setLoginikon(){click(loginikon);}

    public void setFieldemaill(String email){
        click(fieldemaill);
        inputText(fieldemaill, email);
    }

    public void setFieldPass(String pass){
        click(fieldPass);
        inputText(fieldPass, pass);
    }

    public void setLoginbtnn(){click(Loginbtnn);}

    public void setLogoutbtn(){click(Logoutbtn);}

    public void successLogout(){}

    public void setLoginPage(){isDisplayed(loginPage);}
}
