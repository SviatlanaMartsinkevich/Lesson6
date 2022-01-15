package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Waits;

public class WaitsTest extends BaseTest {

    @Test
    public void explicitlyWait(){
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");

        Waits waits= new Waits(driver);

        WebElement button = driver.findElement(By.tagName("button"));
        button.click();

        WebElement loading = driver.findElement(By.id("loading"));
        Assert.assertTrue(waits.waitForInvisibility(loading));

        WebElement text = driver.findElement((By.xpath("//h4[. = 'Hello World!']")));
        Assert.assertEquals(text.getText(), "Hello World!");
    }
}
