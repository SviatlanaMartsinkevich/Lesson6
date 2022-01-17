package tests;

import baseEntities.BaseTest;
import core.ReadProperties;
import models.Projects;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddProjectPage;
import pages.DashboardPage;
import pages.LoginPage;
import pages.ProjectsPages;
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

        ProjectsPages projectsPages = new ProjectsPages(driver);

        Assert.assertTrue(projectsPages.().isDisplayed());


    }

    @Test
    public void loginTest() {
        User user = new User()
                .setEmail(ReadProperties.getUsername())
                .setPassword(ReadProperties.getPassword());

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(user);

        DashboardPage dashboardPage = new DashboardPage(driver);

        Assert.assertTrue(dashboardPage.getAddProjectButton().isDisplayed());
    }
}