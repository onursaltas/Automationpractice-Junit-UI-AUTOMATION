package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/**
 * Created by onur on 12/03/21.
 */
public class ProductPage {

    private WebDriver driver;
    private WebDriverWait wait;
    public static String productPrice;

    private By addBasketSummer = By.xpath("//div[@class='button-container']//a[@href='http://automationpractice.com/index.php?controller=cart&add=1&id_product=6&token=d0ae115fed875ef6411f0edac820ce2d']");
    private By findTshirt = By.xpath("//ul[contains(@class,'submenu-container')]/following::a[@title='T-shirts']");
    private By continueShopping = By.xpath("//span[@class='cross']");
    private By addBasketTshirt = By.xpath("//div[@class='button-container']//a[@href='http://automationpractice.com/index.php?controller=cart&add=1&id_product=1&token=d0ae115fed875ef6411f0edac820ce2d']");
    private By findBasket = By.xpath("//div[@class='button-container']//a[@href='http://automationpractice.com/index.php?controller=order']");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }




    public void clickAddBasketSummer() {

        wait.until(ExpectedConditions.elementToBeClickable(addBasketSummer));
        driver.findElement(addBasketSummer).click();
    }

    public void clickContinueShopping() {

        wait.until(ExpectedConditions.elementToBeClickable(continueShopping));
        driver.findElement(continueShopping).click();
    }


    public void clickTshirt() {

        wait.until(ExpectedConditions.elementToBeClickable(findTshirt));
        driver.findElement(findTshirt).click();
    }

    public void clickAddBasketTshirt() {

        wait.until(ExpectedConditions.elementToBeClickable(addBasketTshirt));
        driver.findElement(addBasketTshirt).click();
    }

    public BasketPage clickBasketPage() {

        wait.until(ExpectedConditions.elementToBeClickable(findBasket));
        driver.findElement(findBasket).click();
        return new BasketPage(driver);


    }
}
