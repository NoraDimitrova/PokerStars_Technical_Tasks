package test.cases;

import com.telerikacademy.testframework.UserActions;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class BaseTestSetup {

    UserActions actions = new UserActions();

    @BeforeClass
    public static void setUp() {
        UserActions.loadBrowser("home.page");
    }


    @AfterClass
    public static void tearDown() {
        //UserActions.quitDriver();
    }
}
