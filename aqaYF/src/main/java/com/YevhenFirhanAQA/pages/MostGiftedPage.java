package com.YevhenFirhanAQA.pages;

import com.YevhenFirhanAQA.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MostGiftedPage extends Page {

    public String MostGiftedBooksLinkLocator = "//div[@id='zg_left_col2']/ul/ul/li[8]/a";

    public MostGiftedPage(RemoteWebDriver driver) {
        super(driver);
    }

    public MostGiftedBooksPage navigateToMostGiftedBooksPage() throws Exception {
        driver.findElement(By.xpath(MostGiftedBooksLinkLocator)).click();
        return PageFactory.newPage(driver, MostGiftedBooksPage.class);
    }

}
