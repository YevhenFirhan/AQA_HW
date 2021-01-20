package com.YevhenFirhanAQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MostGiftedBooksPage extends Page {

    public String OrderedListLocator = "//ol[@id='zg-ordered-list']/li";
    public String RatingLocator = "//a[@class='a-size-small a-link-normal']";

    public MostGiftedBooksPage(RemoteWebDriver driver) {
        super(driver);
    }

    public String getBooksRating() {
        return driver.findElement(By.xpath(RatingLocator)).getText();
    }

    public boolean isBooksPresentedHavingRating() {
        return driver.findElement(By.xpath(OrderedListLocator)).getText().contains(getBooksRating());
    }

}
