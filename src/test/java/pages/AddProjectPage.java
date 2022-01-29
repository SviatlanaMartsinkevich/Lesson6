package pages;

import baseEntities.BasePage;
import enums.ProjectType;
import models.Project;
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
    protected By isShowAnnouncementSelector = By.id("show_announcement");
    protected By projectsTypeSelector = By.cssSelector("[name = 'suite_mode']");
    protected By addProjectButtonSelector = By.id("accept");
    protected By cancelButtonSelector = By.xpath("//a[contains(text(),'Cancel')][1]");
    private static String typeRadioButtonSelector = "//*[@name = 'suite_mode' and @value ='replace']";

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

    public List<WebElement> getProjectsTypeButton() {return driver.findElements(projectsTypeSelector);}

    public WebElement getAddProjectButton() {
        return driver.findElement(addProjectButtonSelector);
    }

    public WebElement getCancelButton() {
        return driver.findElement(cancelButtonSelector);
    }

    public void setType(ProjectType type) {
        driver.findElement(By.xpath(typeRadioButtonSelector.replace("replace", String.valueOf(type))));
    }


    public void addProject(Project projects) {
        getNameProjectField().sendKeys(projects.getName());
        getAnnouncementField().sendKeys(projects.getAnnouncement());
        chooseProject(projects);
        getAddProjectButton().click();
    }

    public void chooseProject(Project projects) {
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


