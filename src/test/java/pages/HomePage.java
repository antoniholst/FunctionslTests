package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By tapeField = By.cssSelector(".text-head-1.row");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTitle(){
        return driver.findElement(tapeField).getText();
    }

}
