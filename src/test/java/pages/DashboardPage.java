package pages;


import baseEntities.BasePage;
import core.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage extends BasePage {
    private static String ENDPOINT = "/dashboard";

    private static final By PAGE_OPENED_IDENTIFIER = By.id("activityChart");

    protected By addProjectButtonSelector = By.id("sidebar-projects-add");
    protected By administratorButtonSelector = By.id("navigation-admin");
    protected By projectFindSelector = By.xpath(String.format("//*[text()='%s']", ReadProperties.getNameProject()));

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public DashboardPage(WebDriver driver, boolean openPageByUrl) {
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
    public WebElement getAddProjectButton() {
        return driver.findElement(addProjectButtonSelector);
    }
    public WebElement getAdministratorButton() { return driver.findElement(administratorButtonSelector);}
    public WebElement getProjectFind() {
        return driver.findElement(projectFindSelector);
    }
}
