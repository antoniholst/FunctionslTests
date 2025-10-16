package tests;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import static org.testng.Assert.assertEquals;

public class LoginTests extends BaseTests {
    @Test
    public void verifySuccessfulLogin(){
        LoginPage loginPage = new LoginPage(driver);
        assertEquals(loginPage.login("tone4ka.selyova@yandex.ru",
                "eA@k_fZPU@VNP8i").getTitle(),"Лента");
    }
}
