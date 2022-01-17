package pages;

import baseEntities.BasePage;
import models.Projects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AddProjectPage extends BasePage {
    private static String ENDPOINT = "/admin/projects/add/1";

    private static final By PAGE_OPENED_IDENTIFIER = By.className("content-header-title page_title display-inline-block");

    protected By nameProjectSelector = By.id("name");
    protected By announcementSelector = By.id("announcement");
    protected By addProjectButtonSelector = By.id("accept");

//    private List<Projects> projectsType = new ArrayList<>();
//
//    public List<Projects> getProjectsType() {
//        return projectsType;
//    }
//
//    public void setProjectsType(List<Projects> projectsType) {
//        this.projectsType = projectsType;
//    }

    public AddProjectPage(WebDriver driver) { super(driver);}


    public AddProjectPage(WebDriver driver, boolean openPageByUrl) { super(driver, openPageByUrl);
    }

    @Override
    protected void openPage() {
    }

    @Override
    protected boolean isPageOpened() { return false;}

    public WebElement getNameProjectField() { return driver.findElement(nameProjectSelector);}
    public WebElement getAnnouncementField() { return driver.findElement(announcementSelector);}
    public WebElement getAddProjectButton() { return driver.findElement(addProjectButtonSelector);}

    public void addProject(Projects projects) {
        getNameProjectField().sendKeys(projects.getName());
        getAnnouncementField().sendKeys(projects.getComment());
        getAddProjectButton().click();

    }


}
