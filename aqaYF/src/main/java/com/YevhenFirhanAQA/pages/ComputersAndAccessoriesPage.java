package com.YevhenFirhanAQA.pages;

import com.YevhenFirhanAQA.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ComputersAndAccessoriesPage extends Page {

    private String MonitorsPageLinkLocator = "//a[@title='Monitors']";
    private String TabletsLinkLocator = "//a[@title='Tablets']";

    public ComputersAndAccessoriesPage(RemoteWebDriver driver) { super(driver); }

    public MonitorsPage navigateToMonitorsPage() throws Exception {
        driver.findElement(By.xpath(MonitorsPageLinkLocator)).click();
        return PageFactory.newPage(driver, MonitorsPage.class);
    }

    public TabletsPage navigateToTabletsPage() throws Exception {
        driver.findElement(By.xpath(TabletsLinkLocator)).click();
        return PageFactory.newPage(driver, TabletsPage.class);
    }

}
