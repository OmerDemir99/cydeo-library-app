package com.cydeo.library.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {

    public static void waitForVisibilityOf(WebElement webElement){

        //Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public static void verifyUrlWithContains(String expectedInUrl){
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInUrl));
    }
}
