package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertTrue;

public class PaymentPage extends BasePage {

    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    private static final By CARD_NUMBER_FIRST_INPUT = By.xpath("//*[@class = \"cardNumberInput -metrika-nokeys ui-input-numpad\" and @tabindex = 1 ]");
    private static final By CARD_NUMBER_SECOND_INPUT = By.xpath("//*[@class = \"cardNumberInput -metrika-nokeys ui-input-numpad\" and @tabindex = 2 ]");
    private static final By CARD_NUMBER_THIRD_INPUT = By.xpath("//*[@class = \"cardNumberInput -metrika-nokeys ui-input-numpad\" and @tabindex = 3 ]");
    private static final By CARD_NUMBER_FOURTH_INPUT = By.xpath("//*[@class = \"cardNumberInput -metrika-nokeys ui-input-numpad\" and @tabindex = 4 ]");
    private static final By MASTERPASS_INFO_POPUP_CANCEL_BUTTON = By.xpath("//*[@class = 'btn btnGrey cancel']");


    public PaymentPage fillThePaymentForm(String creditCardNumber, String expireMonth, String expireYear, String CVV){

        String[] parts = creditCardNumber.split("-");
        String part1 = parts[0];
        String part2 = parts[1];
        String part3 = parts[2];
        String part4 = parts[3];

        driver.findElement(CARD_NUMBER_FIRST_INPUT).sendKeys(part1);
        driver.findElement(CARD_NUMBER_SECOND_INPUT).sendKeys(part2);
        driver.findElement(CARD_NUMBER_THIRD_INPUT).sendKeys(part3);
        driver.findElement(CARD_NUMBER_FOURTH_INPUT).sendKeys(part4);
        setById("cardOwnerName", "Burcu Didi");

        Select expireMonthList = new Select(driver.findElement(By.id("expireMonth")));
        expireMonthList.selectByVisibleText(expireMonth);


        Select expireYearList = new Select(driver.findElement(By.id("expireYear")));
        expireYearList.selectByVisibleText(expireYear);

        setById("securityCode", CVV);


        return this;
    }

    public PaymentPage closeMasterpassInfoPopUp(){
        clickBy(MASTERPASS_INFO_POPUP_CANCEL_BUTTON);
        return this;
    }


}