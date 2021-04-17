package tests;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;
/**
 * Created by onur on 12/03/21.
 */
public class InıtıalTest {
    private static WebDriver driver;
    public static HomePage homePage;

    @BeforeClass
    public static void setUp() {

        System.setProperty("webdriver.chrome.driver", "./src/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
        String actualTitle = driver.getTitle();
        String expectedTitle = "My Store";
        Assert.assertEquals(expectedTitle, actualTitle);
        homePage = new HomePage(driver);


    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }


}
