package com.YevhenFirhanAQA.pages;

import com.YevhenFirhanAQA.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TabletsPage extends Page{

    private String PrimeCheckBox = "//*[@id=\"s-refinements\"]/div[8]/ul/li[1]/span/a/div/label/i";

    public TabletsPage(RemoteWebDriver driver) { super(driver); }

    public PrimeTabletsPage clickPrimeCheckBox() throws Exception {
        driver.findElement(By.xpath(PrimeCheckBox)).click();
        return PageFactory.newPage(driver, PrimeTabletsPage.class);
    }

}
