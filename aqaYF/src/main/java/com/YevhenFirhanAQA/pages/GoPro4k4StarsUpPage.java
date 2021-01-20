package com.YevhenFirhanAQA.pages;

import com.YevhenFirhanAQA.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GoPro4k4StarsUpPage extends Page {

    private String PriceFieldLocator = "//input[@id='low-price']";
    private String GoButtonLocator = "//span[@id='a-autoid-1']/span";

    public GoPro4k4StarsUpPage(RemoteWebDriver driver) {
        super(driver);
    }

    public GoPro4k4StarsUpPage setPrice(String minPrice) {
        driver.findElement(By.xpath(PriceFieldLocator)).sendKeys(minPrice);
        return this;
    }

    public GoPro4kFiltrated clickGoButton() throws Exception {
        driver.findElement(By.xpath(GoButtonLocator)).click();
        return PageFactory.newPage(driver, GoPro4kFiltrated.class);
    }

}
