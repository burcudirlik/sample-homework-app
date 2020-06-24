package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class BasketPage extends BasePage {

    private static final By SEE_COUPONS_BUTTON = By.xpath("//*[@class=\"btn btnBlack js-getCouponsBtn mid\"]");
    private static final By SEE_COUPONS_PAGE_CLOSE_BUTTON = By.xpath("//*[@class=\"btn  btnGreen big js-updateBenefits\"]");
    private static final By ADD_NEW_ADDRESS_LINK = By.xpath("//*[@class = 'info']");
    private static final By GO_TO_PAYMENT_BUTTON = By.id("js-goToPaymentBtn");

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public BasketPage seeCoupons(){

        driver.navigate().refresh();
        clickBy(SEE_COUPONS_BUTTON);
        clickBy(SEE_COUPONS_PAGE_CLOSE_BUTTON);

        return this;
    }

    public BasketPage clickNewAddress(){
        scrollDown();
        clickBy(ADD_NEW_ADDRESS_LINK);

        return this;
    }

    public BasketPage goToPayment(){
        clickBy(GO_TO_PAYMENT_BUTTON);

        return this;
    }
}