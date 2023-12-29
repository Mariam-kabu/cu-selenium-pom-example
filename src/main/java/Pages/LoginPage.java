package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private final WebDriver driver;
    private final By loginLink = By.id("login2");
    private final By usernameField = By.id("loginusername");
    private final By passwordField = By.id("loginpassword");
    private final By loginButton = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
    private final By logoutLink = By.id("logout2");
    private final By userNameDisplay = By.id("nameofuser");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
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

    public void clickOnLogoutLink() {
        driver.findElement(logoutLink).click();
    }

    public String getUserName() {
        return driver.findElement(userNameDisplay).getText();
    }
    
    public boolean isLoginSuccessful() {
        // Implement logic to check if login is successful on the new webpage
        // You might need to add a specific condition to verify successful login
        // For example, you can check if the logout link is displayed after login
        return driver.findElement(logoutLink).isDisplayed();
    }

    public StorePage login(String username, String password) {
        clickOnLoginLink();  // Click on the login link to open the login modal
        enterUsername(username);  // Enter the username
        enterPassword(password);  // Enter the password
        clickOnLoginButton();  // Click on the login button
        return new StorePage(driver);  // Return a new instance of StorePage after successful login
    }
}
