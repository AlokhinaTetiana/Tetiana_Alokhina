package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void navigateTo_LoginPage() {
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
    }
    @FindBy(name = "username")
    WebElement nameField;

    @FindBy(name = "password")
    WebElement passwordField;

    @FindBy(className = "orangehrm-login-button")
    WebElement loginButton;

    public void inputName(String name) {
        nameField.sendKeys(name);
    }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
