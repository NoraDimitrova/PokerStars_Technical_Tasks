import com.project.pages.LoginFormPage;
import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class LoginFormTest extends BaseTestSetUp {

    @Test
    public void loginTest() {

        LoginFormPage loginFormPage = new LoginFormPage(webDriver);
        loginFormPage.login();
        assertEquals("Processed Form Details are visible", "//h1[contains(text(), 'Processed Form Details')]",
                "//h1[contains(text(), 'Processed Form Details')]");

    }

}
