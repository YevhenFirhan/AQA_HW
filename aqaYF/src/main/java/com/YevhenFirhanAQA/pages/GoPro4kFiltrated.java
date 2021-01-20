package com.YevhenFirhanAQA.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GoPro4kFiltrated extends Page {

    private String searchResultsListLocator = "//*[@data-component-type='s-search-result']";
    private String sponsoredLabelLocator = "./span[@class='a-size-mini a-color-secondary']";
    private String item4PlusRatingLocator = "./i[@class='a-icon a-icon-star-small a-star-small-4-5 aok-align-bottom']";
    private String item5RatingLocator = "./i[@class='a-icon a-icon-star-small a-star-small-5 aok-align-bottom']";
    private String wholePriceLocator = "./span[@class='a-price-whole']";

    public GoPro4kFiltrated(RemoteWebDriver driver) {
        super(driver);
    }
    public boolean isExpectedConditionsMet() {
        List<WebElement> elements = getElements(By.xpath(searchResultsListLocator));
        boolean result = true;

        for(WebElement element : elements){
            if (!isDisplayed(element, By.xpath(sponsoredLabelLocator))) {
                if ((!element.findElement(By.xpath(item4PlusRatingLocator)).isDisplayed() ||
                        !element.findElement(By.xpath(item5RatingLocator)).isDisplayed())&&
                        Integer.parseInt(element.findElement(By.xpath(wholePriceLocator)).getText()) < 100) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

}
