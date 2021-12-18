package pages;

import baseEntities.BasePage;
import core.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProjectPage extends BasePage {

    // Описание элементов страницы
    private By PAGE_OPENED_IDENTIFIER = By.className("content-header-title page_title");

    private By name_Selector = By.id("name");
    private By announcement_Selector = By.id("announcement");
    private By choiceCasesButton_Selector = By.id("suite_mode_single");
    private By addProjectButton_Selector = By.id("accept");

    // Конструктор страницы
    public AddProjectPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return super.isPageOpened(PAGE_OPENED_IDENTIFIER);
    }

    // Реализация геттеров элементов
    public WebElement getNameField() {
        return driver.findElement(name_Selector);
    }

    public WebElement getAnnouncementField() {
        return driver.findElement(announcement_Selector);
    }

    public WebElement getChoiceCasesButton() {
        return driver.findElement(choiceCasesButton_Selector);
    }

    public WebElement getAddProjectButton() {
        return driver.findElement(addProjectButton_Selector);
    }

    // Реализация базовых методов

    public void addNewProject(String projectName, String announcement) {
        getNameField().sendKeys(ReadProperties.getProjectName());
        getAnnouncementField().sendKeys(ReadProperties.getAnnouncement());
        getChoiceCasesButton().click();
        getAddProjectButton().click();
    }
}
