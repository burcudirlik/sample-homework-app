package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage extends BasePage {

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public SearchResultPage selectFirstProduct(){
        clickBy(By.xpath("//*[@class = 'productName']"));

        return this;
    }

    public SearchResultPage addToBasket(){
        clickBy(By.xpath("//*[@class = 'btn btnGrey addBasketUnify']"));
        return this;
    }



}