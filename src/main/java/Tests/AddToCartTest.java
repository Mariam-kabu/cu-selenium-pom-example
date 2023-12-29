package Tests;

import Commons.BaseTest;
import Pages.LoginPage;
import Pages.ItemPage;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {

    @Test
    public void checkCart() throws InterruptedException {
        driver.get("https://www.demoblaze.com/prod.html?idp_=10");
        Thread.sleep(5000);

        LoginPage loginPage = new LoginPage(driver);
        if (!loginPage.isLoginSuccessful()) {
            loginPage.login("admin", "admin");
            Thread.sleep(2000);
        }

        ItemPage itemPage = new ItemPage(driver);
        itemPage.addToCartElement();
        Thread.sleep(2000);

        itemPage.addFirstProductToCart();
        Thread.sleep(2000);

    }
}
