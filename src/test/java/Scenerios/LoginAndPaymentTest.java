package Scenerios;

import Pages.*;
import org.junit.Test;


public class LoginAndPaymentTest extends BaseTest_Prod {

    @Test
    public void loginTest() throws InterruptedException {

        new HomePage(driver)
                .closeTheWindow()
                .callLoginPage()
                .login();

        new HomePage(driver)
                .closePopUp()
                .search("televizyon");

        new SearchResultPage(driver)
                .selectFirstProduct()
                .addToBasket();

        new HomePage(driver)
                .goToBasket();

        new BasketPage(driver)
                .seeCoupons()
                .clickNewAddress();

        new NewAddressPage(driver)
                .addNewAddress("Türkiye", "İstanbul", "Bahçelievler","Cumhuriyet");

        new BasketPage(driver)
                .goToPayment();
        new PaymentPage(driver)
                .closeMasterpassInfoPopUp()
                .fillThePaymentForm("4022-7740-2277-4026","12","2020","000");

}

}
