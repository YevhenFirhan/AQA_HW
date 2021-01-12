package com.YevhenFirhanAQA.framework;

import com.YevhenFirhanAQA.pages.Page;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.lang.reflect.Constructor;

public class PageFactory {

    public static <T extends Page>T newPage(RemoteWebDriver driver, Class<T> clazz) throws Exception {
        return getNewInstance(driver, clazz);
    }
//TODO please remove redundant empty lines

    private static <T> T getNewInstance(RemoteWebDriver driver, Class<T> clazz) throws Exception {
        try {
            Constructor<T> constructor = clazz.getConstructor(RemoteWebDriver.class);
            constructor.setAccessible(true);
            return constructor.newInstance(driver);
        } catch (Exception ex) {
            throw new Exception(ex.getCause().toString(), ex);
        }
    }
}
