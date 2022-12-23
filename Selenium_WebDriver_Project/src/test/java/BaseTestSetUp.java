import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestSetUp {

    protected WebDriver webDriver;

    @BeforeClass
    public static void classSetup() {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
    }

    @Before
    public void setUp() {
        webDriver = new ChromeDriver();
//        webDriver = new FirefoxDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().deleteAllCookies();
        webDriver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
    }


    @After
    public void tearDown() {
        webDriver.quit();
    }

}
