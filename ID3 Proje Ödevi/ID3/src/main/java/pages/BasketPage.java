package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by onur on 12/03/21.
 */
public class BasketPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By SummerDressesNameActual = By.xpath("//tr[@id='product_6_31_0_462085']//child::td[2]//child::p/a");
    private By SummerDressesPriceActual = By.id("product_price_6_31_462085");
    private By TshirtNameActual = By.xpath("//tr[@id='product_1_1_0_462085']//child::td[2]//child::p/a");
    private By TshirtDressesPriceActual = By.id("product_price_1_1_462085");

    private By findTotalPrice = By.id("total_price_container");
    private By findTotalShipping = By.id("total_shipping");
    private By findTotalTax = By.id("total_tax");

    private String ExptectedSummerName = "Printed Summer Dress";
    private String ExptectedSummerPrice = "$30.50";
    private String ExpectedTshirtName = "Faded Short Sleeve T-shirts";
    private String ExpectedTshirtPrice = "$16.51";
    private String ExpectedTotalPrice = "$49.01";
   public BasketPage(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }


    public void CompareSummerDressesName() {

        wait.until(ExpectedConditions.presenceOfElementLocated(SummerDressesNameActual));
        String actualSummerName = driver.findElement(SummerDressesNameActual).getText();
        Assert.assertEquals(ExptectedSummerName, actualSummerName);
    }

    public void CompareSummerDressesPrice() {

        wait.until(ExpectedConditions.presenceOfElementLocated(SummerDressesPriceActual));
        String actualSummerPrice = driver.findElement(SummerDressesPriceActual).getText();
        Assert.assertEquals(ExptectedSummerPrice, actualSummerPrice);
    }

    public void CompareTshirtName() {

        wait.until(ExpectedConditions.presenceOfElementLocated(TshirtNameActual));
        String actualTshirtName = driver.findElement(TshirtNameActual).getText();
        Assert.assertEquals(ExpectedTshirtName, actualTshirtName);
    }

    public void CompareTshirtPrice() {

        wait.until(ExpectedConditions.presenceOfElementLocated(TshirtDressesPriceActual));
        String actualTshirtPrice = driver.findElement(TshirtDressesPriceActual).getText();
        Assert.assertEquals(ExpectedTshirtPrice, actualTshirtPrice);
    }

    public void CompareTotalPrice() {

        wait.until(ExpectedConditions.presenceOfElementLocated(findTotalPrice));
        String actualTotalPrice = driver.findElement(findTotalPrice).getText();
        Assert.assertEquals(ExpectedTotalPrice, actualTotalPrice);
        /*String actualSummerPrice = driver.findElement(SummerDressesPriceActual).getText();
        String actualTshirtPrice = driver.findElement(TshirtDressesPriceActual).getText();
        String actualTotalShipping = driver.findElement(findTotalShipping).getText();
        String actualTotalTax = driver.findElement(findTotalTax).getText();*/

    }




}
