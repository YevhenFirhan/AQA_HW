package com.YevhenFirhanAQA.pages;

import com.YevhenFirhanAQA.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {

    protected RemoteWebDriver driver;
    protected WebDriverWait wait;

    public Page(final RemoteWebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
    }

    protected <T extends Page>T clickOnElement(By selector, Class<T> clazz) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(selector));

        try {
            driver.findElement(selector).click();
            return PageFactory.newPage(driver, clazz);
        } catch (Exception ex) {
            return null;
        }
    }
}
