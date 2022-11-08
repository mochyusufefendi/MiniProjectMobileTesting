package com.example.app.base;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.example.app.drivers.AndroidDriverInit.driver;

public class BasePageObject {
    // digunakan untuk mendefinisikan method2 yang sering dipakai di suatu page
    public AndroidDriver<AndroidElement> getDriver(){
        return driver;
    }

    public WebDriverWait onWait(){
        return new WebDriverWait(getDriver(), 40, 1000);
    }

    // ini adalah mekanisme waitingnya atau mekanisme untuk bilang ke drivernya
    // nunggu sampai suatu kondisi tercapai
    // kita akan pakai si webdriverWait ini untuk pencarian elemennya kita

    public AndroidElement find(By locator){
        return (AndroidElement) onWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    } // kamu ambil element yaitu By locator, tapi waktu nyari kamu harus nunggu dulu sampai si element itu visible / muncul


    // aku akan ngebuat method click
    // method input text ke suatu element
    // method untuk ngecek isDisplayed

    public void click(By locator){

        // locator == By, atau kamu mau nge-locate atau nemuin suatu element by apa
        // dan valuenya apa

        // buat mekanisme untuk click
        // harus nemuin element dulu dari locator yg dikasih
        // baru kita kasih si method clicknya
        AndroidElement elm = find(locator);
        elm.click();
    }

    public void inputText(By locator, String input){
        AndroidElement elm = find(locator);
        elm.sendKeys(input);
    }

    public void isDisplayed(By locator){
        AndroidElement elm = find(locator);
        elm.isDisplayed();
    }

    public String getText(By locator){
        return find(locator).getText();
    }

    public void clear(By locator){
        find(locator).clear();
    }

    public void scrollAndClickBytext(String visibleText) {
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + visibleText + "\").instance(0))");
    }

    public void scrollUp(){
        TouchAction action = new TouchAction(driver);
        Dimension devices = driver.manage().window().getSize();
        try {
            action.press(PointOption.point((int) (0.5 * devices.getWidth()), (int) (0.9 * devices.getHeight())))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
                    .moveTo(PointOption.point((int) (0.5 * devices.getWidth()), (int) (0.2 * devices.getHeight())))
                    .release()
                    .perform();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}