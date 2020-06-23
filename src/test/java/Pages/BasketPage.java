package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class BasketPage extends BasePage {

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public BasketPage seeCoupons(){

        driver.navigate().refresh();
        clickBy(By.xpath("//*[@class=\"btn btnBlack js-getCouponsBtn mid\"]"));
        clickBy(By.xpath("//*[@class=\"btn  btnGreen big js-updateBenefits\"]"));

        return this;
    }

    public BasketPage clickNewAddress(){
        scrollDown();
        clickBy(By.xpath("//*[@class = 'info']"));

        return this;
    }

    public BasketPage goToPayment(){
        clickBy(By.id("js-goToPaymentBtn"));

        return this;
    }
}