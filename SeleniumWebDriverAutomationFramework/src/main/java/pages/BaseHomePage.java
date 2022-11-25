package pages;

import com.telerikacademy.testframework.pages.BasePage;
import org.openqa.selenium.WebDriver;

public abstract class BaseHomePage extends BasePage {
    public BaseHomePage(WebDriver driver, String urlKey) {
        super(driver, urlKey);
    }
}
