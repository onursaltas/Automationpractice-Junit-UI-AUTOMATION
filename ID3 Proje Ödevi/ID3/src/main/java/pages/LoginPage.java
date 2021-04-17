package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * Created by onur on 12/03/21.
 */
public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By nameField = By.id("email");
    private By passwordField = By.id("passwd");
    private By loginButton = By.id("SubmitLogin");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    //Name girilir.
    public void Username(String name) {

        wait.until(ExpectedConditions.presenceOfElementLocated(nameField));
        ;
        driver.findElement(nameField).sendKeys(name);
    }

    //Şifre girilir
    public void Password(String password) {

        wait.until(ExpectedConditions.presenceOfElementLocated(passwordField));
        driver.findElement(passwordField).sendKeys(password);
    }



    //"Giriş Yap" butonuna tıklanır.
    public PrimaryPage LoginButton() {

        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        driver.findElement(loginButton).click();
        return new PrimaryPage(driver);
    }
}
