package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class NewAddressPage extends BasePage {

    private static final By SAVE_ADDRESS_BUTTON = By.xpath("//*[@class = 'btn btnBlack js-saveAddressBtn']");

    public NewAddressPage(WebDriver driver) {
        super(driver);
    }

    public NewAddressPage addNewAddress(String country, String city, String district, String neighbourhood) throws InterruptedException {

        setById("fullName","burcu dirlik");

        Select countryList = new Select(driver.findElement(By.id("countryCode")));
        countryList.selectByVisibleText(country);

        Select cityList = new Select(driver.findElement(By.id("cityId")));
        cityList.selectByVisibleText(city);

        Thread.sleep(1000);
        selectByIdFromDropDownList("districtId", district);

        Thread.sleep(1000);
        selectByIdFromDropDownList("neighbourhoodId",neighbourhood);

        setById("addressDetail","örnek adres test test");
        typeById("gsm","345834696");
        setById("tcNO","20237081856");
        setById("addressName","Burcu Adres 2");

        clickBy(SAVE_ADDRESS_BUTTON);

        return this;
    }

}