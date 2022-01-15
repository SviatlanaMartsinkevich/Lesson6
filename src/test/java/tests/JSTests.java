package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JSTests extends BaseTest{

    @Test
    public void jsTest() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/floating_menu#home");

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

        javascriptExecutor.executeScript("window.scrollBy(0,4500)");

        Assert.assertTrue(driver.findElement(By.xpath("//*[text() = 'Powered by ']")).isDisplayed());
    }
}
