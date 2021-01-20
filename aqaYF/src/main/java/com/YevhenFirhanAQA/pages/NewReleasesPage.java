package com.YevhenFirhanAQA.pages;

import com.YevhenFirhanAQA.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NewReleasesPage extends Page {

    private String anyDepartment = "//*[@id='zg_browseRoot']/ul/li/a";
    private String departmentsWithPresentedGoods = "//*[@class='zg_homeWidget']/h3";
    public String MostGiftedNLinkLocator = "//div[@id='zg_tabs']/ul/li[5]/div/a";

    public NewReleasesPage(RemoteWebDriver driver) {
        super(driver);
    }

    public String getdepartmentsWithPresentedGoods() {
        return driver.findElement(By.xpath(departmentsWithPresentedGoods)).getText();
    }

    public boolean isDepartmentsWithPresentedGoodsTitlesCorrect() {
        return driver.findElement(By.xpath(anyDepartment)).getText().contains(getdepartmentsWithPresentedGoods());
    }

    public MostGiftedPage navigateToMostGiftedPage() throws Exception {
        driver.findElement(By.xpath(MostGiftedNLinkLocator)).click();
        return PageFactory.newPage(driver, MostGiftedPage.class);
    }

}
