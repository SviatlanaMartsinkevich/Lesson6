package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HomeWork {

    static String URL = "https://kermi-fko.ru/raschety/Calc-Rehau-Solelec.aspx";

    @Test
    public void homework_test1() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");

//      1.  Открыть браузер и перейти на тестируюмую страницу

        ChromeDriver driver = new ChromeDriver();
        driver.get(URL);

//      2. Ввводим данные ширины пола

        WebElement widthFloorElement = driver.findElementById("el_f_width");
        widthFloorElement.sendKeys("5");

//      3. Вводим данные доины пола

        WebElement lengthFloorElement = driver.findElementById("el_f_lenght");
        lengthFloorElement.sendKeys("7");

//       4. Выбираем тип комнаты

        WebElement room = driver.findElementById("room_type");
        Select roomDropDown = new Select(room);

        roomDropDown.selectByVisibleText("Кухня или спальня");

//      5. Выбираем тип обогрева

        WebElement heatingTypeElement = driver.findElementById("heating_type");
        Select heatingTypeDropDown = new Select(heatingTypeElement);

        heatingTypeDropDown.selectByVisibleText("Основное отопление");

//      6. Нажимаем рассчитать

        WebElement calculate = driver.findElementByCssSelector("input[type ='button']");
        calculate.click();


        Thread.sleep(5000);

//      7. Сравниваем результат

        driver.close();
        driver.quit();


    }
}

