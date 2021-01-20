package com.YevhenFirhanAQA.journeys;

import com.YevhenFirhanAQA.BaseTest;
import com.YevhenFirhanAQA.pages.BestSellersPage;
import com.YevhenFirhanAQA.pages.FirstGoodBestSellersItemPage;
import com.YevhenFirhanAQA.pages.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BestSellersTest extends BaseTest {

    private String acceptCookiesButtonLocator = "//input[@id='sp-cc-accept']";
    private HomePage homePage;
    private BestSellersPage bestSellersPage;
    private FirstGoodBestSellersItemPage firstGoodBestSellersItemPage;
    //TODO this should be declared on the page and not in the test 
    public String GoodAppeared = "//div[@id='imgTagWrapperId']";

    @BeforeMethod(alwaysRun = true)
    public void setupTest() {

        if (driver.findElement(By.xpath(acceptCookiesButtonLocator)).isDisplayed()) {
            driver.findElement(By.xpath(acceptCookiesButtonLocator)).click();
        }
        homePage = new HomePage(driver);
    }

    @Test(groups = "main", suiteName = "ui")
    public void openFirstItemFromBestSellersPage() throws Exception {

        //Given user opens a browser and provides a valid url

        //When user clicks on 'Best Sellers' link he/she is redirected to the 'Best Sellers' page
        bestSellersPage = homePage.navigateToBestSellersPage();

        String expectedTitle = bestSellersPage.getFirstGoodItemTitle();
        //And then user clicks on the first good in the screen
        firstGoodBestSellersItemPage = bestSellersPage.navigateToFirstGoodBestSellersItemPage();
        //Then recently clicked good appears on a screen
<<<<<<< HEAD
        //TODO corresponding page should return boolean result of the check into Assert
        Assert.assertTrue(driver.findElement(By.xpath(GoodAppeared)).isDisplayed());
=======
        Assert.assertTrue(firstGoodBestSellersItemPage.isFirstGoodItemLocatorCorrect(expectedTitle), "Title is not correct.");
>>>>>>> 9b8d73a (Final Assignment Test)
    }
}
