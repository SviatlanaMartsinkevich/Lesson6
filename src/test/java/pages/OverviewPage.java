package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OverviewPage extends BasePage {
    private static String ENDPOINT = "/dashboard/overview/{}";

    private static final By PAGE_OPENED_IDENTIFIER = By.id("chart-line-fc");

    protected By editButtonSelector = By.xpath("//a[text() = 'Edit']");
    protected By reportsButtonSelector = By.xpath("//a[text() = 'Reports']");
    protected By milestonesSidebarSelector = By.id("sidebar-milestones-overview");
    protected By addMilestonesSidebarSelector = By.id("sidebar-milestones-add");
    protected By viewAllMilestonesSidebarSelector = By.id("sidebar-milestones-viewall");
    protected By testRunsSidebarSelector = By.id("sidebar-runs-overview");
    protected By addTestRunsSidebarSelector = By.id("sidebar-runs-overview");
    protected By viewAllTestRunsSidebarSelector = By.id("sidebar-runs-overview");
    protected By testCasesSidebarSelector = By.id("sidebar-cases-overview");
    protected By addTestCasesSidebarSelector = By.id("sidebar-cases-add");
    protected By viewAllTestCasesSidebarSelector = By.id("sidebar-suites-viewall");
    protected By milestoneNavigationSelector = By.id("navigation-overview-viewmilestones");
    protected By addMilestoneNavigationSelector = By.id("navigation-overview-addmilestones");
    protected By testRunsNavigationSelector = By.id("navigation-overview-runs");
    protected By addTestRunsNavigationSelector = By.id("navigation-overview-addrunssuite");
    protected By returnToDashboardButtonSelector = By.id("navigation-dashboard-top");
    protected By messageSelector = By.xpath("//div[. = 'Successfully updated the project.']");

    public OverviewPage(WebDriver driver) {
        super(driver);
    }

    public OverviewPage(WebDriver driver, boolean openPageByUrl) {
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

    public WebElement getEditButton() {
        return driver.findElement(editButtonSelector);
    }

    public WebElement getReportsButton() {
        return driver.findElement(reportsButtonSelector);
    }

    public WebElement getMilestonesSidebar() {
        return driver.findElement(milestonesSidebarSelector);
    }

    public WebElement getAddMilestonesSidebar() {
        return driver.findElement(addMilestonesSidebarSelector);
    }

    public WebElement getViewAllMilestonesSidebar() {
        return driver.findElement(viewAllMilestonesSidebarSelector);
    }

    public WebElement getTestRunsSidebar() {
        return driver.findElement(testRunsSidebarSelector);
    }

    public WebElement getAddTestRunsSidebar() {
        return driver.findElement(addTestRunsSidebarSelector);
    }

    public WebElement getViewAllTestRunsSidebar() {
        return driver.findElement(viewAllTestRunsSidebarSelector);
    }

    public WebElement getTestCasesSidebar() {
        return driver.findElement(testCasesSidebarSelector);
    }

    public WebElement getAddTestCasesSidebar() {
        return driver.findElement(addTestCasesSidebarSelector);
    }

    public WebElement getViewAllTestCasesSidebar() {
        return driver.findElement(viewAllTestCasesSidebarSelector);
    }

    public WebElement getMilestoneNavigation() {
        return driver.findElement(milestoneNavigationSelector);
    }

    public WebElement getAddMilestoneNavigation() {
        return driver.findElement(addMilestoneNavigationSelector);
    }

    public WebElement getTestRunsNavigation() {
        return driver.findElement(testRunsNavigationSelector);
    }

    public WebElement getAddTestRunsNavigation() {
        return driver.findElement(addTestRunsNavigationSelector);
    }

    public WebElement getReturnToDashboardButton() {
        return driver.findElement(returnToDashboardButtonSelector);
    }

    public WebElement getMessage() {
        return driver.findElement(messageSelector);
    }
}
