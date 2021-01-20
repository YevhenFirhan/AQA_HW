package com.YevhenFirhanAQA.pages;

import com.YevhenFirhanAQA.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GoPro4kPage extends Page {

    private String fourStarsUp = "//span[@id='a-autoid-1']/span";

    public GoPro4kPage(RemoteWebDriver driver) {
        super(driver);
    }

    public GoPro4k4StarsUpPage setFourStarsUpRating() throws Exception {
        driver.findElement(By.xpath(fourStarsUp)).click();
        return PageFactory.newPage(driver, GoPro4k4StarsUpPage.class);
    }

}
