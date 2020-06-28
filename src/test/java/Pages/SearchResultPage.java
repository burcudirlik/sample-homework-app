package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage extends BasePage {

    private static final By FIRST_PRODUCT = By.xpath("//*[@class = 'productName']");

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public SearchResultPage selectFirstProduct(){
        clickBy(FIRST_PRODUCT);

        return this;
    }

}