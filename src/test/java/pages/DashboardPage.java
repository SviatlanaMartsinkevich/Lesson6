package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DashboardPage extends BasePage {
    // Описание элементов страницы

    private By PAGE_OPENED_IDENTIFIER = By.id("navigation-dashboard");

    private By projectAdd_Selector = By.id("sidebar-projects-add");

    private By project_Selector = By.xpath("//h1[@class='top']");

    // Конструктор страницы
    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened()
    {
        return super.isPageOpened(PAGE_OPENED_IDENTIFIER);
    }

    // Реализация геттеров элементов
    public WebElement getProjectAddField() { return  driver.findElement(projectAdd_Selector); }

    // Реализация базовых методов
    public void addProject() {
        getProjectAddField().click();
    }
}


//    public List<WebElement> mostActiveProjects(){
//        return driver.findElements(By.xpath("//div[@class='column']"));
//    }