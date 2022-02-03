package pages;


import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage extends BasePage {

    private static String ENDPOINT = "/dashboard";

    private static final By PAGE_OPENED_IDENTIFIER = By.id("activityChart");

    protected By addProjectButtonSelector = By.id("sidebar-projects-add");
    protected By administratorButtonSelector = By.id("navigation-admin");
    private static String projectFind = "//*[@style='padding-left: 25px' and text()='replace']";

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

    public WebElement getAdministratorButton() {
        return driver.findElement(administratorButtonSelector);
    }

    public WebElement getFindProject(String nameProject) {
        return driver.findElement(By.xpath(projectFind.replace("replace", String.valueOf(nameProject))));
    }
}
