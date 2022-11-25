package com.telerikacademy.testframework;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.telerikacademy.testframework.Utils.LOGGER;
import static com.telerikacademy.testframework.Utils.getConfigPropertyByKey;
import static java.lang.String.format;

public class CustomWebDriverManager {

    public enum CustomWebDriverManagerEnum {

        INSTANCE;
        private WebDriver driver = setupBrowser();

        public void quitDriver() {
            if (driver != null) {
                driver.quit();
                driver = null;
            }
        }

        public WebDriver getDriver() {
            if (driver == null) {
                setupBrowser();
            }
            return driver;
        }

        private WebDriver setupBrowser() {
            String driverName = getConfigPropertyByKey("config.driver");
            WebDriver webDriver;
            if (driverName.equals("chrome")) {
                WebDriverManager.chromedriver().setup();
                webDriver = new ChromeDriver();
            } else {
                WebDriverManager.firefoxdriver().setup();
                webDriver = new FirefoxDriver();
            }

            webDriver.manage().window().maximize();

            LOGGER.info(format("%s driver is initialized.", driverName));
            driver = webDriver;
            return webDriver;
        }
    }
}
