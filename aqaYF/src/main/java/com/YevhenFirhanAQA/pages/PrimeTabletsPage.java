package com.YevhenFirhanAQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class PrimeTabletsPage extends Page{

    private String PrimeOptions = "//span[@aria-label='FREE Delivery by Amazon']|//i[@aria-label='Amazon Prime']";
    private String TabletsListing = "//div[@class='s-include-content-margin s-border-bottom s-latency-cf-section']";

    public PrimeTabletsPage(RemoteWebDriver driver) { super(driver); }

    public String getPrimeAndFreeDelivery() {
        return driver.findElement(By.xpath(PrimeOptions)).getText();
    }

    public boolean isListingPresentedContainPrimeAndDelivery() {
        return driver.findElement(By.xpath(TabletsListing)).getText().contains(getPrimeAndFreeDelivery());
    }

}
