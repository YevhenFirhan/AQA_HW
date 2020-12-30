package com.YevhenFirhanAQA.framework;

import com.YevhenFirhanAQA.pages.BestSellersPage;
import com.YevhenFirhanAQA.pages.CountryRegionPage;
import com.YevhenFirhanAQA.pages.Page;
import com.YevhenFirhanAQA.pages.SigningInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Header {

    protected RemoteWebDriver driver;
    private String searchFieldLocator = "//input[@id='twotabsearchtextbox']";
    private String bestSellersLink = "//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']";
    private String CountryRegionLink = "//span[@class='icp-nav-flag icp-nav-flag-gb']";
    private String searchButtonLocator = "//span[@id='nav-search-submit-text']";
    private String signInLocator = "//span[@id='nav-link-accountList-nav-line-1']";

    public Header(RemoteWebDriver driver) { this.driver = driver; }

    public BestSellersPage navigateToBestSellersPage() throws Exception {
        driver.findElement(By.xpath(bestSellersLink)).click();
        return PageFactory.newPage(driver, BestSellersPage.class);
    }

    public CountryRegionPage navigateToCountryRegionPage() throws Exception {
        driver.findElement(By.xpath(CountryRegionLink)).click();
        return PageFactory.newPage(driver, CountryRegionPage.class);
    }

    public SigningInPage navigateToSigningInPage() throws Exception {
        driver.findElement(By.xpath(signInLocator)).click();
        return PageFactory.newPage(driver, SigningInPage.class);
    }

    public Header setSearchTerm(String searchTerm) {
        driver.findElement(By.xpath(searchFieldLocator)).sendKeys(searchTerm);
        return this;
    }

    public <T extends Page> T clickOnSearchButton(Class<T> clazz) throws Exception {
        driver.findElement(By.xpath(searchButtonLocator)).click();
        return PageFactory.newPage(driver, clazz);
    }

}
