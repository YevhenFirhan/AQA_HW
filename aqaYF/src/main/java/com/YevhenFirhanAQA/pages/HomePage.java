package com.YevhenFirhanAQA.pages;

import com.YevhenFirhanAQA.framework.AllCategories;
import com.YevhenFirhanAQA.framework.Header;
import com.YevhenFirhanAQA.framework.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HomePage extends Page {

    private Header header;

    public HomePage(RemoteWebDriver driver) {
        super(driver);
        this.header = new Header(driver);
    }

    public AllCategories navigateToAllCatogories() throws Exception {
        return header.navigateToAllCatogories();
    }

    public ElectronicsPage navigateToElectronicsPage() throws Exception {
        return header.navigateToElectronicsPage();
    }

    public NewReleasesPage navigateToNewReleasesPage() throws Exception {
        return header.navigateToNewReleases();
    }

    public BestSellersPage navigateToBestSellersPage() throws Exception {
        return header.navigateToBestSellersPage();
    }
    public CountryRegionPage navigateToCountryRegionPage() throws Exception {
        return header.navigateToCountryRegionPage();
    }

    public SigningInPage navigateToSigningInPage() throws Exception {
        return header.navigateToSigningInPage();
    }

    public <T extends Page> T searchForItem(Class<T> clazz, String searchTerm) throws Exception {
        return header.setSearchTerm(searchTerm).clickOnSearchButton(clazz);
    }

}
