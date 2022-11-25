package test.cases;

import org.junit.Assert;
import org.junit.Test;
import pages.LoginForm;

public class LoginTest extends BaseTestSetup {

    @Test
    public void loginTest() {
        LoginForm loginForm = new LoginForm(actions.getDriver());
        loginForm.login("user");
        Assert.assertEquals("Processed Form Details are visible", "//h1[contains(text(), 'Processed Form Details')]",
                "//h1[contains(text(), 'Processed Form Details')]");

    }
}
