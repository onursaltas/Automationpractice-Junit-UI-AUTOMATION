package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by onur on 12/03/21.
 */
public class HomePage {

    private WebDriverWait wait;
    private WebDriver driver;

    private By login= By.xpath("//a[@href='http://automationpractice.com/index.php?controller=my-account']");



    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    public LoginPage clickLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(login));
        driver.findElement(login).click();
        return new LoginPage(driver);
    }
}
