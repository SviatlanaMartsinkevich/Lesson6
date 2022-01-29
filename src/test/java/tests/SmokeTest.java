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

    @Test(priority = 0)
    public void addProjectTest() throws InterruptedException {
        User user = new User()
                .setEmail(ReadProperties.getUsername())
                .setPassword(ReadProperties.getPassword());

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(user);

        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.getAddProjectButton().click();

        setupProjects();

        projectSteps.addNewProject(addProject);

        ProjectPage projectPage = new ProjectPage(driver);

        Assert.assertTrue(projectPage.findProject(addProject.getName()).isDisplayed());
    }

    @Test(priority = 1)
    public void updateProjectTest() throws InterruptedException {
        User user = new User()
                .setEmail(ReadProperties.getUsername())
                .setPassword(ReadProperties.getPassword());

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(user);

        AddProjectPage addProjectPage = new AddProjectPage(driver);
        DashboardPage dashboardPage = new DashboardPage(driver);
        OverviewPage overviewPage = new OverviewPage(driver);

        projectSteps.updateProject(addProject, updateProject);

        Assert.assertTrue(overviewPage.getMessage().isDisplayed());

        overviewPage.getReturnToDashboardButton().click();

        Assert.assertTrue(dashboardPage.getAddProjectButton().isDisplayed());
    }

    //  @Test
    public void deleteProjectTest() throws InterruptedException {
        User user = new User()
                .setEmail(ReadProperties.getUsername())
                .setPassword(ReadProperties.getPassword());

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(user);

        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.getAdministratorButton().click();

        AdministrationPage administrationPage = new AdministrationPage(driver);
        administrationPage.getProjectsNavigationButton().click();

//        dashboardPage.getProjectFind();
//        Thread.sleep(5000);
    }


    public void loginTest() {
        User user = new User()
                .setEmail(ReadProperties.getUsername())
                .setPassword(ReadProperties.getPassword());

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(user);

        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.getAdministratorButton().click();

        Assert.assertTrue(dashboardPage.getAddProjectButton().isDisplayed());
    }

    private void setupProjects() {
        addProject = new Project();
        addProject.setName(Randomization.getRandomString(8));
        addProject.setAnnouncement(Randomization.getRandomString(12));
        addProject.setTypeOfProject(Randomization.getRandomType());

        updateProject = new Project();
        updateProject.setName(Randomization.getRandomString(8));
        updateProject.setAnnouncement(Randomization.getRandomString(12));
        updateProject.setTypeOfProject(Randomization.getRandomType());
    }
}