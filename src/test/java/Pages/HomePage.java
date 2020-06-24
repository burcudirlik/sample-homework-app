package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private static final By CLOSE_BUTTON = By.className("closeBtn");
    private static final By SEARCH_BUTTON = By.className("searchBtn");
    private static final By MY_BASKET = By.className("myBasket");
    private static final By CLOSE_POP_UP = By.className("seg-popup-close");
    private static final By SIGN_IN_BUTTON = By.className("btnSignIn");
    private static final By SIGN_UP_BUTTON = By.className("btnSignUp");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage closeTheWindow(){
        clickBy(CLOSE_BUTTON);
        return this;
    }

    public HomePage search(String keyword){
        setById("searchData",keyword);
        clickBy(SEARCH_BUTTON);

        return this;
    }

    public HomePage goToBasket(){
        clickBy(MY_BASKET);
        return this;
    }

    public HomePage closePopUp(){
        clickBy(CLOSE_POP_UP);
        return this;
    }

    public LoginPage callLoginPage(){
        clickBy(SIGN_IN_BUTTON);
        return new LoginPage(driver);
    }

    public RegisterPage callRegisterPage(){
        clickBy(SIGN_UP_BUTTON);
        return new RegisterPage(driver);
    }

}