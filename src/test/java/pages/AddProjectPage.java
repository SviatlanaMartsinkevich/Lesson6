package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AddProjectPage extends BasePage {
    private static String ENDPOINT = "/admin/projects/add/1";

    private static final By PAGE_OPENED_IDENTIFIER = By.xpath("//*[@class = 'content-header-title page_title display-inline-block']");

    protected By nameProjectSelector = By.id("name");
    protected By announcementSelector = By.id("announcement");
    protected By isShowAnnouncementSelector = By.id("show_announcement");
    protected By addProjectButtonSelector = By.id("accept");
    protected By cancelButtonSelector = By.xpath("//a[contains(text(),'Cancel')][1]");
    private static String typeRadioButtonSelector = "//*[@name = 'suite_mode' and @value='replace']";
    protected By isCompletedSelector = By.id("is_completed");

    public AddProjectPage(WebDriver driver) {
        super(driver);
    }

    public AddProjectPage(WebDriver driver, boolean openPageByUrl) {
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

    public WebElement getNameProjectField() {
        return driver.findElement(nameProjectSelector);
    }

    public WebElement getAnnouncementField() {
        return driver.findElement(announcementSelector);
    }

    public WebElement getIsShowAnnouncementField() {
        return driver.findElement(isShowAnnouncementSelector);
    }

    public WebElement getAddProjectButton() {
        return driver.findElement(addProjectButtonSelector);
    }

    public WebElement getCancelButton() {
        return driver.findElement(cancelButtonSelector);
    }

    public WebElement getIsCompletedField() {
        return driver.findElement(isCompletedSelector);
    }

    public WebElement getType(int type) {
        return driver.findElement(By.xpath(typeRadioButtonSelector.replace("replace", String.valueOf(type))));
    }
}


