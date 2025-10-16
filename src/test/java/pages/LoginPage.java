package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By emailInput = By.cssSelector("input[autocomplete=\"username\"]");
    private By passwordInput = By.cssSelector("input[type=\"password\"]");
    private By signInButton = By.className("login__btn");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage login(String email, String password) {
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(signInButton).click();
        return new HomePage(driver);
    }
}
