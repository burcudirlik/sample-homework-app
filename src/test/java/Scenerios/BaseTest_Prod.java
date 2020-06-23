package Scenerios;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest_Prod {

    public WebDriver driver;

    @Before
    public void before() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.n11.com/");
        Thread.sleep(5000);
    }

    @After
    public void after(){
        driver.quit();
    }
}


