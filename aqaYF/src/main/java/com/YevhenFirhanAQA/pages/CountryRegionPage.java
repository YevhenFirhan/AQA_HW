package com.YevhenFirhanAQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import  com.YevhenFirhanAQA.pages.HomePage;

public class CountryRegionPage extends Page{

    private String saveChanges = "//span[@class='a-button-inner']//input[@type='submit']";
    public String flagGB = "//span[@class='icp-nav-flag icp-nav-flag-gb']";
    public CountryRegionPage(RemoteWebDriver driver) { super(driver); }

    public HomePage saveRegionCurrency() throws Exception {
        return clickOnElement(By.xpath(saveChanges), HomePage.class);
    }

}
