package pages;

import com.telerikacademy.testframework.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginForm extends BaseHomePage {

    public LoginForm(WebDriver driver) {
        super(driver, "home.page");
    }

    public void login(String user) {

        String username = Utils.getConfigPropertyByKey("username." + user);
        String password = Utils.getConfigPropertyByKey("password." + user);
        String comment = Utils.getConfigPropertyByKey("comment." + user);

        actions.waitForElementClickable("//input[@type='text']");
        actions.clickElement("//input[@type='text']");
        actions.typeValueInField(username, "//input[@type='text']");
        actions.typeValueInField(password, "//input[@type='password']");
        actions.typeValueInField(comment, "//textarea[@name='comments']");

        checkboxSwitchOff();
        actions.clickElement("//input[@value='cb1']"); // XPath for checkbox 1
        actions.clickElement("//input[@value='rd2']"); // XPath for radio button 2 // /html/body/div/div[3]/form/table/tbody/tr[6]/td/input[2]
        multipleSelectValues();
        actions.clickElement("//option[@value='ms3']"); // XPath for selection item 3
        actions.clickElement("//select[@name='dropdown']");
        actions.clickElement("//option[@value='dd4']"); // XPath for Dropdown item 4:
        actions.clickElement("//input[@type='submit']");
        //Assert
        actions.assertElementPresent("//h1[contains(text(), 'Processed Form Details')]");
        actions.assertElementPresent("//a[@id='back_to_form']");

    }

    private void multipleSelectValues() {
        WebElement item1 = driver.findElement(By.xpath("//option[@value='ms1']"));
        WebElement item2 = driver.findElement(By.xpath("//option[@value='ms2']"));
        WebElement item3 = driver.findElement(By.xpath("//option[@value='ms3']"));
        WebElement item4 = driver.findElement(By.xpath("//option[@value='ms4']"));

        if (item1.isSelected()) {
            actions.clickElement("//option[@value='ms1']");
        } else if (item2.isSelected()) {
            actions.clickElement("//option[@value='ms2']");
        } else if (item3.isSelected()) {
            actions.clickElement("//option[@value='ms3']");
        } else if (item4.isSelected()) {
            actions.clickElement("//option[@value='ms4']");
        }
    }

    private void checkboxSwitchOff() {
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@value='cb1']"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@value='cb2']"));
        WebElement checkbox3 = driver.findElement(By.xpath("//input[@value='cb3']"));
        if (checkbox1.isSelected()) {
            actions.clickElement("//input[@value='cb1']");
        } else if (checkbox2.isSelected()) {
            actions.clickElement("//input[@value='cb2']");
        } else if (checkbox3.isSelected()) {
            actions.clickElement("//input[@value='cb3']");
        }
    }


}
