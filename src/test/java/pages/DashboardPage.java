package pages;

import baseEntities.BasePage;
import core.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage extends BasePage {
    // Описание элементов страницы

    private By PAGE_OPENED_IDENTIFIER = By.id("navigation-dashboard");

    private By projectAdd_Selector = By.id("sidebar-projects-add");

    private By project_Selector = By.xpath("//h1[@class='top']");

    private By projectFind_Selector = By.xpath(String.format("//*[@style='padding-left: 25px' and text()='%s']", ReadProperties.getName()));


    // Конструктор страницы
    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return super.isPageOpened(PAGE_OPENED_IDENTIFIER);
    }

    // Реализация геттеров элементов
    public WebElement getProjectAddField() {
        return driver.findElement(projectAdd_Selector);
    }

    public WebElement getProjectField() {
        return driver.findElement(project_Selector);
    }

    public WebElement getProjectFindField() {
        return driver.findElement(projectFind_Selector);
    }

    // Реализация базовых методов
    public void addProject() {
        getProjectAddField().click();
    }

    public void findProject() {
        try {
            getProjectFindField().click();
        } catch (NoSuchElementException nsex) {
            System.out.println("Project " + " '" + ReadProperties.getName() + "' " + " not found");
        }
    }
}
