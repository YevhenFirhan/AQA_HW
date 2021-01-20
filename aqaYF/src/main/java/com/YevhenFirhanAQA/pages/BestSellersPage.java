package com.YevhenFirhanAQA.pages;

import com.YevhenFirhanAQA.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.YevhenFirhanAQA.pages.FirstGoodBestSellersItemPage;

public class BestSellersPage extends Page {
//TODO you can use single '' inside of locators e.g. "//*[@id='zg_left_col1']/div[1]/div[2]/div/div[2]/a/div[2]";
    private String firstGoodItem = "//*[@id=\"zg_left_col1\"]/div[1]/div[2]/div/div[2]/a/div[2]";

    public BestSellersPage(RemoteWebDriver driver) { super(driver); }

    public String getFirstGoodItemTitle() {
        return getElements(By.xpath(firstGoodItem)).get(0).getText();
    }

    public FirstGoodBestSellersItemPage navigateToFirstGoodBestSellersItemPage() throws Exception {
        getElements(By.xpath(firstGoodItem)).get(0).click();
        return PageFactory.newPage(driver, FirstGoodBestSellersItemPage.class);
    }
}
