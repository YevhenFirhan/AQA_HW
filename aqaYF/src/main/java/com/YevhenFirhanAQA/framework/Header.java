package com.YevhenFirhanAQA.framework;

import com.YevhenFirhanAQA.pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Header {

    protected RemoteWebDriver driver;
    private String searchFieldLocator = "//input[@id='twotabsearchtextbox']";
    private String bestSellersLink = "//*[@data-csa-c-content-id='nav_cs_bestsellers']";
    private String CountryRegionLink = "//span[@class='icp-nav-flag icp-nav-flag-gb']";
    private String searchButtonLocator = "//span[@id='nav-search-submit-text']";
    private String signInLocator = "//span[@id='nav-link-accountList-nav-line-1']";
    private String HamburgerMenuLocator = "//a[@id='nav-hamburger-menu']";
    private String NewReleasesDirectLinkLocator = "//*[@id=\"nav-xshop\"]/a[5]";
    private String ElectronicsLinkLocator = "//div[@id='nav-xshop']/a[9]";

    public Header(RemoteWebDriver driver) { this.driver = driver; }

    public AllCategories navigateToAllCatogories() throws Exception {
        driver.findElement(By.xpath(HamburgerMenuLocator)).click();
        return PageFactory.newPage(driver, AllCategories.class);
    }

    public ElectronicsPage navigateToElectronicsPage() throws Exception {
        driver.findElement(By.xpath(ElectronicsLinkLocator)).click();
        return PageFactory.newPage(driver, ElectronicsPage.class);
    }

    public NewReleasesPage navigateToNewReleases() throws Exception {
        driver.findElement(By.xpath(NewReleasesDirectLinkLocator)).click();
        return PageFactory.newPage(driver, NewReleasesPage.class);
    }

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
