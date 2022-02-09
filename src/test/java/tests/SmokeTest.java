package tests;

import baseEntities.BaseTest;
import core.ReadProperties;
import models.Project;
import models.User;
import org.testng.annotations.Test;
import pages.*;
import utils.Randomization;

import static com.codeborne.selenide.Condition.visible;

public class SmokeTest extends BaseTest {
    Project addProject;

    @Test
    public void addProjectTest() throws InterruptedException {
        User user = new User()
                .setEmail(ReadProperties.getUsername())
                .setPassword(ReadProperties.getPassword());

        loginStep.login(user);

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.getAddProjectButton().click();

        addProjects();

        projectStep.addNewProject(addProject);

        ProjectPage projectPage = new ProjectPage();

        projectPage.getFindProject(addProject.getName()).shouldBe(visible);

        projectPage.getReturnToDashboardPageButton().click();
    }

    private void addProjects() {
        addProject = new Project();
        addProject.setName(Randomization.getRandomString(8));
        addProject.setAnnouncement(Randomization.getRandomString(12));
        addProject.setTypeOfProject(Randomization.getRandomType());
    }
}