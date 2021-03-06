package com.YevhenFirhanAQA.journeys;

import com.YevhenFirhanAQA.BaseTest;
import com.YevhenFirhanAQA.framework.SearchTermsDataProvider;
import com.YevhenFirhanAQA.listeners.TestListener;
import com.YevhenFirhanAQA.pages.HomePage;
import com.YevhenFirhanAQA.pages.OspreyPage;
import io.cucumber.java.it.Data;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class SearchFieldTest extends BaseTest {

    private HomePage homePage;
    private String acceptCookiesButtonLocator = "//input[@id='sp-cc-accept']";
    private OspreyPage ospreyPage;

    @BeforeMethod(alwaysRun = true)
    public void setupTest() {

        if (driver.findElement(By.xpath(acceptCookiesButtonLocator)).isDisplayed()) {
            driver.findElement(By.xpath(acceptCookiesButtonLocator)).click();
        }
        homePage = new HomePage(driver);
    }

    @DataProvider(name = "getSearchTerms")
    public Object [] [] getSearchTerms() throws Exception {
        return SearchTermsDataProvider.getAllSearchTerms();
    }

    @Test(groups = "main", dataProvider = "getSearchTerms")
    public void searchTest(String searchTerm) throws Exception {

        //Given user opens a browser and provides a valid url

        //When user provides a search term "osprey" and clicks on search button
        ospreyPage = homePage.searchForItem(OspreyPage.class, searchTerm);

        //Then search term on the results page is "osprey"
        Assert.assertTrue(ospreyPage.isSearchTermCorrect(searchTerm), "Search term is not valid!");
    }

}
