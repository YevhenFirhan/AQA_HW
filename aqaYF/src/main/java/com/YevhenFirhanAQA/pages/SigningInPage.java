package com.YevhenFirhanAQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.security.PublicKey;

public class SigningInPage extends Page{

    private String continueButton = "//input[@id='continue']";

    public SigningInPage(RemoteWebDriver driver) {
        super(driver);
    }

    public SigningInPage clickContinue() throws Exception {
        return clickOnElement(By.xpath(continueButton), SigningInPage.class);
    }
}
