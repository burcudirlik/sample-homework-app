package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {

    private static final By ADD_BASKET_BUTTON = By.xpath("//*[@class = 'btn btnGrey addBasketUnify']");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }


    public ProductDetailPage addToBasket(){
        clickBy(ADD_BASKET_BUTTON);
        return this;
    }



}