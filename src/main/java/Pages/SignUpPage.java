package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {

    private final WebDriver driver;
    private final By signinLink = By.id("signin2");
    private final By usernameField = By.id("sign-username");
    private final By passwordField = By.id("sign-password");
    private final By signUpButton = By.xpath("//*[@id='signInModal']/div/div/div[3]/button[2]");

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOsigninLink() {
        driver.findElement(signinLink).click();
    }

    public void enterUsername(String username) {
        WebElement usernameElement = driver.findElement(usernameField);
        usernameElement.sendKeys(username);
    }

    public void enterPassword(String password) {
        WebElement passwordElement = driver.findElement(passwordField);
        passwordElement.sendKeys(password);
    }

    public void clickOnSignUpButton() {
        driver.findElement(signUpButton).click();
    }

    public void signUpAlert() {
        // Check if an alert is present and accept it
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert message: " + alert.getText());
        alert.accept();
    }
}
