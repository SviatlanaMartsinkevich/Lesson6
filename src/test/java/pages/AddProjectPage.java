package pages;

import baseEntities.BasePage;
import core.ReadProperties;
import models.Projects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class AddProjectPage extends BasePage {
    private static String ENDPOINT = "/admin/projects/add/1";

    private static final By PAGE_OPENED_IDENTIFIER = By.xpath("//*[@class = 'content-header-title page_title display-inline-block']");

    protected By nameProjectSelector = By.id("name");
    protected By announcementSelector = By.id("announcement");
    protected By showAnnouncementSelector = By.id("show_announcement");

    protected By suiteModeSingleProjectButtonSelector = By.id("suite_mode_single");
    protected By suiteModelSingleBaseProjectButtonSelector = By.id("suite_mode_single_baseline");
    protected By suiteModelMultiProjectSelector = By.id("suite_mode_multi");
    protected By projectsTypeSelector = By.cssSelector("[name = 'suite_mode']");

    protected By addProjectButtonSelector = By.id("accept");
    protected By cancelButtonSelector = By.xpath("//a[contains(text(),'Cancel')][1]");

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

    public WebElement getShowAnnouncementField() {
        return driver.findElement(showAnnouncementSelector);
    }

    public WebElement getSuiteModeSingleProjectButton() {
        return driver.findElement(suiteModeSingleProjectButtonSelector);
    }

    public WebElement getSuiteModelSingleBaseProjectButton() {
        return driver.findElement(suiteModelSingleBaseProjectButtonSelector);
    }

    public WebElement getSuiteModelMultiProjectButton() {
        return driver.findElement(suiteModelMultiProjectSelector);
    }

    public List<WebElement> getProjectsTypeButton() {return driver.findElements(projectsTypeSelector);}

    public WebElement getAddProjectButton() {
        return driver.findElement(addProjectButtonSelector);
    }

    public WebElement getCancelButton() {
        return driver.findElement(cancelButtonSelector);
    }


    public void addProject(Projects projects) {
        getNameProjectField().sendKeys(projects.getName());
        getAnnouncementField().sendKeys(projects.getComment());
        chooseProject(projects);
        getAddProjectButton().click();
    }

    public void chooseProject(Projects projects) {
        Random random = new Random();
        int s = random.nextInt(2);
        switch (s) {
            case 0:
                getSuiteModeSingleProjectButton().click();
                break;
            case 1:
                getSuiteModelSingleBaseProjectButton().click();
                break;
            case 2:
                getSuiteModelMultiProjectButton().click();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + s);
        }
    }

    public void changeProject() {
        List<WebElement>list=getProjectsTypeButton();
        while (true){
            int number = new Random().nextInt(2);
            try{
                if(list.get(number).getAttribute("checked").equals("checked")){
                    System.out.println("This project already is chosen");
                }
            }catch (NullPointerException e){
                list.get(number).click();
                break;
            }
        }
    }
}


