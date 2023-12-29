package Tests;

import Commons.BaseTest;
import Pages.LoginPage;
import Pages.StorePage;
import org.testng.annotations.Test;

public class AddToCart extends BaseTest {

    @Test
    public void checkCart() throws InterruptedException {
        driver.get("https://www.demoblaze.com/index.html");
        Thread.sleep(2000);

        LoginPage loginPage = new LoginPage(driver);
        StorePage storePage = loginPage.login("admin", "admin");

        storePage.addFirstProductToCart();
        Thread.sleep(2000);

        // Assuming extractNumberFromElementText returns an integer
        int cartItemCount = storePage.extractNumberFromElementText();
        // Add assertions or log the cartItemCount as needed
    }
}
