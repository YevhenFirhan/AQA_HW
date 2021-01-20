package com.YevhenFirhanAQA.journeys;

import com.YevhenFirhanAQA.BaseTest;
import com.YevhenFirhanAQA.framework.AllCategories;
import com.YevhenFirhanAQA.framework.SearchTermsDataProvider;
import com.YevhenFirhanAQA.pages.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FinalAssignmentTests extends BaseTest {

    private String acceptCookiesButtonLocator = "//input[@id='sp-cc-accept']";
    private HomePage homePage;
    private AllCategories allCategories;
    private NewReleasesPage newReleasesPage;
    private MostGiftedPage mostGiftedPage;
    private MostGiftedBooksPage mostGiftedBooksPage;
    private GoPro4kPage goPro4kPage;
    private GoPro4k4StarsUpPage goPro4k4StarsUpPage;
    private GoPro4kFiltrated goPro4kFiltrated;
    private String minPrice = "100";
    private ElectronicsPage electronicsPage;
    private ComputersAndAccessoriesPage computersAndAccessoriesPage;
    private MonitorsPage monitorsPage;
    private TabletsPage tabletsPage;
    private PrimeTabletsPage primeTabletsPage;

    @BeforeMethod(alwaysRun = true)
    public void setupTest() {
        if (driver.findElement(By.xpath(acceptCookiesButtonLocator)).isDisplayed()) {
            driver.findElement(By.xpath(acceptCookiesButtonLocator)).click();
        }
        homePage = new HomePage(driver);
    }

    @Test(groups = "main", suiteName = "ui")
    public void TC_1_verifyNewReleasesPage() throws Exception {
        //Given user opens a browser and provides a valid url

        //When user clicks on 'Hamburger Menu'(Label = 'All')
        allCategories = homePage.navigateToAllCatogories();
        //And clicks on 'New Releases' field
        newReleasesPage = allCategories.navigateToNewReleasesPage();
        //Then departments only from the 'All Departments' List are presented
        Assert.assertTrue(newReleasesPage.isDepartmentsWithPresentedGoodsTitlesCorrect(), "Titles are not correct.");
    }

    @Test(groups = "main", suiteName = "ui")
    public void TC_2_verifyMostGiftedPage() throws Exception {
        //Given user opens a browser and provides a valid url

        //When user clicks on 'New Releases' link in the header
        newReleasesPage = homePage.navigateToNewReleasesPage();
        //And clicks on 'Most Gifted' link
        mostGiftedPage = newReleasesPage.navigateToMostGiftedPage();
        //And clicks on 'Books' Link
        mostGiftedBooksPage = mostGiftedPage.navigateToMostGiftedBooksPage();
        //Then we verify that all of the books have Ratings presented
        Assert.assertTrue(mostGiftedBooksPage.isBooksPresentedHavingRating(), "Not all of the books have rating presented");

    }

    @DataProvider(name = "getSearchTerms")
    public Object[][] getSearchTerms() throws Exception {
        return SearchTermsDataProvider.getAllSearchTerms();
    }

    @Test(groups = "main", dataProvider = "getSearchTerms")
    public void TC_3_verifySearchResult(String searchTerm) throws Exception {

        //Given user opens a browser and provides a valid url

        //When user provides a search term "go pro 4k" and clicks on search button
        goPro4kPage = homePage.searchForItem(GoPro4kPage.class, searchTerm);
        //and on the opened page with search result selects '4 stars up' rating
        goPro4k4StarsUpPage = goPro4kPage.setFourStarsUpRating();
        //and sets minimum price to '100'
        goPro4k4StarsUpPage = goPro4k4StarsUpPage.setPrice(minPrice);
        //and clicks 'go' button
        goPro4kFiltrated = goPro4k4StarsUpPage.clickGoButton();
        //Then only filtrated items are presented
        Assert.assertTrue(goPro4kFiltrated.isExpectedConditionsMet(), "Expected conditions weren't met");

    }

    @Test(groups = "main", suiteName = "ui")
    public void TC_4_NOT_DONE_verifyFilterOnMonitorsTopRatedResultsPage() throws Exception {
        //TEST CASE NOT DONE. NOTHING TO VERIFY
        //Given user opens a browser and provides a valid url

        //When user clicks on 'Electronics' link in the header
        electronicsPage = homePage.navigateToElectronicsPage();
        //And clicks on 'Computers & Accessories' link
        computersAndAccessoriesPage = electronicsPage.navigateToComputersAndAccessoriesPage();
        //And clicks on 'Monitors' Link
        monitorsPage = computersAndAccessoriesPage.navigateToMonitorsPage();
        //Then ...
        //TEST CASE NOT DONE. NOTHING TO VERIFY

    }

    @Test(groups = "main", suiteName = "ui")
    public void TC_5_verifyPrimeOption() throws Exception {
        //Given user opens a browser and provides a valid url

        //When user clicks on 'Electronics' link in the header
        electronicsPage = homePage.navigateToElectronicsPage();
        //And clicks on 'Computers & Accessories' link
        computersAndAccessoriesPage = electronicsPage.navigateToComputersAndAccessoriesPage();
        //And clicks on 'Tablets' Link
        tabletsPage = computersAndAccessoriesPage.navigateToTabletsPage();
        //And checks 'prime' check-box
        primeTabletsPage = tabletsPage.clickPrimeCheckBox();
        //Then all the items from the presented list have 'prime' and 'free' delivery labels
        Assert.assertTrue(primeTabletsPage.isListingPresentedContainPrimeAndDelivery(), "Not it has not");

    }

}