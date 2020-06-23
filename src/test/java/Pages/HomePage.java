package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage closeTheWindow(){
        clickBy(By.className("closeBtn"));
        return this;
    }

    public HomePage search(String keyword){
        setById("searchData",keyword);
        clickBy(By.className("searchBtn"));

        return this;
    }

    public HomePage goToBasket(){
        clickBy(By.className("myBasket"));
        return this;
    }

    public HomePage closePopUp(){
        clickBy(By.className("seg-popup-close"));
        return this;
    }

    public LoginPage callLoginPage(){
        clickBy(By.className("btnSignIn"));
        return new LoginPage(driver);
    }

    public RegisterPage callRegisterPage(){
        clickBy(By.className("btnSignUp"));
        return new RegisterPage(driver);
    }

}