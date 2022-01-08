package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeWork2 {
    String URL = "https://masterskayapola.ru/kalkulyator/laminata.html";

    @Test
    public void homework_test2() throws Exception {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

        String expectedSquare = "39.74 м2.";
        String expectedNumberOfPanels = "81 шт.";
        String expectedNumberOfPackage = "7 шт.";
        String expectedPrice = "29484 руб.";
        String expectedRemainder = "3 шт.";
        String expectedSegments = "3 шт.";

//      1. Открыть браузер и переходим на тестируюмую страницу

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);

//       2. Вводим данные в поле "длина помещения"

        WebElement lengthRoom = driver.findElement(By.name("calc_roomwidth"));
        lengthRoom.sendKeys(Keys.CONTROL + "a");
        lengthRoom.sendKeys("8");

//       3. Вводим данные в поле "ширина помещения"

        WebElement widthRoom = driver.findElement(By.name("calc_roomheight"));
        widthRoom.sendKeys(Keys.CONTROL + "a");
        widthRoom.sendKeys("5");

//       4. Вводим данные в поле "длина"

        WebElement length = driver.findElement(By.name("calc_lamwidth"));
        length.sendKeys(Keys.CONTROL + "a");
        length.sendKeys("1200");

//      5. Вводим данные в поле "ширина"

        WebElement width = driver.findElement(By.name("calc_lamheight"));
        width.sendKeys(Keys.CONTROL + "a");
        width.sendKeys("450");

//       6. Вводим в данные в поле "количество в упаковке"

        WebElement number = driver.findElement(By.name("calc_inpack"));
        number.sendKeys(Keys.CONTROL + "a");
        number.sendKeys("12");

//      7. Вводим данные в поле "цена"

        WebElement price = driver.findElement(By.name("calc_price"));
        price.sendKeys(Keys.CONTROL + "a");
        price.sendKeys("650");

//      8. Вводим данные в поле "направление укладки"

        WebElement direction = driver.findElement(By.name("calc_direct"));
        Select directionDropDown = new Select(direction);
        directionDropDown.selectByValue("tow");

//       9. Вводим данные в поле "смещение рядов"

        WebElement offsetNear = driver.findElement(By.name("calc_bias"));
        offsetNear.sendKeys(Keys.CONTROL + "a");
        offsetNear.sendKeys("350");

//       10. Вводим данные в поле "отступ от стены"

        WebElement indentFromTheWall = driver.findElement(By.name("calc_walldist"));
        indentFromTheWall.sendKeys(Keys.CONTROL + "a");
        indentFromTheWall.sendKeys("10");

//       11. Нажимаем кнопку "рассчитать"

        WebElement calculate = driver.findElementByCssSelector("input[class ='btn btn-secondary btn-lg tocalc']");
        calculate.click();

//       12. Сравниваем полученные результаты

        String actualSquare = driver.findElement(By.id("s_lam")).getText();
        String actualNumberOfPanels = driver.findElement(By.id("l_count")).getText();
        String actualNumberOfPackage = driver.findElement(By.id("l_packs")).getText();
        String actualPrice = driver.findElement(By.id("l_price")).getText();
        String actualRemainder = driver.findElement(By.id("l_over")).getText();
        String actualSegments = driver.findElement(By.id("l_trash")).getText();

        Assert.assertEquals(actualSquare, expectedSquare, "Площадь укладки не совпадает");
        Assert.assertEquals(actualNumberOfPanels, expectedNumberOfPanels, "Количество панелей не совпадает");
        Assert.assertEquals(actualNumberOfPackage, expectedNumberOfPackage, "Количество упаковок не совпадает");
        Assert.assertEquals(actualPrice, expectedPrice, "Стоимость не совпадает");
        Assert.assertEquals(actualRemainder, expectedRemainder, "Остатки не совпадают");
        Assert.assertEquals(actualSegments, expectedSegments, "Отрезки не совпадают");

        driver.quit();
    }
}
