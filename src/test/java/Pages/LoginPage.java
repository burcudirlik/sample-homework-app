package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage login(){
        setById("email", "baba@baba.com");
        setById("password", "123qwe");
        clickBy(By.id("loginButton"));

        String user = driver.findElement(By.xpath("//*[@class = 'menuLink user']")).getText();
        assertTrue(user.contains("burcu"));

        return this;
    }

}