package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectPage extends BasePage {
    private static String ENDPOINT = "/admin/projects/overview";

    private static final By PAGE_OPENED_IDENTIFIER = By.xpath("//*[@class = 'content-header-title page_title display-inline-block']");

    private static String projectFind = "//*[text()='replace']";
    private static By returnToDashboardPageButtonSelector = By.id("navigation-dashboard");
    private static String projectLineFind = "//*[text()='replace']/../..";
    private static By deleteProjectButtonSelector = By.xpath("//*[@class='icon-small-delete']");
    private static By deleteCheckboxSelector = By.xpath("(//*[@class = 'dialog-confirm-busy']/..)//input");
    private static By agreeButtonSelector = By.xpath("//div[@id='deleteDialog']//a[contains(@class,'button button-ok')]");
    private static By cancelButtonSelector = By.xpath("//div[@id='deleteDialog']//a[contains(@class,'button button-cancel')]");
    private static By messageProjectDeletedSelector = By.xpath("//*[. = 'Successfully deleted the project.']");

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

    public WebElement getReturnToDashboardPageButton() {
        return driver.findElement(returnToDashboardPageButtonSelector);
    }

    public WebElement getDeleteCheckbox() {
        return driver.findElement(deleteCheckboxSelector);
    }

    public WebElement getAgreeButton() {
        return driver.findElement(agreeButtonSelector);
    }

    public WebElement getCancelButton() {
        return driver.findElement(cancelButtonSelector);
    }

    public WebElement getMessageProjectDeleted() {
        return driver.findElement(messageProjectDeletedSelector);
    }

    public WebElement getDeleteProjectButton(String nameProject) {
        return getFindLineProject(nameProject).findElement(deleteProjectButtonSelector);
    }

    public WebElement getFindProject(String nameProject) {
        return driver.findElement(By.xpath(projectFind.replace("replace", String.valueOf(nameProject))));
    }

    public WebElement getFindLineProject(String nameProject) {
        return driver.findElement(By.xpath(projectLineFind.replace("replace", String.valueOf(nameProject))));
    }
}
