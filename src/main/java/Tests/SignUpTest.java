package Tests;

import Commons.BaseTest;
import Pages.SignUpPage;
import org.testng.annotations.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SignUpTest extends BaseTest {

    private static final Logger logger = LoggerFactory.getLogger(SignUpTest.class);

    @Test
    public void signUpValid() throws InterruptedException {
        logger.info("Running SignUp Test");

        driver.get("https://www.demoblaze.com/index.html");
        Thread.sleep(3000);

        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.clickOsigninLink();
        signUpPage.enterUsername("mariami");
        signUpPage.enterPassword("passwordi");
        signUpPage.clickOnSignUpButton();
        Thread.sleep(2000);

        signUpPage.signUpAlert();
        Thread.sleep(2000);
    }
}
