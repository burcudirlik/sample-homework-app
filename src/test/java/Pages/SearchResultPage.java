package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage extends BasePage {

    private static final By FIRST_PRODUCT = By.xpath("//*[@class = 'productName']");
    private static final By ADD_BASKET_BUTTON = By.xpath("//*[@class = 'btn btnGrey addBasketUnify']");

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public SearchResultPage selectFirstProduct(){
        clickBy(FIRST_PRODUCT);

        return this;
    }

    public SearchResultPage addToBasket(){
        clickBy(ADD_BASKET_BUTTON);
        return this;
    }



}