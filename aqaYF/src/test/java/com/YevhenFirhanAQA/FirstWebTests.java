package com.YevhenFirhanAQA;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FirstWebTests {

    private RemoteWebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test(priority = 4, suiteName = "test")
    public void bestSellersTest() {

        //Given - user opens Google Chrome Browser v.87.0.4280.88
        //and then opens Amazon web page, "UK" localization
        driver.get("https://www.amazon.co.uk/");

        //When user tries to figure out what another item to consume

        //Then user is noticing 'Best Sellers' field on the screen
        Assert.assertTrue(driver.findElement(By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']")).isDisplayed());
    }

    @Test(priority = 3, suiteName = "Localization")
    public void currencyChange() {
        //Given - user opens Google Chrome Browser v.87.0.4280.88
        //and then opens Amazon web page, "UK" localization
        driver.get("https://www.amazon.co.uk/");

        //When user realizes he's country currency is not GBP, he/she tries to figure out how to change it

        //Then user is noticing "GB flag"
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='nav-tools']//span[@class='icp-nav-link-inner']")).isDisplayed());
    }

    @Test(priority = 2, suiteName = "Basket")
    public void basket(){
        //Given - user opens Google Chrome Browser v.87.0.4280.88
        //and then opens Amazon web page, "UK" localization
        driver.get("https://www.amazon.co.uk/");

        //When user wants to check what's in his/her basket

        //Then user is noticing basket on a screen
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).isDisplayed());
    }

    @Test(priority = 1, suiteName = "Sign In")
    public void helloSignInAccount() {
        //Given - user opens Google Chrome Browser v.87.0.4280.88
        //and then opens Amazon web page, "UK" localization
        driver.get("https://www.amazon.co.uk/");

        //When - user wants to Sign In into his/her personal account on Amazon

        //Then user is noticing "Hello, Sign in Account" field
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='nav-tools']/a[@id='nav-link-accountList']")).isDisplayed());
    }

    @Test(priority = 0, suiteName = "Humburger Menu")
    public void hamburgerMenu() {
        //Given - user opens Google Chrome Browser v.87.0.4280.88
        //and then opens Amazon web page, "UK" localization
        driver.get("https://www.amazon.co.uk/");

        //When - user wants to see all available goods categories

        //Then user is noticing "Hamburger" menu icon
        Assert.assertTrue(driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).isDisplayed());
    }
}
