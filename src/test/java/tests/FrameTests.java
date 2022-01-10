package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FrameTests extends BaseTest {

    @Test
    public void frameTest() {
        driver.get("http://the-internet.herokuapp.com/iframe");

        driver.switchTo().frame(0);
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "Your content goes here.");

        driver.switchTo().parentFrame(); //позволяет вернуться на уровень выше
//      driver.switchTo().defaultContent(); //возвращает к начальному уровню
        Assert.assertTrue(driver.findElement(By.className("tox-editor-container")).isDisplayed());
    }
}
