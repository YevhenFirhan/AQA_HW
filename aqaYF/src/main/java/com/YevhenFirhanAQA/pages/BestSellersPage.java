package com.YevhenFirhanAQA.pages;

import com.YevhenFirhanAQA.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.YevhenFirhanAQA.pages.FirstGoodBestSellersItemPage;

public class BestSellersPage extends Page {

    private String firstGoodItem = "//*[@id=\"zg_left_col1\"]/div[1]/div[2]/div/div[2]/a/div[2]";

    public BestSellersPage(RemoteWebDriver driver) { super(driver); }

    public FirstGoodBestSellersItemPage clickElement() throws Exception {
        return clickOnElement(By.xpath(firstGoodItem), FirstGoodBestSellersItemPage.class);
    }

}
