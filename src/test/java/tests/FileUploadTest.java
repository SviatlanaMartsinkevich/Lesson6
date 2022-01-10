package tests;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Waits;

import java.util.concurrent.TimeUnit;

public class FileUploadTest extends BaseTest {
    @Test
    public void  fileUploadTest() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/upload");
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS);

        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        WebElement uploadFile = driver.findElement(By.id("file-submit"));

       // chooseFile.click();
        chooseFile.sendKeys("C:/Users/Svetik/Downloads/Картинка.jfif");
        uploadFile.click();

        //Thread.sleep(10000);

        Waits waits = new Waits(driver);


//      WebElement header = driver.findElement(By.xpath("//h3[.='File Uploaded!']"));
        WebElement header = waits.waitForVisibility(By.xpath("//h3[.='File Uploaded!']"));
//      WebElement fileName = driver.findElement(By.id("uploaded-files"));
        WebElement fileName = waits.waitForVisibility(By.id("uploaded-files"));

        Assert.assertTrue(header.isDisplayed());
        Assert.assertEquals(fileName.getText(), "Картинка.jfif");
    }
}
