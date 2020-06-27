package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class LoginPage extends BasePage {

    private static final By LOGIN_BUTTON = By.id("loginButton");
    private static final By MENU_LINK_USER = By.xpath("//*[@class = 'menuLink user']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage login(){
        setById("email", "baba@baba.com");
        setById("password", "123qwe");
        clickBy(LOGIN_BUTTON);

        String user = driver.findElement(MENU_LINK_USER).getText();
        assertTrue(user.contains("burcu"));

        return this;
    }

}