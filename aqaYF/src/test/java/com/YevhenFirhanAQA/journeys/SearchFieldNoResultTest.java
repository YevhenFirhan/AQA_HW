package com.YevhenFirhanAQA.journeys;

import com.YevhenFirhanAQA.BaseTest;
import com.YevhenFirhanAQA.listeners.TestListener;
import com.YevhenFirhanAQA.pages.HomePage;
import com.YevhenFirhanAQA.pages.SearchNoResultPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class SearchFieldNoResultTest extends BaseTest {

    private HomePage homePage;
    private String acceptCookiesButtonLocator = "//input[@id='sp-cc-accept']";
    private String searchTerm = "gfbdfbdfhbdghd";
    private SearchNoResultPage searchNoResultPage;
    private String noResultsLable = "//div[@class='a-row']//span[contains(.,'No results for')]";

    @BeforeMethod(alwaysRun = true)
    public void setupTest() {
        driver.get("https://www.amazon.co.uk");

        if (driver.findElement(By.xpath(acceptCookiesButtonLocator)).isDisplayed()) {
            driver.findElement(By.xpath(acceptCookiesButtonLocator)).click();
        }
        homePage = new HomePage(driver);
    }

    @Test(groups = "main", suiteName = "ui")
    public void searchTest() throws Exception {

        //Given user opens a browser and provides a valid url

        //When user provides any invalid search term
        searchNoResultPage = homePage.searchForItem(SearchNoResultPage.class, searchTerm);

        //Then 'No results' page is presented to a user
        //TODO boolean should be returned from the page rather than evaluating in the test
        Assert.assertTrue(driver.findElement(By.xpath(noResultsLable)).isDisplayed());
    }

}
