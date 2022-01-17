package pages;

import baseEntities.BasePage;
import core.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ViewProjectsPage extends BasePage {
    private static String ENDPOINT = "/dashboard";

    private static final By PAGE_OPENED_IDENTIFIER = By.id("activityChart");

    protected By projectFindSelector = By.xpath(String.format("//*[@style='padding-left: 25px' and text()='%s']", ReadProperties.getNameProject()));;
    protected By editButtonSelector = By.xpath("//a[text() = 'Edit']");

    protected By saveProjectButtonSelector = By.id("accept");
    protected By messageSelector = By.xpath("//div[. = 'Successfully updated the project.']");

    protected By returnToDashboardSelector = By.id("navigation-dashboard-top");

    public ViewProjectsPage(WebDriver driver) {
        super(driver);
    }

    public ViewProjectsPage(WebDriver driver, boolean openPageByUrl) {
        super(driver, openPageByUrl);
    }


    @Override
    protected void openPage() {
        driver.get(BASE_URL + ENDPOINT);
    }

    @Override
    public boolean isPageOpened() {
        return waits.waitForVisibility(PAGE_OPENED_IDENTIFIER).isDisplayed();
    }

    public WebElement getProjectFind() {
        return driver.findElement(projectFindSelector);
    }

    public WebElement getEditButton() {
        return driver.findElement(editButtonSelector);
    }

    public WebElement getSaveProjectButton() {
        return driver.findElement(saveProjectButtonSelector);
    }

    public WebElement getMessage() {
        return driver.findElement(messageSelector);
    }

    public WebElement getReturnToDashboard() {
        return driver.findElement(returnToDashboardSelector);
    }


    public void findProject() {
        try {
            getProjectFind().click();
        } catch (NoSuchElementException nsex) {
            System.out.println("Project " + " '" + ReadProperties.getNameProject() + "' " + " not found");
        }
    }

}
