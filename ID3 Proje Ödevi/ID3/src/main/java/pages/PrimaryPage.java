package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by onur on 12/03/21.
 */
public class PrimaryPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By findSummerDresses = By.xpath("//div[@class='block_content']//a[@href='http://automationpractice.com/index.php?id_category=11&controller=category']");
    private By findDresses = By.xpath("//ul[contains(@class,'submenu-container')]/preceding-sibling::a[@title='Dresses']");
    private By accountNameField = By.xpath("//div[@class='header_user_info']//a[@href='http://automationpractice.com/index.php?controller=my-account']");

    String expectedAccountName = "Onur Proje";

    public PrimaryPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    public void assertAccountName() {

        wait.until(ExpectedConditions.presenceOfElementLocated(accountNameField));
        String actualAccountName = driver.findElement(accountNameField).getText();
        Assert.assertEquals(expectedAccountName, actualAccountName);
    }

    public void clickDress() {

        wait.until(ExpectedConditions.elementToBeClickable(findDresses));
        driver.findElement(findDresses).click();
    }

    public ProductPage clickSummerDresses() {

        wait.until(ExpectedConditions.elementToBeClickable(findSummerDresses));
        driver.findElement(findSummerDresses).click();
        return new ProductPage(driver);

    }


}
