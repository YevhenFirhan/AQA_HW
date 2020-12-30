package com.YevhenFirhanAQA;

import com.YevhenFirhanAQA.listeners.TestListener;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import static org.apache.commons.lang3.SystemUtils.IS_OS_MAC;
import static org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS;
import static org.apache.commons.lang3.SystemUtils.IS_OS_LINUX;

@Listeners(TestListener.class)
public abstract class BaseTest {

    protected RemoteWebDriver driver = null;

    @BeforeMethod(alwaysRun = true)
    public void setup() {
        if (IS_OS_MAC || IS_OS_LINUX) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        } else if (IS_OS_WINDOWS) {
            System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
        }
        driver = new ChromeDriver();
//        driver.manage().window().maximize();
        System.out.println("setup");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        System.out.println("teardown");
    }
}
