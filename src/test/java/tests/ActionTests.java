package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionTests extends BaseTest {

    @Test
    public void actionTest1() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/login");

        WebElement userName = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.cssSelector("[class = 'fa fa-2x fa-sign-in']"));

        Actions actions = new Actions(driver);
        actions
                .moveToElement(userName)
                .sendKeys("tomsmith")
                .moveToElement(password)
                .sendKeys("SuperSecretPassword!")
                .click(loginButton)
                .build()
                .perform();

        Assert.assertTrue(driver.findElement(By.id("flash")).isDisplayed());
    }
}
