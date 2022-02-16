package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class OverviewPage {
    private final By editButtonSelector = By.xpath("//a[text() = 'Edit']");
    private final By reportsButtonSelector = By.xpath("//a[text() = 'Reports']");
    private final By milestonesSidebarSelector = By.id("sidebar-milestones-overview");
    private final By addMilestonesSidebarSelector = By.id("sidebar-milestones-add");
    private final By viewAllMilestonesSidebarSelector = By.id("sidebar-milestones-viewall");
    private final By testRunsSidebarSelector = By.id("sidebar-runs-overview");
    private final By addTestRunsSidebarSelector = By.id("sidebar-runs-overview");
    private final By viewAllTestRunsSidebarSelector = By.id("sidebar-runs-overview");
    private final By testCasesSidebarSelector = By.id("sidebar-cases-overview");
    private final By addTestCasesSidebarSelector = By.id("sidebar-cases-add");
    private final By viewAllTestCasesSidebarSelector = By.id("sidebar-suites-viewall");
    private final By milestoneNavigationSelector = By.id("navigation-overview-viewmilestones");
    private final By addMilestoneNavigationSelector = By.id("navigation-overview-addmilestones");
    private final By testRunsNavigationSelector = By.id("navigation-overview-runs");
    private final By addTestRunsNavigationSelector = By.id("navigation-overview-addrunssuite");
    private final By returnToDashboardLinkSelector = By.id("navigation-dashboard-top");
    private final By messageSelector = By.xpath("//div[. = 'Successfully updated the project.']");

    public SelenideElement getEditButton() {
        return $(editButtonSelector);
    }

    public SelenideElement getReportsButton() {
        return $(reportsButtonSelector);
    }

    public SelenideElement getMilestonesSidebar() {
        return $(milestonesSidebarSelector);
    }

    public SelenideElement getAddMilestonesSidebar() {
        return $(addMilestonesSidebarSelector);
    }

    public SelenideElement getViewAllMilestonesSidebar() {
        return $(viewAllMilestonesSidebarSelector);
    }

    public SelenideElement getTestRunsSidebar() {
        return $(testRunsSidebarSelector);
    }

    public SelenideElement getAddTestRunsSidebar() {
        return $(addTestRunsSidebarSelector);
    }

    public SelenideElement getViewAllTestRunsSidebar() {
        return $(viewAllTestRunsSidebarSelector);
    }

    public SelenideElement getTestCasesSidebar() {
        return $(testCasesSidebarSelector);
    }

    public SelenideElement getAddTestCasesSidebar() {
        return $(addTestCasesSidebarSelector);
    }

    public SelenideElement getViewAllTestCasesSidebar() {
        return $(viewAllTestCasesSidebarSelector);
    }

    public SelenideElement getMilestoneNavigation() {
        return $(milestoneNavigationSelector);
    }

    public SelenideElement getAddMilestoneNavigation() {
        return $(addMilestoneNavigationSelector);
    }

    public SelenideElement getTestRunsNavigation() {
        return $(testRunsNavigationSelector);
    }

    public SelenideElement getAddTestRunsNavigation() {
        return $(addTestRunsNavigationSelector);
    }

    public SelenideElement getReturnToDashboardLink() {
        return $(returnToDashboardLinkSelector);
    }

    public SelenideElement getMessage() {
        return $(messageSelector);
    }
}
