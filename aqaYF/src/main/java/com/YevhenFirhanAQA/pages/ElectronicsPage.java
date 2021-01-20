package com.YevhenFirhanAQA.pages;

import com.YevhenFirhanAQA.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ElectronicsPage extends Page{

    private String ComputersAndAccessoriesLinkLocator = "//div[@id='nav-subnav']/a[8]";

    public ElectronicsPage(RemoteWebDriver driver) { super(driver); }

    public ComputersAndAccessoriesPage navigateToComputersAndAccessoriesPage() throws Exception {
        driver.findElement(By.xpath(ComputersAndAccessoriesLinkLocator)).click();
        return PageFactory.newPage(driver, ComputersAndAccessoriesPage.class);
    }

}
