package tests;

import baseEntities.BaseTest;
import core.ReadProperties;
import models.Project;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utils.Randomization;

public class SmokeTest extends BaseTest {
    Project addProject;
    Project updateProject;

    @Test
    public void addProjectTest() throws InterruptedException {
        User user = new User()
                .setEmail(ReadProperties.getUsername())
                .setPassword(ReadProperties.getPassword());

        loginStep.login(user);

        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.getAddProjectButton().click();

        addProjects();

        projectSteps.addNewProject(addProject);

        ProjectPage projectPage = new ProjectPage(driver);

        Assert.assertTrue(projectPage.getFindProject(addProject.getName()).isDisplayed());
        projectPage.getReturnToDashboardPageButton().click();
    }

    @Test(dependsOnMethods = "addProjectTest")
    public void updateProjectTest() throws InterruptedException {
        User user = new User()
                .setEmail(ReadProperties.getUsername())
                .setPassword(ReadProperties.getPassword());

        loginStep.login(user);

        setupProjects();
        projectSteps.updateProject(addProject, updateProject);

        OverviewPage overviewPage = new OverviewPage(driver);
        Assert.assertTrue(overviewPage.getMessage().isDisplayed());

        overviewPage.getReturnToDashboardButton().click();

        DashboardPage dashboardPage = new DashboardPage(driver);
        Assert.assertTrue(dashboardPage.getAddProjectButton().isDisplayed());
    }

    @Test(dependsOnMethods = "updateProjectTest")
    public void deleteProjectTest() throws InterruptedException {
        User user = new User()
                .setEmail(ReadProperties.getUsername())
                .setPassword(ReadProperties.getPassword());

        loginStep.login(user);

        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.getAdministratorButton().click();

        AdministrationPage administrationPage = new AdministrationPage(driver);
        administrationPage.getProjectsNavigationButton().click();

        projectSteps.deleteProject(updateProject);

        ProjectPage projectPage = new ProjectPage(driver);
        Assert.assertTrue(projectPage.getMessageProjectDeleted().isDisplayed());

        projectPage.getReturnToDashboardPageButton().click();
    }

    private void addProjects() {
        addProject = new Project();
        addProject.setName(Randomization.getRandomString(8));
        addProject.setAnnouncement(Randomization.getRandomString(12));
        addProject.setTypeOfProject(Randomization.getRandomType());
    }

    private void setupProjects() {
        updateProject = new Project();
        updateProject.setName(Randomization.getRandomString(8));
        updateProject.setAnnouncement(Randomization.getRandomString(12));
        updateProject.setTypeOfProject(Randomization.getRandomType());
    }
}