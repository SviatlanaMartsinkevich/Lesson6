package steps;

import baseEntities.BaseStep;
import models.Project;
import org.openqa.selenium.WebDriver;
import pages.AddProjectPage;
import pages.DashboardPage;
import pages.OverviewPage;
import pages.ProjectPage;

public class ProjectSteps extends BaseStep {
    private AddProjectPage addProjectPage;
    private DashboardPage dashboardPage;
    private OverviewPage overviewPage;
    private ProjectPage projectPage;

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

    public void updateProject(Project project, Project updateProject) {
        dashboardPage = new DashboardPage(driver);
        dashboardPage.getFindProject(project.getName()).click();
        overviewPage = new OverviewPage(driver);
        overviewPage.getEditButton().click();
        addProjectPage = new AddProjectPage(driver);
        addProjectPage.getNameProjectField().clear();
        addProjectPage.getNameProjectField().sendKeys(updateProject.getName());
        addProjectPage.getAnnouncementField().clear();
        addProjectPage.getAnnouncementField().sendKeys(updateProject.getAnnouncement());
        addProjectPage.getIsShowAnnouncementField().click();
        addProjectPage.getType(updateProject.getTypeOfProject()).click();
        addProjectPage.getIsCompletedField().click();
        addProjectPage.getAddProjectButton().click();
    }

    public void deleteProject(Project updateProject) {
        projectPage = new ProjectPage(driver);
        projectPage.getDeleteProjectButton(updateProject.getName()).click();
        projectPage.getDeleteAgree().click();
        projectPage.getAgreeButton().click();
    }
}
