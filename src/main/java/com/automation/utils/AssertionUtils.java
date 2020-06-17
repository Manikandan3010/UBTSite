package com.automation.utils;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class AssertionUtils {
    public static void assertPresent(WebElement element) {
        waitForVisible(element);
        Assert.assertTrue(String.format("Element %s should be displayed !!!", element.getText()), element.isDisplayed());
    }

    private static void waitForVisible(WebElement element) {
    }
}