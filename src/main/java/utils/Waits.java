package utils;

import core.ReadProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class Waits {
    private WebDriver driver;
    private WebDriverWait wait;

    public Waits(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, ReadProperties.getTimeOut());
    }

    public Waits(WebDriverWait wait) {
        this.wait = wait;
    }

    public boolean waitForVisibility(WebElement element) {
       return wait.until(ExpectedConditions.visibilityOf(element)).isDisplayed());
    }
}
