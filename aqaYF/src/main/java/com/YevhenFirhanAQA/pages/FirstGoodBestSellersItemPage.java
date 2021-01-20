package com.YevhenFirhanAQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirstGoodBestSellersItemPage extends Page {

    private String firstGoodItemLocator = "//span[@id='productTitle']";

    public FirstGoodBestSellersItemPage(RemoteWebDriver driver) {
        super(driver);
    }

    public boolean isFirstGoodItemLocatorCorrect(String expectedTitle) {
       return getElement(By.xpath(firstGoodItemLocator)).getText().equals(expectedTitle);
    }
}
