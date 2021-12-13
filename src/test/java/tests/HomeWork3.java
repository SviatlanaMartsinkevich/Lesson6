package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

public class HomeWork3 {
    String URL = "https://calc.by/building-calculators/laminate.html";

    @Test
    public void homework_test3() throws Exception {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

//      1. Открываем браузер и переходим на тестируюмую страницу
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(URL);

//      2. Вводим данные в поле "Способ укладки ламината"

        WebElement stylingMethod = driver.findElement(By.id("laying_method_laminate"));
        Select stylingMethodDropDown = new Select(stylingMethod);
        stylingMethodDropDown.selectByVisibleText("с использованием отрезанного элемента");

//      3. Вводим данные в поле "длина комнаты"

        WebElement lengthRoom = driver.findElement(By.id("ln_room_id"));
        lengthRoom.sendKeys(Keys.CONTROL + "a");
        lengthRoom.sendKeys("500");

//      4.  Ввводим данные в поле "ширина комнаты"

        WebElement widthRoom = driver.findElement(By.id("wd_room_id"));
        widthRoom.sendKeys(Keys.CONTROL + "a");
        widthRoom.sendKeys("400");

//      5. Вводим данные в поле "длина панели ламината"

        WebElement lengthPanel = driver.findElement(By.id("ln_lam_id"));
        lengthPanel.sendKeys(Keys.CONTROL + "a");
        lengthPanel.sendKeys("2000");

//      6. Вводим данные в поле "ширина панели ламината"

        WebElement widthPanel = driver.findElement(By.id("wd_lam_id"));
        widthPanel.sendKeys(Keys.CONTROL + "a");
        widthPanel.sendKeys("200");

//      7. Прокручиваем стриницу вниз

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scroll(0, 700);");

//      8. Выбираем направление укладки ламината

        WebElement dir = driver.findElement((By.cssSelector("[id='direction-laminate-id1']")));
        driver.executeScript("arguments[0].click();", dir);


//      9. Нажимаем кнопку "рассчитать"

        WebElement calculate = driver.findElement(By.cssSelector("[href='javascript:void(0);']"));
        driver.executeScript("arguments[0].click();", calculate);

//      10. Сравниваем результаты

        String executeNumberOfBoards = "53";
        String executeNumberOfPackages = "7";

        String actualNumberOfBoards = driver.findElement(By.cssSelector("[style='padding:5px 0;font-size:22px; color:#C80303; font-weight:bold;']")).getText();
        String actualNumberOfPackages =  driver.findElement(By.cssSelector("[style='padding:5px 0;font-size:18px; color:#0E8C19; font-weight:bold;'")).getText();

        Assert.assertEquals(actualNumberOfBoards, executeNumberOfBoards, "Boards");
        Assert.assertEquals(actualNumberOfPackages, executeNumberOfPackages, "Package");

        driver.quit();
    }
}
