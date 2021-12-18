package tests;

import baseEntities.BaseTest;
import core.ReadProperties;
import org.testng.annotations.Test;
import pages.AddProjectPage;
import pages.DashboardPage;
import pages.LoginPage;

public class SmokeTest extends BaseTest {

    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(ReadProperties.getUsername(), ReadProperties.getPassword());

    }

    @Test
    public void addProjectTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(ReadProperties.getUsername(), ReadProperties.getPassword());

        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.addProject();

        AddProjectPage addProjectPage = new AddProjectPage(driver);
        addProjectPage.addNewProject(ReadProperties.getProjectName(), ReadProperties.getAnnouncement());

    }

    @Test
    public void findProjectTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(ReadProperties.getUsername(), ReadProperties.getPassword());

        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.findProject();
    }
}
