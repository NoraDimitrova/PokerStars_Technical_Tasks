package com.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.Keys.ENTER;

public class LoginFormPage extends HomePage {

    public LoginFormPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void login() {

        String username = "Nora";
        String password = "nora11";
        String comment = "I wish you luck!";

        WebElement usernameField = webDriver.findElement(By.xpath("//input[@type='text']"));
        usernameField.sendKeys(username);

        WebElement passwordField = webDriver.findElement(By.xpath("//input[@type='password']"));
        passwordField.sendKeys(password);

        WebElement commentField = webDriver.findElement(By.xpath("//textarea[@name='comments']"));
        // Dynamic XPath: //*[@id="HTMLFormElements"]/table/tbody/tr[3]/td/textarea
        commentField.clear();
        commentField.sendKeys(comment);
        commentField.sendKeys(ENTER);
        commentField.sendKeys(username);
        commentField.sendKeys(ENTER);
        commentField.sendKeys(password);

        checkboxSwitchOff();
        // relative XPath:
        WebElement checkbox1 = webDriver.findElement(By.xpath("//input[@value='cb1']"));
        checkbox1.click();

        // absolute XPath:
        WebElement radioButton= webDriver.findElement(By.xpath("/html/body/div/div[3]/form/table/tbody/tr[6]/td/input[2]"));
        //this is relative XPath for the above radio button //input[@value='rd2']
        radioButton.click();

        multipleSelectValues();
        //dynamic XPath:
        WebElement item3 = webDriver.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[7]/td/select/option[3]"));
        // this is relative XPath for the above button //option[@value='ms3']
        item3.click();

        WebElement dropdownButton = webDriver.findElement(By.name("dropdown")); // XPath //select[@name='dropdown']
        dropdownButton.click();

        WebElement dropdownItem4 = webDriver.findElement(By.xpath("//option[@value='dd4']"));
        dropdownItem4.click();

        WebElement submitButton = webDriver.findElement(By.xpath("//input[@type='submit']"));
        submitButton.click();



    }

    private void multipleSelectValues() {
        WebElement item1 = webDriver.findElement(By.xpath("//option[@value='ms1']"));
        WebElement item2 = webDriver.findElement(By.xpath("//option[@value='ms2']"));
        WebElement item3 = webDriver.findElement(By.xpath("//option[@value='ms3']"));
        WebElement item4 = webDriver.findElement(By.xpath("//option[@value='ms4']"));

        if (item1.isSelected()) {
            item1.click();
        } else if (item2.isSelected()) {
            item2.click();
        } else if (item3.isSelected()) {
            item3.click();
        } else if (item4.isSelected()) {
            item4.click();
        }
    }

    private void checkboxSwitchOff() {
        WebElement checkbox1 = webDriver.findElement(By.xpath("//input[@value='cb1']"));
        WebElement checkbox2 = webDriver.findElement(By.xpath("//input[@value='cb2']"));
        WebElement checkbox3 = webDriver.findElement(By.xpath("//input[@value='cb3']"));
        if (checkbox1.isSelected()) {
            checkbox1.click();
        } else if (checkbox2.isSelected()) {
            checkbox2.click();
        } else if (checkbox3.isSelected()) {
            checkbox3.click();
        }
    }

}
