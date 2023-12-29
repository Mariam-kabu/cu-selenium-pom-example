package Tests;

import Commons.BaseTest;
import Pages.LoginPage;
import Pages.StorePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginTest extends BaseTest {

    private static final Logger logger = LoggerFactory.getLogger(LoginTest.class);

    @Test
    public void loginValid() {
        logger.info("Running Test 1");
        driver.get("https://www.demoblaze.com/index.html");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickOnLoginLink();
        loginPage.enterUsername("admin");
        loginPage.enterPassword("admin");
        loginPage.clickOnLoginButton();

        // Assuming isLoginSuccessful returns a boolean indicating the success of login
        Assert.assertTrue(loginPage.isLoginSuccessful(), "Login was not successful");
        Assert.assertEquals(loginPage.getUserName(), "Expected Username");
    }
}
