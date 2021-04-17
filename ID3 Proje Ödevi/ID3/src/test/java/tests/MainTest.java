package tests;

import org.junit.Test;
import pages.*;
/**
 * Created by onur on 12/03/21.
 */

public class MainTest extends InıtıalTest {

    @Test
    public void ID3_Project_Test_Scenario_1() {


        LoginPage loginPage = homePage.clickLogin();                   //InıtıalTest : BeforeClass ve AfterClass tanımlamaları yapıldı.

        loginPage.Username("qquestionanswerr@gmail.com");             //Kullanıcı adı girildi.
        loginPage.Password("asdf1?");                                 //Şifre girildi.

        PrimaryPage primaryPage = loginPage.LoginButton();            //"Giriş Yap" butonuna tıklandı ve primaryPage tarafına atandı.
        primaryPage.assertAccountName();                              //Login işlemi kontrol edildi.
        primaryPage.clickDress();                                     //Dresses tıklandı.

        ProductPage productPage = primaryPage.clickSummerDresses();   //Summer Dresses tıklandı ve productPage ' e atandı.
        productPage.clickAddBasketSummer();                           //İkinci sırada yer alan ürün sepete eklenir.
        productPage.clickContinueShopping();                          //Sepete ürün ekledikten sonra Pop up kapatılır.
        productPage.clickTshirt();                                    //T-Shirt bölümüne geçildi.
        productPage.clickAddBasketTshirt();                           //T-Shirt sepete atıldı.

        BasketPage basketPage = productPage.clickBasketPage();        //Sepetime Tıklandı
        basketPage.CompareSummerDressesName();                        //Summer Dress ismi karşılaştırıldı.
        basketPage.CompareSummerDressesPrice();                       //Summer Dress fiyatı karşılaştırıldı.
        basketPage.CompareTshirtName();                               //Tshirt ismi karşılaştırıldı.
        basketPage.CompareTshirtPrice();                              //Tshirt fiyatı karşılaştırıldı.
        basketPage.CompareTotalPrice();                               //Toplam fiyat kontrol edilir.


    }

}
                                                            //CASE SENARYO
/*
1. http://automationpractice.com/ sitesine gidilir.
2. Sağ üst köşeden “Sign-in” tıklanır.
3. Email ve password girilerek giriş yapılır.
4. http://automationpractice.com/index.php?controller=my-account adresine yönlendirdiği
kontrol edilir.
5. Dresses altında summer dresses kategorisine gidilir.
6. İkinci sırada yer alan ürün sepete eklenir.
7. T-shirt kategorisine gidilir.
8. Bir ürün sepete eklenir.
9. Sepete gidilir ve sepete eklenen ürünlerin fiyat, ürün adı ve ürün tutar toplamı alanlarıyla doğru
geldiği kontrol edilir.
 */