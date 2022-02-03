package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdministrationPage extends BasePage {
    private static String ENDPOINT = "/admin/overview";

    private static final By PAGE_OPENED_IDENTIFIER = By.cssSelector(".empty");

    protected By overviewNavigationSelector = By.id("navigation-sub-overview");
    protected By projectsNavigationSelector = By.id("navigation-sub-projects");
    protected By usersNavigationSelector = By.id("navigation-sub-users");
    protected By customizationNavigationSelector = By.id("navigation-sub-customization");
    protected By integrationNavigationSelector = By.id("navigation-sub-integration");
    protected By dataManagementNavigationSelector = By.id("navigation-sub-subscription");
    protected By siteSettingNavigationSelector = By.id("navigation-sub-sitesettings");

    public AdministrationPage(WebDriver driver) {
        super(driver);
    }

    public AdministrationPage(WebDriver driver, boolean openPageByUrl) {
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

    public WebElement getOverviewNavigationButton() {
        return driver.findElement(overviewNavigationSelector);
    }

    public WebElement getProjectsNavigationButton() {
        return driver.findElement(projectsNavigationSelector);
    }

    public WebElement getUsersNavigationButton() {
        return driver.findElement(usersNavigationSelector);
    }

    public WebElement getCustomizationNavigationButton() {
        return driver.findElement(customizationNavigationSelector);
    }

    public WebElement getIntegrationNavigationButton() {
        return driver.findElement(integrationNavigationSelector);
    }

    public WebElement getDataManagementNavigationButton() {
        return driver.findElement(dataManagementNavigationSelector);
    }

    public WebElement getSiteSettingNavigationButton() {
        return driver.findElement(siteSettingNavigationSelector);
    }
}
