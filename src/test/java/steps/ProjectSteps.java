package steps;

import baseEntities.BaseStep;
import enums.ProjectType;
import models.Project;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.AddProjectPage;
import pages.DashboardPage;
import pages.OverviewPage;
import utils.Randomization;

public class ProjectSteps extends BaseStep {
    private AddProjectPage addProjectPage;
    private DashboardPage dashboardPage;
    private OverviewPage overviewPage;


    public ProjectSteps(WebDriver driver) {
        super(driver);
    }

    public void addNewProject(Project addProject) {
        addProjectPage = new AddProjectPage(driver);
        addProjectPage.getNameProjectField().sendKeys(addProject.getName());
        addProjectPage.getAnnouncementField().sendKeys(addProject.getAnnouncement());
        addProjectPage.getIsShowAnnouncementField().click();
        addProjectPage.getType(addProject.getTypeOfProject()).click();
        addProjectPage.getAddProjectButton().click();
    }


    public void updateProject(Project addProject, Project updateProject) {
        dashboardPage = new DashboardPage(driver);
        dashboardPage.findProject(addProject.getName()).click();
        overviewPage = new OverviewPage(driver);
        overviewPage.getEditButton().click();
        addProjectPage = new AddProjectPage(driver);
        addProjectPage.getNameProjectField().sendKeys(Keys.CONTROL + "a");
        addProjectPage.getNameProjectField().sendKeys(updateProject.getName());
        addProjectPage.getAnnouncementField().sendKeys(Keys.CONTROL + "a");
        addProjectPage.getAnnouncementField().sendKeys(updateProject.getAnnouncement());
        addProjectPage.getIsShowAnnouncementField().click();
        addProjectPage.getType(updateProject.getTypeOfProject()).click();
        addProjectPage.getIsCompletedField().click();
        addProjectPage.getAddProjectButton().click();
    }

    public void deleteProject(Project project) {

    }
}
