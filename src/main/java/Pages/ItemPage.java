package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemPage {
    private final WebDriver driver;
    private final By cartBtn = By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a");

    public ItemPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCartElement() {driver.findElement(cartBtn).click();}

    public void addFirstProductToCart() {
        // Check if an alert is present and accept it
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert message: " + alert.getText());
        alert.accept();
    }


}
