package com.YevhenFirhanAQA.framework;

import com.YevhenFirhanAQA.pages.NewReleasesPage;
import com.YevhenFirhanAQA.pages.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AllCategories extends Page {

    private String newReleases = "//*[@id=\"hmenu-content\"]/ul[1]/li[3]/a";

    public AllCategories(RemoteWebDriver driver) {
        super(driver);
    }

    public NewReleasesPage navigateToNewReleasesPage() throws Exception {
        return clickOnElement(By.xpath(newReleases), NewReleasesPage.class);
    }

}
