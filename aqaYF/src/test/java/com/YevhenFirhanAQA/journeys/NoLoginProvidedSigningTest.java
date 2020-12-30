package com.YevhenFirhanAQA.journeys;

import com.YevhenFirhanAQA.BaseTest;
import com.YevhenFirhanAQA.pages.HomePage;
import com.YevhenFirhanAQA.pages.SigningInPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NoLoginProvidedSigningTest extends BaseTest {

    private String acceptCookiesButtonLocator = "//input[@id='sp-cc-accept']";
    private HomePage homePage;
    private SigningInPage signingInPage;
    private String alertFlag = "//*[@id=\"auth-email-missing-alert\"]/div/i";

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

        //When user clicks on 'Hello, Sign in' field he/she is redirected to the 'Signing In' page
        signingInPage = homePage.navigateToSigningInPage();
        //and user clicks 'Continue' button without providing an email or phone number as 'username'
        signingInPage = signingInPage.clickContinue();
        //Then alert is presented giving the user an advise of a needed action required
        Assert.assertTrue(driver.findElement(By.xpath(alertFlag)).isDisplayed());
    }

}
