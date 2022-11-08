package com.example.app.page;

import com.example.app.base.BasePageObject;
import org.openqa.selenium.By;

public class AddtoCartPage extends BasePageObject{

    private By productPage = By.xpath("//android.view.View[@content-desc=\"Products\"]");

    private By clickBuy = By.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[1]");

    private By clickBuy2 = By.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[2]");

    private By addCartdisplayed = By.xpath("//android.widget.Button[@content-desc=\"1\"]");

    private By getAddCartdisplayed = By.xpath("//android.widget.Button[@content-desc=\"2\"]");

    public void setProductPage(){isDisplayed(productPage);}

    public void setClickBuy(){click(clickBuy);}

    public void setAddCartdisplayed(){isDisplayed(addCartdisplayed);}

    public void setClickBuy2(){click(clickBuy2);}

    public void setGetAddCartdisplayed(){isDisplayed(getAddCartdisplayed);}
}
