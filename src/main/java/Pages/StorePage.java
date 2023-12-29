package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StorePage {

    private final WebDriver driver;
    private final By firstItemLink = By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/a/img");
    private final By categoryName = By.xpath("/html/body/div[5]/div/div[1]/div/a[4]");

    public StorePage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectCategory() {
        WebElement categoryElement = driver.findElement(categoryName);
        categoryElement.click();
    }


    public void clickOnFirstItem() {
        WebElement firstItemElement = driver.findElement(firstItemLink);
        firstItemElement.click();
    }
}
