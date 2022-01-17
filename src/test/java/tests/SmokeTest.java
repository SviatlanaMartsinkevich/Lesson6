package tests;

import baseEntities.BaseTest;
import core.ReadProperties;
import models.Projects;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utils.Retry;

public class SmokeTest extends BaseTest {

    @Test
    public void addProjectTest() {
        User user = new User()
                .setEmail(ReadProperties.getUsername())
                .setPassword(ReadProperties.getPassword());

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(user);

        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.getAddProjectButton().click();

        Projects projects = new Projects()
                .setName(ReadProperties.getNameProject())
                .setComment(ReadProperties.getAnnouncement());

        AddProjectPage addProjectPage = new AddProjectPage(driver);
        addProjectPage.addProject(projects);

        Assert.assertTrue(dashboardPage.getProjectFind().isDisplayed());
    }

    @Test
    public void updateProjectTest() throws InterruptedException {
        User user = new User()
                .setEmail(ReadProperties.getUsername())
                .setPassword(ReadProperties.getPassword());

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(user);

        ViewProjectsPage viewProjectsPage = new ViewProjectsPage(driver);
        viewProjectsPage.findProject();
        viewProjectsPage.getEditButton().click();

        AddProjectPage addProjectPage = new AddProjectPage(driver);
        addProjectPage.changeProject();

        viewProjectsPage.getSaveProjectButton().click();
        Assert.assertTrue(viewProjectsPage.getMessage().isDisplayed());

        viewProjectsPage.getReturnToDashboard().click();

        DashboardPage dashboardPage = new DashboardPage(driver);
        Assert.assertTrue(dashboardPage.getAddProjectButton().isDisplayed());
    }

    @Test
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

        dashboardPage.getProjectFind();
        Thread.sleep(5000);
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
}