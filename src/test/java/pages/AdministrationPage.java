package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AdministrationPage {
    private final By overviewNavigationSelector = By.id("navigation-sub-overview");
    private final By projectsNavigationSelector = By.id("navigation-sub-projects");
    private final By usersNavigationSelector = By.id("navigation-sub-users");
    private final By customizationNavigationSelector = By.id("navigation-sub-customization");
    private final By integrationNavigationSelector = By.id("navigation-sub-integration");
    private final By dataManagementNavigationSelector = By.id("navigation-sub-subscription");
    private final By siteSettingNavigationSelector = By.id("navigation-sub-sitesettings");

    public SelenideElement getOverviewNavigationButton() {
        return $(overviewNavigationSelector);
    }

    public SelenideElement getProjectsNavigationButton() {
        return $(projectsNavigationSelector);
    }

    public SelenideElement getUsersNavigationButton() {
        return $(usersNavigationSelector);
    }

    public SelenideElement getCustomizationNavigationButton() {
        return $(customizationNavigationSelector);
    }

    public SelenideElement getIntegrationNavigationButton() {
        return $(integrationNavigationSelector);
    }

    public SelenideElement getDataManagementNavigationButton() {
        return $(dataManagementNavigationSelector);
    }

    public SelenideElement getSiteSettingNavigationButton() {
        return $(siteSettingNavigationSelector);
    }
}
