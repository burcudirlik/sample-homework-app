package Scenerios;

import Pages.HomePage;
import org.junit.Test;

public class RegisterTest extends BaseTest_QA {

    @Test
    public void registerTest(){

        new HomePage(driver)
                .callRegisterPage()
                .register("burcu","dirlik","burcutest8@n11.com",
                        "123qwe","123qwe","345834696","Kadın","N11");
    }

}
