package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectPage extends BasePage {
    private static String ENDPOINT = "/admin/projects/overview";

    private static final By PAGE_OPENED_IDENTIFIER = By.xpath("//*[@class = 'content-header-title page_title display-inline-block']");

    private static String projectFind = "//*[text()='replace']";



    public ProjectPage(WebDriver driver) {
        super(driver);
    }

    public ProjectPage(WebDriver driver, boolean openPageByUrl) {
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

    public WebElement findProject(String addProject) {
        return driver.findElement(By.xpath(projectFind.replace("replace", String.valueOf(addProject))));
    }
}
