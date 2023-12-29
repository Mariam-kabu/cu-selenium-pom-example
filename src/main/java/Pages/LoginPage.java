package Pages;

import org.openqa.selenium.*;

public class LoginPage {

    private final WebDriver driver;
    private final By loginLink = By.id("login2");
    private final By usernameField = By.id("loginusername");
    private final By passwordField = By.id("loginpassword");
    private final By loginButton = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public Boolean isLoginSuccessful() {
        try {
            Alert alert = driver.switchTo().alert();
            System.out.println("Alert message: " + alert.getText());
            alert.accept(); // Accept the alert (close it)
            return false;    // Assuming an alert means login failure
        } catch (NoAlertPresentException e) {
            return true;     // No alert means login success
        }
    }

    public void clickOnLoginLink() {
        driver.findElement(loginLink).click();
    }

    public void enterUsername(String username) {
        WebElement usernameElement = driver.findElement(usernameField);
        usernameElement.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passwordElement = driver.findElement(passwordField);
        passwordElement.sendKeys(password);
    }

    public void clickOnLoginButton() {
        driver.findElement(loginButton).click();
    }

    public StorePage login(String username, String password) {
        clickOnLoginLink();  // Click on the login link to open the login modal
        enterUsername(username);  // Enter the username
        enterPassword(password);  // Enter the password
        clickOnLoginButton();  // Click on the login button
        return new StorePage(driver);  // Return a new instance of StorePage after successful login
    }
}
