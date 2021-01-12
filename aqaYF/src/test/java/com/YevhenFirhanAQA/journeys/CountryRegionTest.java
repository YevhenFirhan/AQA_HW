package com.YevhenFirhanAQA.journeys;

import com.YevhenFirhanAQA.BaseTest;
import com.YevhenFirhanAQA.pages.CountryRegionPage;
import com.YevhenFirhanAQA.pages.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CountryRegionTest extends BaseTest {

    private String acceptCookiesButtonLocator = "//input[@id='sp-cc-accept']";
    private HomePage homePage;
    private CountryRegionPage countryRegionPage;

    @BeforeMethod(alwaysRun = true)
    public void setupTest() {
        driver.get("https://www.amazon.co.uk");

        if (driver.findElement(By.xpath(acceptCookiesButtonLocator)).isDisplayed()) {
            driver.findElement(By.xpath(acceptCookiesButtonLocator)).click();
        }
        homePage = new HomePage(driver);
    }

    @Test(groups = "main", suiteName = "ui")
    public void changeCounrtyRegion() throws Exception {

        //Given user opens a browser and provides a valid url

        //When user clicks on 'GB' flag he/she is redirected to the 'Country/Region' page
        countryRegionPage = homePage.navigateToCountryRegionPage();
        //Once user ensures that his/her currency is GBP, as expected, user clicks on 'save changes' button
        homePage = homePage.navigateToCountryRegionPage().saveRegionCurrency();
        //Then homepage is opened, GB flag is displayed in the header
        //TODO boolean should be returned from the page rather than evaluating in the test
        Assert.assertTrue(driver.findElement(By.xpath(countryRegionPage.flagGB)).isDisplayed());
    }

}
