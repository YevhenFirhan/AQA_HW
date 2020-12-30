package com.YevhenFirhanAQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SearchNoResultPage extends Page{

    private String searchTermLocator = "//*[@class='a-color-state a-text-bold']";

    public SearchNoResultPage(RemoteWebDriver driver) {
        super(driver);
    }

    public boolean isSearchTermCorrect(String searchTerm) throws Exception {
        return driver.findElement(By.xpath(searchTermLocator)).getText().contains(searchTerm);
    }
}
