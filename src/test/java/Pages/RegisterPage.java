package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;


public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public RegisterPage register(String firstName, String lastName, String registrationEmail, String registrationPassword, String passwordAgain, String phoneNumber, String cinsiyet, String captcha){

        setById("firstName", firstName);
        setById("lastName", lastName);
        setById("registrationEmail", registrationEmail);
        setById("registrationPassword", registrationPassword);
        setById("passwordAgain", passwordAgain);
        typeById("phoneNumber", phoneNumber);
        scrollDown();
        clickBy(By.xpath("//*[contains(text(), '"+cinsiyet+"')]"));
        clickBy(By.xpath("//*[@id=\"registerForm\"]/div[9]/div[1]/label"));
        typeById("captchaText",captcha);
        clickBy(By.id("submitButton"));

        String user = driver.findElement(By.xpath("//*[@class = 'menuLink user']")).getText();
        assertTrue(user.contains(firstName + " " + lastName));

        return this;
    }

}

