package Pages;

import TestBase.Support;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class Login extends Support {


    public Login(WebDriver driver) throws IOException, ParseException {
        super(driver);
    }


    @FindBy(xpath = "//input[@data-testid=\"email\"]")
    public WebElement email;

    @FindBy(xpath = "//input[@data-testid=\"password\"]")
    public WebElement passwordField;

    @FindBy(xpath = "//button[@data-testid=\"submit\"]")
    public WebElement loginButton;

    @FindBy(xpath = "//h2[@data-testid=\"welcome\"]")
    public WebElement welcomeMassage;

    public void loginSuccessfully() {
        System.out.println(url + "sara");
        driver.get(url);
        this.email.sendKeys(username);
        this.passwordField.sendKeys(password);
        this.loginButton.click();
    }
}
