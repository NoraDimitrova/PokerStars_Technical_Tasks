package com.telerikacademy.testframework.pages;

import com.telerikacademy.testframework.UserActions;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static com.telerikacademy.testframework.Utils.LOGGER;
import static com.telerikacademy.testframework.Utils.getConfigPropertyByKey;
import static java.lang.String.format;

public abstract class BasePage {

    protected String url;
    protected WebDriver driver;
    public UserActions actions;

    public BasePage(WebDriver driver, String urlKey) {
        String pageUrl = getConfigPropertyByKey(urlKey);
        this.driver = driver;
        this.url = pageUrl;
        actions = new UserActions();
    }

    public String getUrl() {
        return url;
    }

    public void navigateToPage() {
        this.driver.get(url);
    }

    public void navigateToPage(String url) {
        this.driver.get(url);
    }

    public void assertNavigatedUrl() {
        String currentUrl = driver.getCurrentUrl();
        LOGGER.info(format("Landed URL: %s", currentUrl));

        Assert.assertTrue("Landed URL is not as expected. Actual URL: " + currentUrl + ". Expected URL: " + url,
            currentUrl.contains(url));
    }
}
