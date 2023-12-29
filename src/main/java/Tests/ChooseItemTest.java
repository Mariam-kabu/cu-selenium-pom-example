package Tests;

import Commons.BaseTest;
import Pages.LoginPage;
import Pages.StorePage;
import org.testng.annotations.Test;

public class ChooseItemTest extends BaseTest {


    @Test
    public void chooseCategoryAndClickFirstItem() throws InterruptedException {
        driver.get("https://www.demoblaze.com/index.html");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("admin", "admin");
        Thread.sleep(5000);

        StorePage storePage = new StorePage(driver);
        storePage.selectCategory();
        Thread.sleep(5000);

        storePage.clickOnFirstItem();
        Thread.sleep(5000);
    }
}
