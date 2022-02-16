package tests;

import baseEntities.BaseTest;
import core.ReadProperties;
import models.Milestone;
import models.Project;
import models.User;
import org.testng.annotations.Test;
import pages.*;
import steps.LoginStep;
import steps.MilestoneStep;
import steps.ProjectStep;
import utils.Randomization;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class SmokeTest extends BaseTest {
    Project addProject;
    Milestone addMilestone;
    Milestone updateMilestone;

    @Test
    public void addProjectTest() throws InterruptedException {
        open("/");

        User user = new User()
                .setEmail(ReadProperties.getUsername())
                .setPassword(ReadProperties.getPassword());

        LoginStep loginStep = new LoginStep();
        loginStep.login(user);

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.getAddProjectButton().click();

        addProjects();

        ProjectStep projectStep = new ProjectStep();
        projectStep.addNewProject(addProject);

        ProjectPage projectPage = new ProjectPage();
        projectPage.getFindProject(addProject.getName()).shouldBe(visible);

        projectPage.getReturnToDashboardPageButton().click();
    }

    @Test(dependsOnMethods = "addProjectTest")
    public void addMilestoneTest() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.getFindProject(addProject.getName()).click();

        addMilestones();
        MilestoneStep milestoneStep = new MilestoneStep();
        milestoneStep.addMilestone(addMilestone);

        MilestonePage milestonePage = new MilestonePage();
        milestonePage.getAddedMilestoneMessage().shouldBe(visible);

        OverviewPage overviewPage = new OverviewPage();
        overviewPage.getReturnToDashboardLink().click();
    }

    @Test (dependsOnMethods = "addMilestoneTest")
    public void updateMilestoneTest() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.getFindProject(addProject.getName()).click();

        updateMilestones();
        MilestoneStep milestoneStep = new MilestoneStep();
        milestoneStep.updateMilestone(addMilestone, updateMilestone);

        MilestoneViewPage milestoneViewPage = new MilestoneViewPage();
        milestoneViewPage.getMessageEditMilestone().shouldBe(visible);

        OverviewPage overviewPage = new OverviewPage();
        overviewPage.getReturnToDashboardLink().click();
    }

    @Test (dependsOnMethods = "updateMilestoneTest")
    public void deleteMilestoneTest() {
        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.getFindProject(addProject.getName()).click();

        MilestoneStep milestoneStep = new MilestoneStep();
        milestoneStep.deleteMilestone(updateMilestone);

        MilestonePage milestonePage = new MilestonePage();
        milestonePage.getDeletedMilestoneMessage().shouldBe(visible);

        OverviewPage overviewPage = new OverviewPage();
        overviewPage.getReturnToDashboardLink().click();
    }

    private void addProjects() {
        addProject = new Project();
        addProject.setName(Randomization.getRandomString(8));
        addProject.setAnnouncement(Randomization.getRandomString(12));
        addProject.setTypeOfProject(Randomization.getRandomType());
    }

    private void addMilestones() {
        addMilestone = new Milestone();
        addMilestone.setName(Randomization.getRandomString(8));
        addMilestone.setReferences(Randomization.getRandomString(12));
        addMilestone.setDescription(Randomization.getRandomString(10));
    }

    private void updateMilestones() {
        updateMilestone = new Milestone();
        updateMilestone.setName(Randomization.getRandomString(8));
        updateMilestone.setReferences(Randomization.getRandomString(12));
        updateMilestone.setDescription(Randomization.getRandomString(10));
    }
}